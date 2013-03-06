/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dpa1_factory2_fake_gui;

/**
 *
 * @author bazil
 */
public class Application {
    
    private GUIFactory factory;
    
    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void run()
    {
        Button btn = factory.createButton();
        btn.paint();
    }
}
