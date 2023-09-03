package logicadeprogramacao.variaveisECostantes;

import javax.swing.JOptionPane;

public class ComandoDeEntradaIG {

	public static void main(String[] args) {
	
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		
		//Integer.parseINT server para coverter dados String para uma variavel de numero inteiro
		JOptionPane.showMessageDialog(null, " ola " +nome+" você tem "+idade+" anos de idade");
		
	}
	
}
