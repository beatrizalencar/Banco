package bancoo;

public abstract class ContaBancaria {

    private double numerodaconta;
    double saldo;

    public abstract double sacar(double valor);

    public abstract double depositar(double deposito);

    public double getNumerodaconta() {
        return numerodaconta;
    }

    public void setNumerodaconta(double numerodaconta) {
        this.numerodaconta = numerodaconta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
