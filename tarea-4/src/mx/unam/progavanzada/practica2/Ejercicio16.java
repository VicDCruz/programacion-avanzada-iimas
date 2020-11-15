package mx.unam.progavanzada.practica2;

public class Ejercicio16 {
    public static void pedirAlimento(Animal a) {
        a.come();
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
        System.out.println("===== Observar alimentacion de animales =====");
        for (Animal animal : animales)
            pedirAlimento(animal);
    }
}
