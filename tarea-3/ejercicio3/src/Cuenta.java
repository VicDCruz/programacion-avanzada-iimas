/**
 * Cuenta
 */
public class Cuenta {

    private String owner;
    // No haremos operaciones matemáticas,
    // solo es una cadena representativa
    private String accountNumber;
    private double money;

    /**
     * Cuenta
     * 
     * @param owner
     * @param accountNumber
     */
    public Cuenta(String owner, String accountNumber) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.money = 0;
    }

    /**
     * Cuenta
     * 
     * @param owner
     * @param accountNumber
     * @param money
     */
    public Cuenta(String owner, String accountNumber, double money) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.money = money;
    }

    /**
     * 
     * @return
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * 
     * @param accountNumber
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * 
     * @return
     */
    public double getMoney() {
        return money;
    }

    /**
     * 
     * @param money
     */
    public void setMoney(double money) {
        this.money = money;
    }

    /**
     * 
     * @return
     */
    public String getOwner() {
        return owner;
    }

    /**
     * 
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * 
     * @param money
     */
    public void ingresarSaldo(double money) {
        this.money += money;
    }

    /**
     * 
     * @param money
     */
    public void descontarSaldo(double money) {
        if (this.money >= money)
            this.money -= money;
        else
            System.out.println("Fondos insuficientes");
    }

    /**
     * 
     * @param other
     * @param transfer
     */
    public void transferirDinero(Cuenta other, double transfer) {
        System.out.println("Verificando datos...");
        System.out.println("Transfiriendo dinero de la cuenta de " + this.owner + " a " + other.getOwner());
        if (this.money >= transfer) {
            this.money -= transfer;
            other.ingresarSaldo(transfer);
            System.out.println("Dinero transferido! " + this.owner + ", tu nuevo saldo es de $" + this.money);
        } else
            System.out.println("No hay dinero suficiente para transferir a esta cuenta");
    }

    @Override
    public String toString() {
        return "|Propietario: " + this.owner + "\t" + "Número de cuenta: " + this.accountNumber + "\t\t" + "Dinero: $"
                + this.money + "|";
    }
}