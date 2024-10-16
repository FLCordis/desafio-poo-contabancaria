package Banco.Contas.ContaPoupanca;

import Banco.Cliente;
import Banco.Contas.Conta;

public class ContaPoupanca extends Conta {
    // private static int Cp = 1;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void extratoConta(){
        System.out.println("===EXTRATO DA CONTA POUPANÇA===");
        super.extratoConta();
        System.out.println("===============================");
    }

}
