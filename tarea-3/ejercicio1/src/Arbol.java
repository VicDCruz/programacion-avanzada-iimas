/**
 * Principal
 */

public class Arbol {
    private String tipo;
    private double altura;

    public Arbol() {
        this.tipo = "Genérico";
    }

    public Arbol(String tipo) {
        this.tipo = tipo;
    }

    public Arbol(double altura) {
        this.altura = altura;
    }

    public Arbol(String tipo, double altura) {
        this.tipo = tipo;
        this.altura = altura;
    }

    public void imprimirDescripcion() {
        System.out.println("Este es un árbol de tipo " + this.tipo + 
        " que mide " + this.altura + " metros.");
    }
}
