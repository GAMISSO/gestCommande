package service;

import entity.Client;

public class ClientService {

    private Client[] TabClient=new Client[10];
    private int nbreClient;

    public ClientService(){
        nbreClient=0;
    };

    public Client[] getTabClient(){
        return TabClient;
    }
}
