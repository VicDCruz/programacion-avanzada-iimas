import java.util.Scanner;

public class App {
    private static int INITIAL_ACCOUNT = 10100;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean correct = false;
        Cuenta cuentas[] = new Cuenta[10];

        while (!correct) {
            System.out.print("Ingresa un nombre: ");
            String name = scanner.nextLine();

            System.out.println("El sistema obtuvo el nombre: " + name);
            System.out.print("¿Es correcto? (S/N) - " );
            char correctStr = scanner.nextLine().charAt(0);
            while (correctStr != 'S' && correctStr != 's' && 
                    correctStr != 'N' && correctStr != 'n') {
                System.out.print("Solo introduce S/N - ");
                correctStr = scanner.nextLine().charAt(0);
            }
            correct = correctStr == 'S' || correctStr == 's';
        }
        scanner.close();
    }
}
