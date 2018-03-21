package repository;

import model.Pais;
import repository.interfaces.PaisRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PaisRepositoryImpl implements PaisRepository {
    private Map<String, Pais> paises = new HashMap<>();

    public void save(Pais pais) {
        paises.put(pais.getNome(), pais);
    }

    public Collection<Pais> getAll() { return paises.values(); }

}
