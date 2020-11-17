package mx.unam.pa;

public class ImplementsRunnable implements Runnable{
static int cont=0;
	
	public void run(){
		int i=0;
		while (i<10000) {
			System.out.print(".");
			i++;
		}
	}
	
	public static void main(String args[]) {
		ImplementsRunnable ti = new ImplementsRunnable();
		int i=0;
	    new Thread(ti).start();	
	    while (i<10000) {
			System.out.print("*");
			i++;
		}
	}

}
