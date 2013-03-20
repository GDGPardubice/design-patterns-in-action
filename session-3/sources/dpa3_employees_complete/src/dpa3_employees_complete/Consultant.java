
package dpa3_employees_complete;

public class Consultant {
    
    private String name;
    
    public Consultant(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void ShowMood()
    {
        System.out.println("I'm really happy consultant " + this.name + ".");
    }
    
}
