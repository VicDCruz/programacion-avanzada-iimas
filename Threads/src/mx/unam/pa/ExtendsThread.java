package mx.unam.pa;

public class ExtendsThread extends Thread{
	static int cont=0;
	
	public void run(){
		int i=0;
		while (i<10000) {
			System.out.print(".");
			i++;
		}
	}
	
	public static void main(String args[]) {
		ExtendsThread et = new ExtendsThread();
		int i=0;
	    et.start();
	    while (i<10000) {
			System.out.print("*");
			i++;
		}
	}

}
