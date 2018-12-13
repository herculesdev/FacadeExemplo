package view;

/**
*
* @author Hércules M. / Christian Silva
* 13/12/2018 15:17
*/

import dao.*;
import model.*;

public class FacadeOperacoes {
	
	private DAOContaCorrente daoConta;
	Banco banco;
	
	public FacadeOperacoes()
	{
		daoConta = new DAOContaCorrente();
		banco = new Banco();		
		
	}
	
	public boolean transferir(int numConta, int numBenef, double valor)
	{
		ContaCorrente conta = banco.buscarConta(numConta);
		ContaCorrente beneficiario = banco.buscarConta(numBenef);
		
		return daoConta.transferir(conta,  beneficiario, valor);
	}
	
	public double consultarSaldo(int conta)
	{
		ContaCorrente c = banco.buscarConta(conta);
		if(c == null)
			return 0;
		
		return c.getSaldo();
	}
	
	
}
