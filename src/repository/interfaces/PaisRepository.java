package repository.interfaces;

import model.Cliente;
import model.Pais;

import java.util.Collection;

public interface PaisRepository {
    public void save(Pais pais);
    public Collection<Pais> getAll();
}
