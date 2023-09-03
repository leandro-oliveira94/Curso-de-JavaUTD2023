package logicadeprogramacao.variaveisECostantes;

/*
 * 
 * Classe de apresentação de variaveis e constantes.

 * Autor: Osvaldo Souza
 * 
 * data: 21/08/2023
 * 
 * versão: 1.0
 * 
 **/

public class VariavesECostantes {

	public static void main(String[] args) {
		// binario 0 e 1
		byte   numeroInteiroByte = 100;
		short  numeroInteiroCurto= 15000;
		int    numeroInteiro = 2_123_456_789; //2.123.456.789
		long   numeroInteiroLongo = 1_234_567_890_2L;
		
		float  numeroRacional = 9.123456F, raio = 2;
		double numeroRacionalDePrecisaoDupla = 18.24681021416;
		
		char letra = 'A';  //armazena caracteres ou simbolos
		
		boolean verdadeiro = true; //valor logico
		
		final float VALOR_DO_PI = 3.14159265359f;// "final" usado para transformar uma varialvel em constante.
		float area =(float) (VALOR_DO_PI * Math.pow(raio, 2));
		
		System.out.println(" Hello World");
		
		System.out.println("Byte: "+numeroInteiroByte);
		
		System.out.println("Byte: "+numeroInteiroCurto);
	}
}
