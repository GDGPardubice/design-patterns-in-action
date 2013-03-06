/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dpa1_factory2_fake_gui;

/**
 *
 * @author bazil
 */
public class WinFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }
    
}
