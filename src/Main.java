import Data.entity.Clients;
import service.ClientService;
import vue.ClientVue;
import vue.Vue;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Vue.setSc(sc);
        ClientService clientService = new ClientService();
        ClientVue clientVue = new ClientVue(clientService);
        while(true){
            switch (menu()){
                case 1:
                    Clients client=clientVue.saisieClient();
                    System.out.println(client.toString());
                    break;
                case 2:
                    clientVue.listerClients(clientService.getAllClients());
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Un monbre entre 1 et 3");
                    break;
            }
        }

    }

    public static int menu(){
        System.out.println("------MENU-------");
        System.out.println("1- Creer Client");
        System.out.println("2- lister Client");
        System.out.println("3- Quitter");
            int choice;
        while (true){
            try {
                choice=sc.nextInt();
                break;
            }catch (Exception e){
                System.out.println("erreur entre 1 et 2");
                sc.next();
                //choice=sc.nextInt();
            }
        }
        return choice;
    }
}