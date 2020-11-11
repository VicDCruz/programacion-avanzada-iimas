package mx.unam.progavanzada.practica2;

import java.util.Scanner;

public class Ejercicio11 {
    public static String trim(String text) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!Character.isWhitespace(c) && Character.isLetterOrDigit(c))
                output.append(c);
        }
        return output.toString();
    }

    public static boolean isPalindrome(String text) {
        text = trim(text.toLowerCase());
        for (int i = 0; i < text.length(); i++) {
            int j = text.length() - i - 1;
            if (text.charAt(i) != text.charAt(j))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("¿Quieres introducir tu propia cadena (S|s) o cargar unos ejemplos (N|n)? ");
            char response = scanner.nextLine().charAt(0);
            while (response != 'S' && response != 's' && response != 'N' && response != 'n') {
                System.out.print("Solo introduce S/N - ");
                response = scanner.nextLine().charAt(0);
            }
            if (response == 'S' || response == 's') {
                System.out.println("Introduce tu texto");
                String text = scanner.nextLine();
                System.out.println("Este texto " + (isPalindrome(text) ? "SÍ": "NO") + " es palíndromo");
            } else {
                System.out.println("somos o no somos: " + isPalindrome("somos o no somos"));
                System.out.println("s o m o s o n o s o m o s: " + isPalindrome("s o m o s o n o s o m o s"));
                System.out.println("s o mos o no so mo s: " + isPalindrome("s o mos o no so mo s"));
                System.out.println("Alli ves, Sevilla: " + isPalindrome("Alli ves, Sevilla"));
                System.out.println("Asi, Maria, raparas a Sara para ir a misa: "
                        + isPalindrome("Asi, Maria, raparas a Sara para ir a misa"));
            }
        } catch (Exception e) {
            System.err.println("Error inesperado!");
            e.printStackTrace();
        }
    }
}
