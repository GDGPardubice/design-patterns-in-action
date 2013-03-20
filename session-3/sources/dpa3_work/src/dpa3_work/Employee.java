
package dpa3_work;

public class Employee implements IEmployee {
    
    private String name;
    
    public Employee(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    @Override
    public void ShowHappines() {
        System.out.println("I'm " + this.name + " and everything is in normal.");
    }

}
