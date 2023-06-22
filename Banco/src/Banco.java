public class Banco {
    private String nomeCliente;
    private double saldo;
    private double saldoCheque;
    public Banco(String nomeCliente, double saldoInicial,double saldoCheque) {
        this.nomeCliente = nomeCliente;
        this.saldo = saldoInicial;
        this.saldoCheque =saldoCheque;
    }
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }
    public void chequeEspecial(double valor) {
        if (valor<=saldoCheque) {
            saldoCheque -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            System.out.println("Saldo atual do cheque sepecial: "+saldoCheque);
        } else {
            System.out.println("Você atingiu o valor limite do seu cheque especial.");
        }
    }
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}
