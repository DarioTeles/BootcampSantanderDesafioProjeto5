package darioteles.github.io;

public class Main {
    public static void main(String[] args) {
        IConta conta1 = new ContaPoupanca(new Cliente("Cliente 1"));
        conta1.depositar(100.00);
        conta1.imprimirExtrato();

        IConta conta2 = new ContaCorrente(new Cliente("Cliente 1"));
        conta2.imprimirExtrato();

        IConta conta3 = new ContaPoupanca(new Cliente("Cliente 2"));
        conta3.imprimirExtrato();

        conta1.transferir(100.00, (Conta) conta2);
        conta2.imprimirExtrato();
    }
}
