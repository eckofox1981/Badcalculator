import java.util.Scanner;

public class Addera {

    public static void addition() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Ange första talet: ");
        double aAddition = userInput.nextDouble();

        System.out.println("Ange andra talet: ");
        double bAddition = userInput.nextDouble();

        double cAddition = aAddition + bAddition;
        System.out.println(aAddition + " + " + bAddition + " = " + cAddition);
    }
}
