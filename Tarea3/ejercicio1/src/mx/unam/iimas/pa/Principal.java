/**
 * Principal
 */
package mx.unam.iimas.pa;

public class Principal {
    public static void main(String[] args) {
        Arbol arbolUno = new Arbol();
        Arbol arbolDos = new Arbol("Eucalipto");
        Arbol arbolTres = new Arbol(3.58);
        Arbol arbolCuatro = new Arbol("Pino", 2.50);

        arbolUno.imprimirDescripcion();
        arbolDos.imprimirDescripcion();
        arbolTres.imprimirDescripcion();
        arbolCuatro.imprimirDescripcion();
    }

}