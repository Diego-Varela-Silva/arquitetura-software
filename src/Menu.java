import repository.interfaces.ClienteRepository;
import repository.ClienteRepositoryImpl;

import java.util.List;

public class Menu {
    private static ClienteRepository clienteRepository = new ClienteRepositoryImpl();

    public static void cabecalho() {
        String cabecalho = "Sistema de Cadastro de Cliente\n";
        System.out.println(cabecalho);
    }

    public static void menu() {
        String opcoes = "\n\n\n1 -> Inserir novo ciente\n";
        opcoes +=       "2 -> Listar cientes\n";
        opcoes +=       "0 -> Finalizar\n";
        System.out.println(opcoes);
        System.out.print("Escolha um opção: ");
    }

    public static void selecionarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                novoCliente();
                break;
            case 2:
                listarClientes();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Opção inválida");
        }
    }

    public static void novoCliente() {
        System.out.println("\n\n\n");
        Cliente cliente = new Cliente();
        System.out.println("\nNovo Cliente");
        System.out.print("Nome: ");
        cliente.setName(Teclado.getString());
        clienteRepository.save(cliente);
    }

    private static void listarClientes() {
        System.out.println("\n\n\n");
        List<Cliente> clientes = clienteRepository.getAll();
        System.out.println("Lista de Clientes\n");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println("Cliente " + (i + 1) + ": " + clientes.get(i).getName());
        }
    }

}
