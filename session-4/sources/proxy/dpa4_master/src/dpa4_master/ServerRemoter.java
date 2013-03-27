
package dpa4_master;

import java.io.OutputStream;
import java.io.PrintStream;

public class ServerRemoter {
    
    private MasterSystemClass msc;

    public ServerRemoter(String hostname) {
        this.msc = new MasterSystemClass(hostname);
    }
    
    public void shutdown() {
        PrintStream printStreamOriginal=System.out;
        System.setOut(new PrintStream(new OutputStream(){
                        @Override
			public void write(int b) {
			}
		}));
        msc.shutdown();
        System.setOut(printStreamOriginal);
        System.out.println("Úplně jiná hláška o vypnutí serveru.");
    }
            
    public void reboot() {
        PrintStream printStreamOriginal=System.out;
        System.setOut(new PrintStream(new OutputStream(){
                        @Override
			public void write(int b) {
			}
		}));
        msc.reboot();
        System.setOut(printStreamOriginal);
        System.out.println("Úplně jiná hláška o restartu serveru.");
    } 
}
