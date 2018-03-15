public class Application {
    public static void main(String[] args) {
        Menu.cabecalho();
        while (true) {
            Menu.menu();
            Menu.selecionarOpcao(Teclado.getInt());
        }
    }
}
