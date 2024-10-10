import java.util.Scanner;

public class Dividera {

    public static void divide() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange första talet: ");
        double tal1 = scanner.nextDouble();

        System.out.print("Ange andra talet: ");
        double tal2 = scanner.nextDouble();

        double resultat = tal1 / tal2;
        System.out.println("Resultatet är: " + resultat);

    }
}
