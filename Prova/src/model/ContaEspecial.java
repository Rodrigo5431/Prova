package model;

public class ContaEspecial extends ContaBancaria {

	private double limite;

	public ContaEspecial() {
		super();
	}

	public ContaEspecial(double limite) {
		super();
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
    public void sacar(double valor) {
        double saldoComLimite = getSaldo() + limite;
        if (saldoComLimite >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
	
	@Override
    public void extrato() {
        System.out.println("Exibindo extrato...");
}
