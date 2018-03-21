package services;

import model.Cliente;

public class ClienteService {
    public boolean save(Cliente cliente) {
        if (cliente.getName().length() <)

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
