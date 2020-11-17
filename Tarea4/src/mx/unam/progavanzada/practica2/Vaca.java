package mx.unam.progavanzada.practica2;

public class Vaca extends Animal implements Herbivoro {

    @Override
    public void comunicar() {
        System.out.println("Muuuu, soy una vaca y como pasto");
    }
    
    @Override
    public void comerHierba() {
        System.out.println("Comiendo PASTO para dar leche!!");
    }
    
    @Override
    public void come() {
        this.comerHierba();
    }

}
