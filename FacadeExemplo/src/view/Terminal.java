package view;

/**
*
* @author Hércules M. / Christian Silva
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
				System.out.println("Opção inválida. Repita a operação!");
			}
		

			if(op == 1)
			{
				int c, benef;
				double valor;
				
				System.out.println("Conta: ");
				c = read.nextInt();
				
				System.out.println("Beneficiário: ");
				benef = read.nextInt();
				
				System.out.println("Valor: ");
				valor = read.nextDouble();
				
				boolean resp = facade.transferir(c,  benef, valor);	
				if(!resp)
				{
					System.out.println("Falha na transferência: conta/beneficiário incorretos ou saldo insuficiente!");
				}else
				{
					System.out.println("Transferência bem sucedida: " + valor);
				}
				
			}else if(op == 2) {
				System.out.println("Número da conta: ");
				int conta = read.nextInt();
				System.out.println("Saldo da conta: " + conta + " é de: " + facade.consultarSaldo(conta));
			}
		}while(op != 3);
	}
}
