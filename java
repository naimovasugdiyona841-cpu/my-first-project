import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ismingizni kiriting: ");
        String name = scanner.nextLine();

        System.out.print("Yoshingizni kiriting: ");
        int age = scanner.nextInt();

        System.out.println("\n--- Natija ---");
        System.out.println("Salom, " + name + "!");
        System.out.println("Siz " + age + " yoshdasiz.");

        if (age >= 18) {
            System.out.println("Siz voyaga yetgansiz.");
        } else {
            System.out.println("Siz hali voyaga yetmagansiz.");
        }

        scanner.close();
    }
}
