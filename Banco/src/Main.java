public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("José", 1000.0,500.0);
        banco.exibirSaldo();
        banco.sacar(500.0);
        banco.exibirSaldo();
        banco.depositar(100.0);
        banco.exibirSaldo();
        banco.chequeEspecial(200);

    }
}

