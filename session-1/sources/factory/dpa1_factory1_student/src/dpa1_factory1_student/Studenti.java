/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dpa1_factory1_student;

/**
 *
 * @author bazil
 */
public class Studenti {
    
    public static void test() {
        for(int i=1; i <= 6; i++) {
            System.out.println("--- Nový člověk ---");
            
            AStudent st = AStudent.getStudent();
            st.budicek();
            st.prace();
            st.volno();
            st.spanek();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        test();
    }
}
