package logicadeprogramacao.exerciciosModulo1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class E02 {
	public static void main(String[] args) {
		int idadeAnos =25, idadeMeses =10, idadeDias =2;
		
		double idadeSomenteEmDias = (idadeAnos *365) + (idadeMeses *30) + idadeDias;
		
		//System.out.println(idadeSomenteEmDias);
		
		LocalDate aniversario =LocalDate.of(1997,  10, 26);
		
		long dias = aniversario.until(LocalDate.now(), ChronoUnit.DAYS);
		
		System.out.println("Meu cálculo: "+idadeSomenteEmDias);
		System.out.println("Tempo Real: "+dias);
	}
}
