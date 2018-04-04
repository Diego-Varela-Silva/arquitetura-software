package repository;

import model.Pais;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toList;

public class PaisRepository {
    private static final Set<Pais> paises = new HashSet<>();

    public void save(Pais pais) throws Exception {
        if (paises.size() == 0) {
            pais.setId(1);
        } else {
            pais.setId(paises.size() + 1);
        }
        if (!paises.add(pais)) {
            throw new Exception("Pais já existe!");
        }
    }

    public void update(Pais pais, int id) {
        List<Pais> listaPais = paises.stream().map(c -> {
            if (c.getId() == id) {
                c = pais;
            }
            return c;
        }).collect(toList());

        paises.addAll(listaPais);
    }

    public void remove(int id) {
        List<Pais> listaPais = paises.stream().map(c -> {
            if (c.getId() == id) {
                c = null;
            }
            return c;
        }).filter(c -> c != null).collect(toList());
    }

    public Pais read(int id) {
        return paises.stream().filter(c -> c.getId() == id).collect(toList()).get(0);
    }

    public List<Pais> read() {
        return paises.stream().collect(toList());
    }


    public Collection<Pais> getAll() { return paises; }

}
