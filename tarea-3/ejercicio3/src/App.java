import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static int INITIAL_ACCOUNT = 10100;

    private static String getName(Scanner scanner) {
        boolean correct = false;
        String name = "";
        
        while (!correct) {
            System.out.print("Ingresa un nombre: ");
            name = scanner.nextLine();
    
            System.out.println("El sistema obtuvo el nombre: " + name);
            System.out.print("¿Es correcto? (S/N) - ");
            char correctChar = scanner.nextLine().charAt(0);
            while (correctChar != 'S' && correctChar != 's' && correctChar != 'N' && correctChar != 'n') {
                System.out.print("Solo introduce S/N - ");
                correctChar = scanner.nextLine().charAt(0);
            }
            correct = correctChar == 'S' || correctChar == 's';
        }

        return name;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        List<Cuenta> cuentas = new ArrayList<Cuenta>();
        cuentas.add(new Cuenta(getName(scanner), INITIAL_ACCOUNT + cuentas.size() + "", 500));
        cuentas.add(new Cuenta(getName(scanner), INITIAL_ACCOUNT + cuentas.size() + ""));
        System.out.println("--------------");
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta.toString());
            System.out.println("--------------");
        }
        cuentas.get(0).transferirDinero(cuentas.get(1), 200);
        System.out.println("--------------");
        System.out.println("Saldos actualizados");
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta.toString());
            System.out.println("--------------");
        }
        System.out.println("Ingresando $50 a la cuenta de " + cuentas.get(0).getOwner());
        cuentas.get(0).ingresarSaldo(50);
        System.out.println("--------------");
        System.out.println("Descontando $170 de la cuenta de " + cuentas.get(1).getOwner());
        cuentas.get(1).descontarSaldo(170);
        System.out.println("--------------");
        System.out.println("Creando 3 nuevas cuentas");
        cuentas.add(new Cuenta("Juan", INITIAL_ACCOUNT + cuentas.size() + ""));
        cuentas.add(new Cuenta("Tere", INITIAL_ACCOUNT + cuentas.size() + ""));
        cuentas.add(new Cuenta("David", INITIAL_ACCOUNT + cuentas.size() + ""));
        System.out.println("Ahora hay " + cuentas.size() + "cuentas, en total");
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta.toString());
            System.out.println("--------------");
        }

        scanner.close();
    }
}
