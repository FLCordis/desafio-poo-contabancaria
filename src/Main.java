import Banco.Cliente;
import Banco.Contas.ContaCorrente.ContaCorrente;
import Banco.Contas.ContaPoupanca.ContaPoupanca;
import Banco.Contas.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Cliente conta01 = new Cliente();
        conta01.setNome("Flávio Cordis");

        Conta corrente01 = new ContaCorrente(conta01);
        Conta poupanca01 = new ContaPoupanca(conta01);

        corrente01.depositar(250);
        poupanca01.depositar(125);

        corrente01.extratoConta();        
        poupanca01.extratoConta();
        
        corrente01.transferir(25, poupanca01);

        poupanca01.extratoConta();

    }
}
