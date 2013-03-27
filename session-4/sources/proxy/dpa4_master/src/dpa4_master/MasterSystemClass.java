
package dpa4_master;

public class MasterSystemClass implements IProtection{
    
    private String hostname;
    private int port;
    private boolean connected = false;

    public MasterSystemClass() {
        this("www.google.com");
    }
    
    public MasterSystemClass(String hostname) {
        this(hostname, 22);
    }
    
    public MasterSystemClass(String hostname, int port) {
        this.hostname = hostname;
        this.port = port;
               
        System.out.println("Připojuji vzdálený server >> " + this.hostname + ":" + this.port + " << ...");
        System.out.println("Získávám všechna oprávnění >> " + this.hostname + ":" + this.port + " << ...");
        System.out.println("Ovládám celý server!");
        this.connected = true;
    }
    
    public void rm(String path) {
        System.out.println("Mažu cestu: " + path);
    }
    
    public void kill(String process) {
        System.out.println("Zabíjím proces: " + process);
    }
    
    public void touch(String filePath) {
        System.out.println("Dotýkám se souboru: " + filePath);
    }
    
    public void shutdown() {
        System.out.println("Vypínám server.");
        disconnect();
    }
    
    public void reboot() {
        System.out.println("Restartuji server.");
        disconnect();
    }
    
    public void disconnect() {
        System.out.println("Odpojuji se od serveru.");
        this.connected = false;
    }
    
}
