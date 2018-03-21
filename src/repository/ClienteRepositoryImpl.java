package repository;

import model.Cliente;
import repository.interfaces.ClienteRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClienteRepositoryImpl implements ClienteRepository {
    private Map<String, Cliente> clientes = new HashMap<>();

    public void save(Cliente cliente) {
        clientes.put(cliente.getName(), cliente);
    }

    public Collection<Cliente> getAll() { return clientes.values(); }

}
