package mx.unam.pa;

public class BankAccount {

	private int amount = 50;

	public void discount() {
		int readAmount = amount;
		if (readAmount > 0) {
			complicatedBankStuff();
			amount--;
		}
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int m) {
		amount = m;
	}

	private void complicatedBankStuff() {
		int i = 0;
		double a = 5.0;
		while (i < Integer.MAX_VALUE) {
			a = a * 3.0;
			a = a / 3.0;
			i++;
		}
	}
}
