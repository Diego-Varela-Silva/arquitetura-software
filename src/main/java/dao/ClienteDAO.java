package dao;

import model.Cliente;
import repository.ClienteRepository;

import java.util.List;

public class ClienteDAO {
    public void criar(Cliente cliente) throws Exception {
        getClienteRepository().save(cliente);
    }

    public void alterar(Cliente cliente, int id) throws Exception {
        getClienteRepository().update(cliente, id);
    }

    public void excluir(int id) throws Exception {
        getClienteRepository().remove(id);
    }

    public Cliente ler(int id) {
        return getClienteRepository().read(id);
    }

    public List<Cliente> ler() {
        return getClienteRepository().read();
    }

    private ClienteRepository getClienteRepository() {
        return new ClienteRepository();
    }
}
