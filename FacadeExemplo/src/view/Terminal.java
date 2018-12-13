package view;

/**
*
* @author H�rcules M. / Christian Silva
* 13/12/2018 15:17
*/

import java.util.Scanner;

public class Terminal {
	
	private static FacadeOperacoes facade;
	
	public static void main(String[] args)
	{
		facade = new FacadeOperacoes();
		int op;
		Scanner read = new Scanner(System.in);
		
		do {
			
			System.out.println("1. Transferir saldo");
			System.out.println("2. Visuatlizar saldos");
			System.out.println("3 . Sair");
			op = read.nextInt();
			
			if(op != 1 && op != 2 && op != 3)
			{
				System.out.println("Op��o inv�lida. Repita a opera��o!");
			}
		

			if(op == 1)
			{
				int c, benef;
				double valor;
				
				System.out.println("Conta: ");
				c = read.nextInt();
				
				System.out.println("Benefici�rio: ");
				benef = read.nextInt();
				
				System.out.println("Valor: ");
				valor = read.nextDouble();
				
				boolean resp = facade.transferir(c,  benef, valor);	
				if(!resp)
				{
					System.out.println("Falha na transfer�ncia: conta/benefici�rio incorretos ou saldo insuficiente!");
				}else
				{
					System.out.println("Transfer�ncia bem sucedida: " + valor);
				}
				
			}else if(op == 2) {
				System.out.println("N�mero da conta: ");
				int conta = read.nextInt();
				System.out.println("Saldo da conta: " + conta + " � de: " + facade.consultarSaldo(conta));
			}
		}while(op != 3);
	}
}
