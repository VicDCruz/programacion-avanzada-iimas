package mx.unam.pa;

public class DiscountThread extends Thread{
	private BankAccount cb;
	
	public DiscountThread(BankAccount inputCb) {
		cb = inputCb;
	}
	
	public void run() {
		cb.discount();
		processing = false;		
	}
	
	boolean processing = true;
	public boolean isProcessing() {
		return processing;
	}	
}
