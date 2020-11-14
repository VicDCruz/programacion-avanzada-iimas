package mx.unam.progavanzada.practica2;

public class Caballo extends Animal implements Herbivoro{

    @Override
    public void comunicar() {
        System.out.println("Hola, soy un caballo!");
        this.comerHierba();
    }

    @Override
    public void comerHierba() {
        System.out.println("Comiendo PASTO del rancho");
    }
    
}
