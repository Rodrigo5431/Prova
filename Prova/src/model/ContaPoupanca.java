package model;

public class ContaPoupanca extends ContaBancaria implements Conta {

	private int diaDeRendimento;

	
	

	public ContaPoupanca(String cliente, int numeroAgencia, int numeroConta, double saldo, int diaDeRendimento) {
		super(cliente, numeroAgencia, numeroConta, saldo);
		this.diaDeRendimento = diaDeRendimento;
	}



	public int getDiaDeRendimento() {
		return diaDeRendimento;
	}



	public void setDiaDeRendimento(int diaDeRendimento) {
		this.diaDeRendimento = diaDeRendimento;
	}
	
	public void calcularNovoSaldo(double taxa) {
        double novoSaldo = getSaldo() * (1 + taxa / 100);
        setSaldo(novoSaldo);
        transacoes.add("Atualização de saldo com taxa: " + taxa + "%, Novo Saldo: " + getSaldo());
        System.out.println("Saldo atualizado. Saldo atual: " + getSaldo());
    }

    @Override
    public void depositar(double deposito) {
        super.depositar(deposito);
        transacoes.add("Depósito na Conta Poupança: +" + deposito + ", Saldo: " + getSaldo());
    }

    @Override
    public void sacar(double saque) {
        System.out.println("Quanto você deseja sacar?");
        saque = leiaDouble.nextDouble();
        if (getSaldo() >= saque) {
            setSaldo(getSaldo() - saque);
            transacoes.add("Saque na Conta Poupança: -" + saque + ", Saldo: " + getSaldo());
            System.out.println("Saque de R$" + saque + " realizado com sucesso. Seu saldo atual é R$" + getSaldo());
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    @Override
    public void extrato() {
        System.out.println("Extrato da Conta Poupança:");
        super.extrato();
        System.out.println("Dia de Rendimento: " + diaDeRendimento);
    }
}
