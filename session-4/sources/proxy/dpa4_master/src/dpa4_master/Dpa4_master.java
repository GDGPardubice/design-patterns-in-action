
package dpa4_master;

public class Dpa4_master {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IProtection protect = new MasterSystemClass("www.upce.cz");
        protect.shutdown();
        
        ServerRemoter sr = new ServerRemoter("www.seznam.cz");
        sr.reboot();
    }
}
