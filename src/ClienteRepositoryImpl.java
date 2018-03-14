import java.util.ArrayList;
import java.util.List;

public class ClienteRepositoryImpl implements ClienteRepository {
    private List<Cliente> clientes = new ArrayList<>();

    public void save(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> getAll() {
        return clientes;
    }

}
