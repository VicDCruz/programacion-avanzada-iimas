/**
 * Persona
 */
public class Persona {

    private String rfc;
    private String name;
    private int age;
    private float height;
    private float weight;

    /**
     * Constructor que inicializa los valores de nombre
     * @param name  Nombre de la persona
     */
    public Persona(String name) {
        this.name = name;
    }

    /**
     * Constructor que inicializa los valores de nombre y edad
     * @param name  Nombre de la persona
     * @param age   Edad de la persona
     */
    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Constructor que inicializa los valores de
     * nombre, edad, altura y peso
     * @param name      Nombre de la persona
     * @param age       Edad de la persona
     * @param height    Altura de la persona
     * @param weight    Peso de la persona
     */
    public Persona(String name, int age, float height, float weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Constructor que inicializa los valores de
     * nombre, rfc, edad, altura y peso
     * @param name      Nombre de la persona
     * @param rfc       RFC de la persona
     * @param age       Edad de la persona
     * @param height    Altura de la persona
     * @param weight    Peso de la persona
     */
    public Persona(String name, String rfc, int age, float height, float weight) {
        this.name = name;
        this.rfc = rfc;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Imprimir la información correspondiente a la persona, con
     * todos sus atributos obtenidos (o no) del constructor o de
     * los getters y setters
     */
    public void desplegarDatos() {
        System.out.println("nombre = " + this.name + ", rfc = " + this.rfc + ", edad = " + this.age + ", estatura = "
                + this.height + ", peso = " + this.weight);
    }

    /**
     * Obtener la edad de una persona
     * @return  Edad de la persona
     */
    public int getEdad() {
        return age;
    }

    /**
     * Poner un nuevo valor
     * @param age   Nueva edad que tendrá la Persona
     */
    public void setEdad(int age) {
        this.age = age;
    }

    /**
     * Obtener la altura de una persona
     * @return  Altura de la persona
     */
    public float getEstatura() {
        return height;
    }

    /**
     * Poner un nuevo valor
     * @param height   Nueva altura que tendrá la Persona
     */
    public void setEstatura(float height) {
        this.height = height;
    }

    /**
     * Obtener el nombre de una persona
     * @return  Nombre de la persona
     */
    public String getNombre() {
        return name;
    }

    /**
     * Poner un nuevo valor
     * @param name   Nuevo nombre que tendrá la Persona
     */
    public void setNombre(String name) {
        this.name = name;
    }

    /**
     * Obtener el RFC de una persona
     * @return  RFC de la persona
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Poner un nuevo valor
     * @param rfc   Nuevo RFC que tendrá la Persona
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * Obtener el peso de una persona
     * @return  Peso de la persona
     */
    public float getPeso() {
        return weight;
    }

    /**
     * Poner un nuevo valor
     * @param weight   Nuevo peso que tendrá la Persona
     */
    public void setPeso(float weight) {
        this.weight = weight;
    }

    /**
     * Imprimir el nombre de la Persona de una forma
     * amigable con el usuario.
     */
    public void saluda() {
        System.out.println("Hola! Mi nombre es " + this.name);
    }
}