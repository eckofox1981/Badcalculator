import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""Välj funktion:\r
                        1. addera
                        2. substrahera
                        3. substrahera
                        4.dividera
                        5. avsluta
                        """);
        int choice = scanner.nextInt();
        boolean running = true;
        while (running) {
            switch (choice){
                case 1 -> add();
                case 2 -> substract();
                case 3 -> multiply();
                case 4 -> Dividera.divide();
                case 5 -> running = false;
            }
        }
    }
}
