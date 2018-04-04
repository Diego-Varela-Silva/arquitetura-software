package repository;

import model.Cliente;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ClienteRepository {
    private static final Set<Cliente> clientes = new HashSet<>();

    public void save(Cliente cliente) throws Exception {
        if (clientes.size() == 0) {
            cliente.setId() = 1;
        } else {
            cliente.setId();
        }
        if (clientes.add(cliente) == false) {
            throw new Exception("Cliente já existe!");
        }
    }

    public void update(Cliente cliente, int id) throws Exception {
        List<Cliente> listaCliente = clientes.stream().collect(Collectors.toList());
        listaCliente.set(id, cliente);
        clientes.addAll(listaCliente);
    }

    public void remove(Cliente cliente, int id) throws Exception {
        List<Cliente> listaCliente = clientes.stream().collect(Collectors.toList());
        listaCliente.set(id, cliente);
        clientes.remove(listaCliente);
    }

    public Collection<Cliente> getAll() { return clientes; }

}
