package mx.unam.pa;

public class LlenaProcesadores implements Runnable{

	private static void complicatedBankStuff() {
		int i=0;
		double a=5.0;
		while (i<Integer.MAX_VALUE) {
			a = a * 3.0;
			a = a / 3.0;
			i++;
		}		
	}	
	
	public void run(){
		complicatedBankStuff();
	}
	
	public static void main(String args[]) {
		LlenaProcesadores ti = new LlenaProcesadores();
	    //new Thread(ti).start();	
	    complicatedBankStuff();
	    complicatedBankStuff();
	    System.out.println("Terminé");
	}

}
