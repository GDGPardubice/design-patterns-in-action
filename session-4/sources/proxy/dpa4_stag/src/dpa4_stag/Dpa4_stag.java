package dpa4_stag;

import java.util.Scanner;

public class Dpa4_stag {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte nazev budovy (napr. CA): ");
        String inBudova = sc.nextLine();
        System.out.print("Zadejte nazev mistnosti (napr. PC101): ");
        String inMistnost = sc.nextLine();
        
        StagClient client = new StagClient();
        
        String output = client.getMistnostInfo(inBudova, inMistnost);
        
        System.out.println(output);
    }
}
