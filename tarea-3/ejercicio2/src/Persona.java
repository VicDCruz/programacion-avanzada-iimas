/**
 * Persona
 */
public class Persona {

    private String rfc;
    private String name;
    private int age;
    private float height;
    private float weight;

    public Persona(String name) {
        this.name = name;
    }

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Persona(String name, int age, float height, float weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Persona(String name, String rfc, int age, float height, float weight) {
        this.name = name;
        this.rfc = rfc;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void desplegarDatos() {
        System.out.println("nombre = " + this.name + ", rfc = " + this.rfc + ", edad = " + this.age + ", estatura = "
                + this.height + ", peso = " + this.weight);
    }

    public int getEdad() {
        return age;
    }

    public void setEdad(int age) {
        this.age = age;
    }

    public float getEstatura() {
        return height;
    }

    public void setEstatura(float height) {
        this.height = height;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String name) {
        this.name = name;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public float getPeso() {
        return weight;
    }

    public void setPeso(float weight) {
        this.weight = weight;
    }

    public void saluda() {
        System.out.println("Hola! Mi nombre es " + this.name);
    }
}