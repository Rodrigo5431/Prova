package model;

public abstract class ContaBancaria {

	private String cliente;
	private int numeroAgencia;
	private int numeroConta;
	double saldo;
	public ContaBancaria() {
		super();
	}
	public ContaBancaria(String cliente, int numeroAgencia, int numeroConta, double saldo) {
		super();
		this.cliente = cliente;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
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
	
	/*@Override
	public String toString() {
		return "ContaBancaria [cliente=" + cliente + ", numeroAgencia=" + numeroAgencia + ", numeroConta=" + numeroConta
				+ ", saldo=" + saldo + "]";
	
	}*/
	
	 public void depositar(double valor) {
	        saldo += valor;
	        System.out.println("Depósito efetuado. Saldo atual: " + saldo);
	    }
	 
	 public String sacar(double valor) {
	        if (saldo >= valor) {
	            saldo -= valor;
	            return "Saque efetuado no valor de " + valor + ". Saldo atual: " + saldo;
	        } else {
	            return "O saque não foi efetuado pois não há saldo suficiente.";
	        }	
	 }
	 
	  public void calcularNovoSaldo(double taxa) {
	        double novoSaldo = getSaldo() * (1 + taxa / 100);
	        setSaldo(novoSaldo);
	        System.out.println("Saldo atualizado. Saldo atual: " + getSaldo());
	    }
	  
	  
}
