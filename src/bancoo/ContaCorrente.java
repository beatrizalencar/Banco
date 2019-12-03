package bancoo;

/**
 *
 * @author carol
 */
public class ContaCorrente extends ContaBancaria {

    private double taxaDeOperacao;
    private double saque;
    private double deposito;

    public double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }

    public void setTaxaDeOperacao(double taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    @Override

    public double sacar(double valor) {
        double descontar = taxaDeOperacao * valor;
        saldo = saldo - valor - descontar;
        this.setSaldo(saldo);
        return this.getSaldo();
    }

    @Override

    public double depositar(double deposito) {
        double descontar = taxaDeOperacao * deposito;
        saldo = saldo + deposito - descontar;
        this.setSaldo(saldo);
        return this.getSaldo();
    }
}
