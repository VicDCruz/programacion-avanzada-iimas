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
            System.out.print("Escribe un número: ");
            int n = getNumber(scanner);
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
                    System.out.println("Introduce coordenada en x [0, " + (n - 1) + "]: ");
                    int x = getNumber(scanner);
                    System.out.println("Introduce coordenada en y [0, " + (n - 1) + "]: ");
                    int y = getNumber(scanner);
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
