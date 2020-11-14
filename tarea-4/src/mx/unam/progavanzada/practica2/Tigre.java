package mx.unam.progavanzada.practica2;

public class Tigre extends Animal implements Carnivoro {

    @Override
    public void comunicar() {
        System.out.println("Y aquí estoy, siendo un tigre!");
        this.comerCarne();
    }

    @Override
    public void comerCarne() {
        System.out.println("Me comeré a un HUMANO!");
    }
    
}
