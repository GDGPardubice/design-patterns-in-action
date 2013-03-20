/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dpa3_employees_complete;

/**
 *
 * @author bazil
 */
public class HappyEmployeeAdapter extends Employee implements IEmployee {
    
    public HappyEmployeeAdapter(String name) {
        super(name);
    }
    
    @Override
    public void ShowHappines() {
        System.out.println("I'm really happy employee " + getName() + ".");
    }
    
}
