package dao;

/**
*
* @author Hércules M. / Christian Silva
* 13/12/2018 15:17
*/


import model.*;

public class DAOContaCorrente {
	
	public boolean transferir(ContaCorrente conta, ContaCorrente beneficiario, double valor)
	{
		if(conta == null || beneficiario == null)
			return false;
		
		if(conta.subtrairSaldo(valor))
		{
			beneficiario.addSaldo(valor);
			return true;
		}
		
		return false;
	}
	
	
}
