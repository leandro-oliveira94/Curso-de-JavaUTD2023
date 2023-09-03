package logicadeprogramacao.variaveisECostantes;

public class Operadores {

	public static void main(String[] args) {
		
		//Operadores unarios
		String nome = "UTD";

		int numero = 30;
		boolean verdadeiro = !true;
		System.out.println(numero+=10);
		//pós incremento ex:numero++
		//pre incremento ex ++numero
		//System.out.println(numero++)
		//numero+=10;
		// operador unario inversão logica ex;!
		
		//Operadores Aritiméticos
		//+ - * / %
		double expressao = 20 % 6 / 3  +3 * 4 - 10 + 1;
		
		double media = (10.0 + 9.0 + 8.0) / 3.0;
		System.out.println(media);
		
		//137 separar as casas decimais
		
		int numero09= 137;
		
		int unidade = numero09 % 10;
		
		int dezena =(numero09 % 100) / 10;
		
		int centena = numero09 /100;
		
		System.out.println("unidade: "+unidade);
		
		System.out.println("dezena: "+dezena);
		
		System.out.println("centena: "+centena);
       
		//System.out.println("unidade: "+unidade);
		
		//System.out.println("dezena: "+dezena);
		
		//System.out.println("centena: "+centena);
		
		//operadores relacionais - a resposta para os opeadores relacionai sempre será true
		// > >= < <= == !=
		
		boolean maiorQue = 74 >= 74;
		System.out.println(maiorQue);
		
		//operadores lógicos
	    //&& & || |
	    boolean proposicao = false & true & true & true & true;
	    
	    boolean proposicao02 = true|| true || true||true;
	  
	    boolean podeTirarCarteira = false;
	   
	    int idade = 15;
	    
	    boolean passouNaProva = true;
	    
	    podeTirarCarteira = idade >= 18 && passouNaProva;
	    
	    
	    System.out.println(podeTirarCarteira);
	    
	    //(proposicao lógica) ? (valor se verdadeiro) : (valor se falso);
	   
	   //operdor ternário;
	   
	   // estruturado operador ternario
	   // (prposição lógica) ? (valor se verdadeiro) : (valor se falso);
	    
	   String Ternario = idade > 18 && passouNaProva ? "Pode tirar a Carteira" : "Nao pode Tirar a carteira" ;
	   System.out.println(Ternario);
			   
	}
}
