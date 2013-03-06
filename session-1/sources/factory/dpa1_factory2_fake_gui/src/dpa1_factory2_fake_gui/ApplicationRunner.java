/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dpa1_factory2_fake_gui;

/**
 *
 * @author bazil
 */
public class ApplicationRunner {

    public enum OSType {
        WIN, UNIX;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application application = new Application(createOSSpecificFactory());
        
        application.run();
    }
    
    public static GUIFactory createOSSpecificFactory()
    {
        //read from OS info or config file
        OSType os = OSType.UNIX;
        
        switch(os) {
            case WIN: return new WinFactory();
            case UNIX: return new UnixFactory();
            default: throw new RuntimeException("Unknown OS type. I cannot run the App.");
        }
        
    }
}
