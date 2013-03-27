package simplerestclient;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

/**
 * Ukazkovy REST klient webovych sluzeb nad IS/STAG. Neobsahuje parsovani
 * vystupniho XML, pouze jej vypise. Vola sluzbu pro ziskani informace o
 * nejake zadane mistnosti. Trida si necha zadat nazev budovy a mistnosti
 * jako vstup ze standardniho vstupu.
 * <p/>
 * Otestovano na JDK 1.6.
 * <p/>
 * User: Konzerva
 * Date: 9.5.2008
 * Time: 16:34:08
 */
public class SimpleRestClient {

    /**
     * Adresa serveru Webovych sluzeb
     */
    public static final String WS_SERVER_URL = "https://stag-ws.upce.cz/ws/services";

    /**
     * Adresa sluzby v ramci adresy serveru
     */
    public static final String WS_SERVICE_PATH = "/rest/mistnost/getMistnostiInfo";

    private String budova;

    private String cisloMistnosti;

    public SimpleRestClient(String budova, String cisloMistnosti) {
        this.budova = budova;
        this.cisloMistnosti = cisloMistnosti;
    }

    public static void main(String[] args) throws Exception {

        /* Nainstaluji si pomocnou tridu, ktera "veri" vsem ssl certifikatum,
           abych nemusel pro spusteni tohoto prikladu instalovat certifikaty serveru
         */
        SSLContext context = SSLContext.getInstance("SSL");
        context.init(null, trustAllCerts, new java.security.SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(context.getSocketFactory());

        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte nazev budovy (napr. UL): ");
        String inBudova = sc.nextLine();
        System.out.print("Zadejte nazev mistnosti (napr. 409): ");
        String inMistnost = sc.nextLine();
        SimpleRestClient client = new SimpleRestClient(inBudova, inMistnost);
        client.getInfo();
    }

    public void getInfo() throws Exception {

        String target = WS_SERVER_URL + WS_SERVICE_PATH + "?zkrBudovy=" + URLEncoder.encode(budova,
                                                                                            "UTF-8") + "&cisloMistnosti=" + URLEncoder.encode(
                cisloMistnosti, "UTF-8");
        URL url = new URL(target);
        HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
        httpConnection.setConnectTimeout(5000);
        httpConnection.setRequestMethod("GET");
        httpConnection.setInstanceFollowRedirects(false);
        httpConnection.setUseCaches(false);
        httpConnection.setDoOutput(true);
        httpConnection.setDoInput(true);

        httpConnection.connect();

        int responseCode = httpConnection.getResponseCode();

        InputStream inputStream;
        if (responseCode == 200) {
            inputStream = httpConnection.getInputStream();
        } else {
            inputStream = httpConnection.getErrorStream();
            if (inputStream == null) {
                System.out.println("Nastala chyba: " + httpConnection.getResponseMessage());
                return;
            }
        }

        /* s webservicama zasadne v UTF-8 */
        InputStreamReader reader = new InputStreamReader(inputStream, "UTF-8");
        StringWriter wr = new StringWriter();
        copyReaderToWriter(reader, wr);

        System.out.println("Ziskane XML:\n" + wr.getBuffer().toString());

    }

    public static long copyReaderToWriter(Reader reader, Writer writer) throws IOException {

        long pocet = 0;
        int count;
        char[] buffer = new char[8192];
        while ((count = reader.read(buffer, 0, 8192)) != -1) {
            writer.write(buffer, 0, count);
            pocet += count;
        }
        return pocet;

    }

    static TrustManager[] trustAllCerts = new TrustManager[]{
        new X509TrustManager() {
            @Override
            public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                return null;
            }
            @Override
            public void checkClientTrusted(
                java.security.cert.X509Certificate[] certs, String authType) {
            }
            @Override
            public void checkServerTrusted(
                java.security.cert.X509Certificate[] certs, String authType) {
            }
        }
    };

}