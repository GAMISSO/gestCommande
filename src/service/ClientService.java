package service;

import entity.Client;

public class ClientService {

    private Client[] TabClient=new Client[10];
    private int nbreClient;

    public ClientService(){
        nbreClient=0;
    };

    public boolean ajouterClient(Client client){
        if(nbreClient<TabClient.length){
            TabClient[nbreClient]=client;
            return true;
        }
        return false;
    }

    public Client[] getTabClient(){
        return TabClient;
    }
}
