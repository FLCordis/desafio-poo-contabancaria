package Banco.Contas.ContaCorrente;

import Banco.Cliente;
import Banco.Contas.Conta;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void extratoConta(){
        System.out.println("===EXTRATO DA CONTA CORRENTE===");
        super.extratoConta();
        System.out.println("===============================");
    }

}
