/**
 * TestPersona
 */

package mx.unam.iimas.pa;

public class TestPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        Persona persona2 = new Persona("Jose", 17);
        Persona persona3 = new Persona("Brenda", 28, 1.55f, 50.5f);
        Persona persona4 = new Persona("Andrés", "GAVA850531", 35, 1.75f, 85f);

        persona1.desplegarDatos();
        persona2.desplegarDatos();
        persona3.desplegarDatos();
        persona4.desplegarDatos();
        System.out.println("---------------------------\n");

        persona1.setEdad(25);
        persona1.setEstatura(1.90f);
        persona1.setPeso(64.8f);
        persona1.setRfc("FIMJ201021FM8");

        persona2.setEstatura(1.63f);
        persona2.setPeso(55.2f);
        persona2.setRfc("GOTJ201015LH2");

        persona3.setRfc("IEAB201015PFA");

        persona1.desplegarDatos();
        persona2.desplegarDatos();
        persona3.desplegarDatos();
        persona4.desplegarDatos();
        System.out.println("---------------------------\n");

        persona1.saluda();
        persona3.saluda();
        System.out.println("\n---------------------------");
        System.out.println("El RFC de " + persona4.getNombre() + 
                            " es " + persona4.getRfc());
    }
}
