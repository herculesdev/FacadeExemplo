package model;

/**
*
* @author Hércules M. / Christian Silva
* 13/12/2018 15:17
*/


import java.util.ArrayList;

public class Banco {
	private ArrayList<ContaCorrente> contas;
	
	public Banco()
	{
		contas = new ArrayList<ContaCorrente>();
		contas.add(new ContaCorrente("Hércules M.", 3202, 1200));
		contas.add(new ContaCorrente("Christian S.", 3303, 1300));
	}
	
	public ContaCorrente buscarConta(int numero)
	{
		for(int i = 0; i < contas.size(); i++)
		{
			if(contas.get(i).getNumero() == numero)
				return contas.get(i);
		}
		
		return null;
	}
}
