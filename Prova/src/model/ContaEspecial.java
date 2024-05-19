package model;

public class ContaEspecial extends ContaBancaria implements Conta {

	private double limite = 300.00;

	
	public ContaEspecial(String cliente, int numeroAgencia, int numeroConta, double saldo, double limite) {
		super(cliente, numeroAgencia, numeroConta, saldo);
		this.limite = limite;
	}
	

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
    public void sacar(double saque) {
        System.out.println("Quanto você deseja sacar?");
        saque = leiaDouble.nextDouble();
        double saldoComLimite = getSaldo() + limite;
        if (saldoComLimite >= saque) {
            setSaldo(getSaldo() - saque);
            
            transacoes.add("Saque: -" + saque + ", Saldo: " + getSaldo() + " (com limite)");
            System.out.println("Saque de R$" + saque + " realizado com sucesso. Seu saldo atual com limite é R$" + getSaldo());
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void extrato() {
        System.out.println("Extrato da Conta Especial:");
        super.extrato();
        System.out.println("Limite disponível: " + limite);
    }
}
