
package dpa3_employees_complete;

import java.util.ArrayList;
import java.util.List;

public class Dpa3_employees_complete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<IEmployee> list = new ArrayList<>();
        list.add(new Employee("Vojta"));
        list.add(new Employee("Jirka"));
        list.add(new Employee("Honza"));
        
        list.add(new EmployeeAdapter("Tomáš"));
        list.add(new HappyEmployeeAdapter("Karel"));
        
        ShowHappines(list);
    }
    
    public static void ShowHappines(List<IEmployee> list) {
        for(IEmployee e: list){
            e.ShowHappines();
        }
    }
}
