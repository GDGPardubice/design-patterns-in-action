
package dpa3_work;

import static dpa3_work.Dpa3_work.ShowHappines;
import java.util.List;

public class Dpa3_work {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CeskyList list = new CeskyList(); //třeba použít ArrayList()
        list.pridej(new Employee("Vojta"));
        list.pridej(new Employee("Jirka"));
        list.pridej(new Employee("Honza"));
        
        
        ShowHappines(list);
    }
    
    public static void ShowHappines(List<IEmployee> list) {
        for(IEmployee e: list){
            e.ShowHappines();
        }
    }
}