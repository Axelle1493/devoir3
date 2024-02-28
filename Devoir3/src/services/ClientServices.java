package services;
import java.util.List;
import entities.Client;
import repositories.ClientRepository;


public class ClientServices {
    private ClientRepository clientRepository=new ClientRepository();
    public void ajouterClient(Client client){
        clientRepository.insertClient(client);
    }
    public List<Client> listerClients(){
          return   clientRepository.getAllClients();
    }
      
}