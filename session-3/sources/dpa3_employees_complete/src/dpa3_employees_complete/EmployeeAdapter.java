/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dpa3_employees_complete;

/**
 *
 * @author bazil
 */
public class EmployeeAdapter extends Consultant implements IEmployee{
    
    public EmployeeAdapter(String name) {
        super(name);
    }

    @Override
    public void ShowHappines() {
        ShowMood();
    }
    
}
