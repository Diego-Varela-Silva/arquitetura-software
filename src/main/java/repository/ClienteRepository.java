package repository;

import model.Cliente;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ClienteRepository {
    private static final Set<Cliente> clientes = new HashSet<>();

    public void save(Cliente cliente) throws Exception {
        if (clientes.add(cliente) == false) {
            throw new Exception("Cliente já existe!");
        }
    }

    public Collection<Cliente> getAll() { return clientes; }

}
