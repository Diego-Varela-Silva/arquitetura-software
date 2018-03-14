import java.util.Scanner;

public class Teclado {
    public static Scanner scanner = new Scanner(System.in);

    public static Integer getInt() {
        while (!scanner.hasNextInt()) scanner.next();
        return scanner.nextInt();
    }

    public static String getString() {
        return scanner.next();
    }
}
