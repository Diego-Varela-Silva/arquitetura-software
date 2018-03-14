import java.util.List;

public interface ClienteRepository {
    public void save(Cliente cliente);
    public List<Cliente> getAll();
}
