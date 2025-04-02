package vue;

import Data.entity.Clients;
import service.ClientService;

import java.util.List;

public class ClientVue extends Vue {
    private ClientService clientService;

    public ClientVue(){

    }

    public ClientVue(ClientService clientService) {
        this.clientService = clientService;
    }

    public Clients saisieClient(){
        Clients clients = new Clients();
        clientService.saveClient( clients );
        return clients;
    }

    public void listerClients(List<Clients> clients){
        for (int i = 0; i <clients.size() ; i++) {
            System.out.println(clients.get(i).toString());
        }
    }
}
