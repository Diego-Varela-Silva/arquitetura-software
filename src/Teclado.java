import java.util.Scanner;

public class Teclado {
    public static Scanner scanner = new Scanner(System.in);

    public static Integer getInt() {
        System.out.println("Escolha um opção: ");
        while (!scanner.hasNextInt()) scanner.next();
        return scanner.nextInt();
    }
}
