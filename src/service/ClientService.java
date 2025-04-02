package service;

import Data.entity.Clients;

import java.util.ArrayList;
import java.util.List;

public class ClientService {

    private List<Clients> clients=new ArrayList<>();


    public Clients saveClient(Clients client){
        client.setId(clients.size()+1);//incrémentaion de l'id
        clients.add(client);//Ajout du Client dans la base de donné
        return client;//retourner le client
    }

    public List<Clients> getAllClients(){
        return clients;
    }

    public Clients getClientByTelephone(String telephone){
        for(int i=0;i<clients.size();i++){
            if(clients.get(i).getTelephone().compareTo(telephone)==0){
                return clients.get(i);
            }
        }
        return null;
    }
}
