package mx.unam.progavanzada.practica2;

import java.util.Scanner;

public class Ejercicio13 {
    public static int[][] generateMatrix(int n) {
        int [][] output = new int[n][n];
        int count = 0;
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                output[x][y] = count;
                count++;
            }
        }
        return output;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.print("[ ");
            for (int i = 0; i < row.length; i++)
                System.out.print(row[i] + ((i + 1 < row.length) ? ",\t" : ""));
            System.out.println(" ]");
        }
    }

    public static int getNumber(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Esto no es un número, intenta de nuevo: ");
            scanner.next();
        }
        double output = scanner.nextDouble();
        if (output != Math.rint(output))
            System.out.println("El número no es entero, se truncará a " + (int) output);
        return (int) output;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = 0;
            while (n <= 0) {
                System.out.print("Escribe un número (> 0): ");
                n = getNumber(scanner);
            }
            int[][] m = generateMatrix(n);
            System.out.println("Se generó un matrix de " + n + " x " + n + " dimensiones");
            printMatrix(m);
        } catch (Exception e) {
            System.err.println("Error inesperado!");
            e.printStackTrace();
        }
    }
}
