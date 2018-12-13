package model;

/**
*
* @author Hércules M. / Christian Silva
* 13/12/2018 15:17
*/

public class ContaCorrente {
	private String titular;
	private int numero;
	private double saldo;
	
	public ContaCorrente(String titular, int numero, double saldo)
	{
		this.titular = titular;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public boolean subtrairSaldo(double valor)
	{
		if(valor > saldo || valor < 0)
			return false;
		
		this.saldo -= valor;
		return true;
	}
	
	public void addSaldo(double valor)
	{
		if(valor < 0)
			return;
		
		saldo += valor;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
}
