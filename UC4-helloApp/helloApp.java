import java.util.Scanner;

public class helloApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            name = "World";
        }

        System.out.println("Hello " + name + "!");
        scanner.close();
    }
}
