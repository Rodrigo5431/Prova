package model;

public class ContaPoupanca extends ContaBancaria {

	private int diaDeRendimento;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(int diaDeRendimento) {
		super();
		this.diaDeRendimento = diaDeRendimento;
	}

	public int getDiaDeRendimento() {
		return diaDeRendimento;
	}

	public void setDiaDeRendimento(int diaDeRendimento) {
		this.diaDeRendimento = diaDeRendimento;
	}

	@Override
	public String toString() {
		return "ContaPoupanca [diaDeRendimento=" + diaDeRendimento + ", toString()=" + super.toString() + "]";
	}
	
	
}
