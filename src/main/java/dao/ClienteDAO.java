package dao;

import model.Cliente;
import repository.ClienteRepository;

public class ClienteDAO {
    public void criar(Cliente cliente) throws Exception {
        ClienteRepository clienteRepository = new ClienteRepository();
        clienteRepository.save(cliente);
    }

    public void alterar(Cliente cliente, int id) throws Exception {
        ClienteRepository clienteRepository = new ClienteRepository();
        clienteRepository.update(cliente, id);
    }

    public void excluir(Cliente cliente, int id) throws Exception {
        ClienteRepository clienteRepository = new ClienteRepository();
        clienteRepository.(cliente, id);
    }
}
