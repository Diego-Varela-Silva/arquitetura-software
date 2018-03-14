public class Menu {
    private static ClienteRepository clienteRepository = new ClienteRepositoryImpl();

    public static void cabecalho() {
        String cabecalho = "Sistema de Cadastro de Cliente\n";
        System.out.println(cabecalho);
    }

    public static void menu() {
        String opcoes = "1 -> Inserir novo ciente\n";
        opcoes +=       "2 -> Listar cientes";
        opcoes +=       "0 -> Finalizar";
        System.out.print("Escolha um opção: ");
    }

    public static void novoCliente() {
        Cliente cliente = new Cliente();
        System.out.print("Nome: ");
        cliente.setName(Teclado.getString());
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
                menu();

        }
    }
}
