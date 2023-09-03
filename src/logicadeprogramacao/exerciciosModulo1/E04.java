package logicadeprogramacao.exerciciosModulo1;

import java.util.Scanner;

/*
  * Dona maria foi comprar uma bolsa. As formas de pagamento que eram oferercidas
  * foram:
  * 
  *  a. A vista com 10% de desconto
  *  b. Parcelado em 1+2 vezes sem desconto
  *  c. Dividido em 10 vezes com jurros de 5% sobre o valor total
 * */
public class E04 {
	
	public static void main(String[] argn ) {
	 
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("Digite o valor  do Produto");
		
	double valor = leitor.nextDouble();
	
	double aVista = valor - (valor * 0.1);
	
	double Parcelado03 = valor, parcela03 = valor / 3;
	
	double Parcelado10 = valor + (valor*0.05), parcela10 = Parcelado10/10;
	
	System.out.println("á vista: "+aVista+" uma parcela: "+aVista);
	
	System.out.printf("parcelado em três: %.2f três Parcelas: %.2f\n1",Parcelado03, parcela03);
	
	System.out.println("parcelado em dez: "+Parcelado10+ " dez parcelas: "+parcela10);
 }
}
