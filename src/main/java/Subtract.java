import java.util.Scanner;

public class Subtract {


    public static void subtract(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("first number:");
        int first = scanner.nextInt();
        System.out.println("second number:");
        int second = scanner.nextInt();
        int result = first -second;

        System.out.println("=847");
        System.out.println("Just kidding " + first + " - " + second + "=" + result);

    }
}
