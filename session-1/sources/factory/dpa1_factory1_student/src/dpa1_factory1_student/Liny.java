/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dpa1_factory1_student;

/**
 *
 * @author bazil
 */
class Liny extends AStudent {
    
    public Liny()
    {
        System.out.println("Jsem líný:");
    }

    @Override
    public void budicek() {
        System.out.println("Pozdě vstávám");
    }

    @Override
    public void prace() {
        System.out.println("Pomalu pracuji");     
    }

    @Override
    public void volno() {
        System.out.println("Odcházím spát");
    }

    @Override
    public void spanek() {
        System.out.println("Stále spím");
    }

    
}
