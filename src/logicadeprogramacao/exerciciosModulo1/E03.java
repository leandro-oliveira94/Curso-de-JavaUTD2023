package logicadeprogramacao.exerciciosModulo1;

import java.util.Scanner;

// exercicio de media de uma aluno

public class E03 {
	public static void main(String[] argn ) {
	 
		Scanner leitor = new Scanner(System.in);
		
	System.out.println("digite a primeira nota");
	Double nota01 = leitor.nextDouble();
	
	System.out.println("digite a segunda nota");
	Double nota02 = leitor.nextDouble();
	
	System.out.println("digite a segunda nota");
	Double nota03 = leitor.nextDouble();
	
	int peso01 = 4, peso02 = 5, peso03 = 6, somaPesos = peso01 + peso02 + peso03;
	
	double MediaPonderada = (nota01 * peso01 + nota02 * peso02 +nota03 * peso03) / somaPesos;
	
	String resultado = MediaPonderada >= 6 ? "Aprovado" : "Reprovado" ;
	
	System.out.println(resultado+ " nota: "+MediaPonderada );
	
 }
}