package repository;

import model.Cliente;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class ClienteRepository {
    private static final Set<Cliente> clientes = new HashSet<>();

    public void save(Cliente cliente) throws Exception {
        cliente.setId(clientes.size() + 1);
        if (!clientes.add(cliente)) {
            throw new Exception("Cliente já existe!");
        }
    }

    public void update(Cliente cliente, int id) {
        List<Cliente> listaCliente = clientes.stream().map(c -> {
            if (c.getId() == id) {
                c = cliente;
            }
            return c;
        }).collect(toList());

        clientes.addAll(listaCliente);
    }

    public void remove(int id) {
        List<Cliente> listaCliente = clientes.stream().map(c -> {
            if (c.getId() == id) {
                c = null;
            }
            return c;
        }).filter(c -> c != null).collect(toList());
    }

    public Cliente read(int id) {
        return clientes.stream().filter(c -> c.getId() == id).collect(toList()).get(0);
    }

    public List<Cliente> read() {
        return clientes.stream().collect(toList());
    }


    public Collection<Cliente> getAll() { return clientes; }

}
