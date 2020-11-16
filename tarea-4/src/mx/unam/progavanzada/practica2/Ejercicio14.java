package mx.unam.progavanzada.practica2;

import java.util.Scanner;

public class Ejercicio14 extends Ejercicio13 {
    public static int[][] changeCell(int[][] matrix, int x, int y, int value) {
        System.out.println(value);
        if ((x < 0 || x >= matrix.length) || (y < 0 || y >= matrix[0].length)) {
            System.err.println("Rangos no coinciden con la matriz");
            return matrix;
        }
        matrix[y][x] = value;
        return matrix;
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
            System.out.print("¿Quieres cambiar algún valor? (S/N) ");
            char response = scanner.next().charAt(0);
            while (response != 'S' && response != 's' && response != 'N' && response != 'n') {
                System.out.print("Solo introduce S/N - ");
                response = scanner.next().charAt(0);
            }
            do {
                if (response == 'S' || response == 's') {
                    int x = -1;
                    while (x < 0 || x >= n) {
                        System.out.println("Introduce coordenada en x [0, " + (n - 1) + "]: ");
                        x = getNumber(scanner);
                    }
                    int y = -1;
                    while (y < 0 || y >= n) {
                        System.out.println("Introduce coordenada en y [0, " + (n - 1) + "]: ");
                        y = getNumber(scanner);
                    }
                    System.out.println("Introduce el nuevo valor: ");
                    int value = getNumber(scanner);
                    m = changeCell(m, x, y, value);
                    System.out.println("Valores actuales de la matriz");
                    printMatrix(m);
                    System.out.print("¿Quieres cambiar algún otro valor? (S/N) ");
                    response = scanner.next().charAt(0);
                    while (response != 'S' && response != 's' && response != 'N' && response != 'n') {
                        System.out.print("Solo introduce S/N - ");
                        response = scanner.next().charAt(0);
                    }
                }
            } while (response == 'S' || response == 's');
        } catch (Exception e) {
            System.err.println("Error inesperado!");
            e.printStackTrace();
        }
    }
}
