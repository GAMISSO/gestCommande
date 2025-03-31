package vue;

import entity.Client;

public class ClientVue extends Vue {

    public Client saisieClient(){
        Client client=new Client();
        client.setNom(saisieChampOblig("Nom"));
        client.setPrenom(saisieChampOblig("Prenom"));
        client.setTelephone(saisieEntierOblig("Telephone"));
        return client;
    }

    public void listerClients(Client[] clients){
        for (int i = 0; i<clients.length; i++){
            System.out.println(clients[i].toChaine());
        }
    }
}
