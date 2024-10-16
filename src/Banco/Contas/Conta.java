package Banco.Contas;

import Banco.Cliente;

public class Conta implements InterfaceConta {

    private static int AGENCIA_PADRAO = 1;
    private static int CONTA_SEQ = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.conta = CONTA_SEQ++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, InterfaceConta contaDestino) {
       this.saldo -= valor;
       contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void extratoConta() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.getAgencia()));
        System.out.println(String.format("Conta: %d", this.getConta()));
        System.out.println(String.format("Saldo da Conta: R$%.2f", this.getSaldo()));
    }

}
