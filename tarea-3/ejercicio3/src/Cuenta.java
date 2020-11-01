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
     * Constructor que inicializa los valores de nombre del dueño y número de cuenta
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
     * Constructor que inicializa los valores de nombre del dueño, número de cuenta
     * y la cantidad inicial de dinero en la cuenta
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
     * Obtener el número de cuenta que identifica a la cuenta
     * 
     * @return Número de cuenta
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Poner un nuevo valor
     * 
     * @param accountNumber Número de cuenta
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Obtener el dinero total acumulado en la cuenta
     * 
     * @return Dinero actual en la cuenta
     */
    public double getMoney() {
        return money;
    }

    /**
     * Obtener el nombre del dueño de la cuenta
     * 
     * @return Nombre del dueño
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Poner un nuevo valor
     * 
     * @param owner Nombre del dueño
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Incrementar el dinero de la cuenta
     * 
     * @param money Cantidad de dinero entrante
     */
    public void ingresarSaldo(double money) {
        this.money += money;
    }

    /**
     * Decrementar el dinero de la cuenta
     * 
     * @param money Cantidad de dinero saliente
     */
    public void descontarSaldo(double money) {
        if (this.money >= money)
            this.money -= money;
        else
            System.out.println("Fondos insuficientes");
    }

    /**
     * Realizar una transferencia de dinero entre dos cuentas
     * 
     * @param other    Nueva cuenta a la que se le transferirá el dinero
     * @param transfer Dinero que será transferido de esta cuenta a la otra
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