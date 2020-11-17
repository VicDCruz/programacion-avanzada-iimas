package mx.unam.progavanzada.practica2;

/**
 * El nombre de esta clase no fue del todo claro
 * La instrucción inicial de todos los ejercicios de la parte de
 * códigos menciona que debe usarse el formato EjercicioX.java
 * y contiene el método main. Aunque para este ejercicio, se menciona
 * que se le llame Principal
 */
public class Principal {
    public static void hablarConAnimal(Animal a) {
        a.comunicar();
    }

    public static void main(String[] args) {
        Animal[] animales = new Animal[15];
        System.out.println("===== Poblando granja de animales =====");
        for (int i = 0; i < animales.length; i++) {
            int r = (int) (Math.random() * 3);
            switch (r) {
                case 0:
                    System.out.println("Añadiendo a un CABALLO a la lista");
                    animales[i] = new Caballo();
                    break;
                case 1:
                    System.out.println("Añadiendo a un TIGRE a la lista");
                    animales[i] = new Tigre();
                    break;
                case 2:
                    System.out.println("Añadiendo a una VACA a la lista");
                    animales[i] = new Vaca();
                    break;
                default:
                    break;
            }
        }
        System.out.println("===== Comunicándose con los animales =====");
        for (Animal animal : animales)
            hablarConAnimal(animal);
    }
}
