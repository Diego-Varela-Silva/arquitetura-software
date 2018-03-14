public class Menu {
    private static ClienteRepository clienteRepository = new ClienteRepositoryImpl();

    public static void cabecalho() {
        String opcoes = "1 -> Inserir novo usuário\n";
        opcoes +=       "2 -> Listar usuários";

    }

    public static void selecionarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                novoUsuario();
            case 2:
                listarUsuarios();
            default:
                System.out.println("Opção inválida");
                main();
        }
    }
}
