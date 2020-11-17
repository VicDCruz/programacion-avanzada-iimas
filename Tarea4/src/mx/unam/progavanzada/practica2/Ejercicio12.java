package mx.unam.progavanzada.practica2;

import java.util.Scanner;

public class Ejercicio12 {
    public static String changeFormat(String text) {
        StringBuilder output = new StringBuilder();
        boolean change = true;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!Character.isWhitespace(c)) {
                if (change)
                    output.append(Character.toUpperCase(c));
                else
                    output.append(Character.toLowerCase(c));
                change = !change;
            } else {
                change = true;
                output.append(c);
            }
        }
        return output.toString();
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
                System.out.println("Resultado: " + changeFormat(text));
            } else {
                System.out.println("ejemplo: " + changeFormat("ejemplo"));
                System.out.println("esta es una frase muy larga: " + changeFormat("esta es una frase muy larga"));
                System.out.println("hola mundo: " + changeFormat("hola mundo"));
                System.out.println("me gusta el cereal: " + changeFormat("me gusta el cereal"));
                System.out.println("DETESTO LOS LUNES: " + changeFormat("DETESTO LOS LUNES"));
                System.out.println("Mi nombre es Juanito: " + changeFormat("Mi nombre es Juanito"));
                System.out.println("I couldnt repair your brakes so I made your horn louder: "
                        + changeFormat("I couldnt repair your brakes so I made your horn louder"));
            }
        } catch (Exception e) {
            System.err.println("Error inesperado!");
            e.printStackTrace();
        }
    }
}
