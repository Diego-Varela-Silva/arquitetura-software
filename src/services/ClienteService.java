package services;

import model.Cliente;

public class ClienteService {
    public Collection<String> isValid(Cliente cliente) {
        ArrayList<String> erros = new ArrayList<>();
        if (cliente.getName().length() < 5) {
            erros.add("Nome menor que 5 caracteres.");
        }
        if (cliente.getPais() == null || cliente.getPais() == "") {
            erros.add("País não pode ficar em branco.");
        }
        return erros;
    }
    public void save(Cliente cliente) {
        if (cliente.getIdade() < 18) {
            cliente.setLimiteCredito(100);
        } else if (cliente.getIdade() <= 35) {
            cliente.setLimiteCredito(300);
        } else {
            cliente.setLimiteCredito(500);
        }

        if (cliente.getPais().getNome() == "Brasil") {
            cliente.setLimiteCredito(cliente.getLimiteCredito() + 100);
        }
    }
}
