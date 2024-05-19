package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class ContaBancaria implements Conta{

	private String cliente;
	private int numeroAgencia;
	private int numeroConta;
	double saldo = 500.00;
	
	Scanner leiaDouble = new Scanner(System.in);
	
	
	public ContaBancaria(String cliente, int numeroAgencia, int numeroConta, double saldo) {
		super();
		this.cliente = cliente;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}

	
	protected List<String> transacoes = new ArrayList<>();
	
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	public void depositar(double deposito) {
        System.out.println("Quanto deseja depositar?");
        deposito = leiaDouble.nextDouble();
        saldo += deposito;
 
        transacoes.add("Depósito: +" + deposito + ", Saldo: " + saldo);
        System.out.println("Depósito efetuado. Saldo atual: " + saldo);
    }

    public void sacar(double saque) {
        System.out.println("Quanto você deseja sacar?");
        saque = leiaDouble.nextDouble();
        if (saldo >= saque) {
            saldo = saldo - saque;
       
            transacoes.add("Saque: -" + saque + ", Saldo: " + saldo);
            System.out.println("Saque efetuado no valor de " + saque + ". Saldo atual: " + saldo);
        } else {
            System.out.println("O saque não foi efetuado pois não há saldo suficiente.");
        }
    }

    @Override
    public void extrato() {
        System.out.println("Extrato da Conta:");
        for (String transacao : transacoes) {
            System.out.println(transacao);
        }
        System.out.println("Saldo atual: " + saldo);
    }
	 
	  
	  
	  
}
