package controller;

import model.ContaEspecial;
import model.ContaPoupanca;

public class Contas {

	public static void main(String[] args) {
		
		ContaPoupanca contaPoupanca = new ContaPoupanca("Rodrigo", 123, 456789, 1000.0, 15);
        System.out.println("Conta Poupança criada para Alice.");
        
        contaPoupanca.depositar(200.0);
        contaPoupanca.sacar(150.0);
        contaPoupanca.calcularNovoSaldo(1.0); 
        
        contaPoupanca.extrato();

        ContaEspecial contaEspecial = new ContaEspecial("Rodrigo", 124, 987654, 500.0, 300.0);
        System.out.println("\nConta Especial criada para Bob.");
        
        
        contaEspecial.depositar(300.0);
        contaEspecial.sacar(700.0); 
        contaEspecial.sacar(200.0); 
        
        contaEspecial.extrato();
    }

	}

