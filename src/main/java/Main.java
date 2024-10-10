import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean running = true;
        while (running) {
            System.out.println("""
                        Välj funktion:
                        1. addera
                        2. substrahera
                        3. multiplicera
                        4. dividera
                        5. avsluta
                        """);
            int choice = scanner.nextInt();
            switch (choice){
                case 1: Addera.addition();
                break;
                case 2: Subtract.subtract();
                break;
                case 3: TimFunction.multiply();
                break;
                case 4: Dividera.divide();
                break;
                case 5: running = false;
                break;
                default: System.out.println("Try again");
                break;
            }
        }
    }
}
