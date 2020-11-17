package mx.unam.pa;

public class ThreadExecute {
	
	private final static int NOTHREADS=10000;
	public static void main(String[] args) {
		BankAccount cb=new BankAccount();
		int i=0;
		DiscountThread[] arrayThreads = new DiscountThread[NOTHREADS];
				
		//Instanciar hilos
		while (i<NOTHREADS) {
			arrayThreads[i] = new DiscountThread(cb);
			i++;
		}
		
		//Iniciar su ejecución	
		i=0;
		while (i<NOTHREADS) {
			arrayThreads[i].start();
			i++;
		}
		
		boolean processing=true;
		//Preguntarles si ya terminaron
		while (processing) {
			processing = false;
            for (i = 0; i < NOTHREADS; i++) {
                if (arrayThreads[i].isProcessing()) { 
                	processing = true;
                }
            }try {
            	Thread.sleep(1000);
            } catch (InterruptedException e) {
            	System.err.println();
            }
		}
		
		//Ver cómo nos afectaron
		System.out.println(cb.getAmount());
		
	}

}
