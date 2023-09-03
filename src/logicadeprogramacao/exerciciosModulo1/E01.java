package logicadeprogramacao.exerciciosModulo1;

public class E01 {
		//d = V(x2 - x1)² + (y2 - y1)²
		// V= raiz quadrada
		//x2² - 2*x2*x1 + x1²
		//x²
		public static void main(String[] args) {
			int x1=-5,x2=6, y1=3,y2=5;
			
			// d = V (6 - (-5))² + (5 - 3) ²
			// d = V (6 +5) ² + 2²
			// d = V 11² + 2
			// d = V 121 +2
			// d = V (v= raiz quadrada) de 123
			// d = 11,18
			//squarerootr(raiz quadrada)
			
			double quadradoDaDiferenca01 = (Math.pow(x2,2) - 2*x2*x1 + Math.pow(x1, 2));
			
			double quadradoDaDiferenca02 = (Math.pow(y2,2) - 2*y2*y1 + Math.pow(y1, 2));
			
			double resposta01 =Math.sqrt(quadradoDaDiferenca01 + quadradoDaDiferenca02);
			
			double resposta02 =Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
			
			//System.out.printf("%.2f",resposta01);
			System.out.printf("%.2f",resposta02);
			
			
			
			
			
		} 
			
		
}
