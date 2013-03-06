/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dpa1_factory2_fake_gui;

/**
 *
 * @author bazil
 */
public class WinButton implements Button {

    @Override
    public void paint() {
        System.out.println("Já jsem tlačítko pro Windows.");
    }
    
}
