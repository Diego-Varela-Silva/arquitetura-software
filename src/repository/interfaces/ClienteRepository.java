package repository.interfaces;

import model.Cliente;

import java.util.Collection;

public interface ClienteRepository {
    public void save(Cliente cliente);
    public Collection<Cliente> getAll();
}
