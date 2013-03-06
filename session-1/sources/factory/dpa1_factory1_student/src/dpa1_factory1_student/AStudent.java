/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dpa1_factory1_student;

/**
 *
 * @author bazil
 */
abstract public class AStudent {
    
    private static int index = 0;
    
    public static AStudent getStudent() {
        switch (index++ % 3) {
            case 0: return new Pilny();
            case 1: return new Alkoholik();
            case 2: return new Liny();
            default: throw new RuntimeException("Špatně definované maximum.");
        }
    }
    
    abstract public void budicek();
    abstract public void prace();
    abstract public void volno();
    abstract public void spanek();
    
}
