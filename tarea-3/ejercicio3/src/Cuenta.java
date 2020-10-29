/**
 * Cuenta
 */
public class Cuenta {

    private String owner;
    // No haremos operaciones matemáticas, 
    // solo es una cadena representativa
    private String accountNumber;
    private double money;

    public Cuenta(String owner, String accountNumber) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.money = 0;
    }

    public Cuenta(String owner, String accountNumber, double money) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}