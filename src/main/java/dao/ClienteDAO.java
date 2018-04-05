package dao;

import model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {
    public void criar(Cliente cliente) throws Exception {
//        getClienteRepository().save(cliente);
    }

    public void alterar(Cliente cliente, int id) throws Exception {
//        getClienteRepository().update(cliente, id);
    }

    public void excluir(int id) throws Exception {
//        getClienteRepository().remove(id);
    }

    public Cliente ler(int id) {
//        return getClienteRepository().read(id);
        return new Cliente();
    }

    public List<Cliente> ler() {
//        return getClienteRepository().read();
        return new ArrayList<Cliente>();
    }
}
