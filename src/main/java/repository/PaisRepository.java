package repository;

import java.util.Collection;
import model.Pais;

import java.util.HashSet;
import java.util.Set;

public class PaisRepository {
    private static final Set<Pais> PAISES = new HashSet<>();

    public void save(Pais pais) {
        PAISES.add(pais);
    }

    public Collection<Pais> getAll() { return PAISES; }

}
