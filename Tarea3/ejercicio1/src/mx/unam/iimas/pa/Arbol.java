/**
 * Principal
 */

package mx.unam.iimas.pa;

public class Arbol {
    private String tipo;
    private double altura;

    /**
     * Constructor sin argumentos para crear un objeto árbol de tipo Genérico
     */
    public Arbol() {
        this.tipo = "Genérico";
    }

    /**
     * Crear un objeto árbol con un tipo específico
     * 
     * @param tipo Variante específica de un árbol
     */
    public Arbol(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Crear un objeto dado una altura específica
     * 
     * @param altura Metros totales que tiene un árbol de altura
     */
    public Arbol(double altura) {
        this.altura = altura;
    }

    /**
     * Crear un objeto dado una altura específica y su tipo
     * 
     * @param tipo   Variante específica de un árbol
     * @param altura Metros totales que tiene un árbol de altura
     */
    public Arbol(String tipo, double altura) {
        this.tipo = tipo;
        this.altura = altura;
    }

    /**
     * Despliega la información específica de un árbol. Su tipo y su altura
     */
    public void imprimirDescripcion() {
        System.out.println("Este es un árbol de tipo " + this.tipo + " que mide " + this.altura + " metros.");
    }
}
