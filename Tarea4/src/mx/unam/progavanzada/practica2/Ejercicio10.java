package mx.unam.progavanzada.practica2;

import java.util.Scanner;

public class Ejercicio10 {
    public static double mean(double[] numbers) {
        double output = 0.0;
        for (double number : numbers)
            output += number;
        return output / numbers.length;
    }

    public static double getNumber(Scanner scanner) {
        double output = 0;
        while (!scanner.hasNextDouble()) {
            System.out.print("Escribe un número: ");
            scanner.next();
        }
        output = scanner.nextDouble();
        return output;
    }

    public static int getLength(Scanner scanner) {
        double n = 0;
        while (n <= 0) {
            System.out.print("Cantidad de números a promediar (> 0): ");
            n = getNumber(scanner);
        }
        int output = (int) n;
        if (n != Math.rint(n))
            System.out.println("El número no es entero, se truncará a " + output);
        return output;
    }

    public static void getNumbers(double[] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Escribe el " + (i + 1) + "° elemento: ");
            array[i] = getNumber(scanner);
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] numbers = new double[getLength(scanner)];
            getNumbers(numbers, scanner);
            System.out.println("El promedio para " + numbers.length + " números es: " + mean(numbers));
        } catch (Exception e) {
            System.err.println("Error inesperado!");
            e.printStackTrace();
        }
    }
}
