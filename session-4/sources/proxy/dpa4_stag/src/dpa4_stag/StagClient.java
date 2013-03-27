/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dpa4_stag;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 *
 * @author bazil
 */
public class StagClient {
    /**
     * Adresa serveru Webovych sluzeb
     */
    private static final String WS_SERVER_URL = "https://stag-ws.upce.cz/ws/services";
    
    private Map ws_service_map = new HashMap();
    
    public StagClient() throws NoSuchAlgorithmException, KeyManagementException {
        ws_service_map.put("MistnostInfo", "/rest/mistnost/getMistnostiInfo");
        
        
        /* Nainstaluji si pomocnou tridu, ktera "veri" vsem ssl certifikatum,
           abych nemusel pro spusteni tohoto prikladu instalovat certifikaty serveru
         */
        SSLContext context = SSLContext.getInstance("SSL");
        context.init(null, trustAllCerts, new java.security.SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(context.getSocketFactory());
        
        
    }
    
    public String getMistnostInfo(String budova, String mistnost) throws UnsupportedEncodingException, MalformedURLException, IOException {
        String target = WS_SERVER_URL + ws_service_map.get("MistnostInfo") + "?zkrBudovy=" + URLEncoder.encode(budova, "UTF-8") + "&cisloMistnosti=" + URLEncoder.encode(mistnost, "UTF-8");
        
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
            }
        }
        
        /* s webservicama zasadne v UTF-8 */
        InputStreamReader reader = new InputStreamReader(inputStream, "UTF-8");
        StringWriter wr = new StringWriter();
        copyReaderToWriter(reader, wr);

        return wr.getBuffer().toString();
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
