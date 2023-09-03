package logicadeprogramacao.variaveisECostantes;

import java.util.Scanner;

public class ComandoDeEntradaComScanner {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
	
		System.out.println("digite seu nome");
		
		String nome = leitor.next();
		
		System.out.println("digite sua idade");
		
		int idade = leitor.nextInt();
		
		System.out.println("ola "+nome+" você tem " +idade+ " anos de idade");
		
		
	}
	
}
