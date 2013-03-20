
package dpa3_employees;

import static dpa3_employees.Dpa3_employees.ShowHappines;
import java.util.ArrayList;
import java.util.List;

public class Dpa3_employees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<IEmployee> list = new ArrayList<>();
        list.add(new Employee("Vojta"));
        list.add(new Employee("Jirka"));
        list.add(new Employee("Honza"));
        
        
        ShowHappines(list);
    }
    
    public static void ShowHappines(List<IEmployee> list) {
        for(IEmployee e: list){
            e.ShowHappines();
        }
    }
}
