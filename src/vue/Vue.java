package vue;

import java.util.Scanner;

public class Vue {
     protected Scanner sc=new Scanner(System.in);
    protected String saisieChampOblig(String message){
        String result;
        while(true){
            System.out.print(message);
            result = sc.nextLine();
            if (result==null || result.equals("")){
                System.out.println("Le champ oblige est vide !");
            }
            else {
                return result;
            }
        }
    }

    protected int saisieEntierOblig(String message){
        int result;
        while(true){
            System.out.print(message);
            result = sc.nextInt();
            if (result<=0){
                System.out.println("Le champ oblige est vide !");
            }
            else {
                return result;
            }
        }
    }
}
