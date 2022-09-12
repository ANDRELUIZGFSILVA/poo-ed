package Lista_exercicios_POO;
//importando biblioteca de entrada de dados.

import java.util.Scanner;

public class exercicio_15_POO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaracao de variaveis.
		
		double x1 , y1 , x2 , y2;
		double distancia;
		
		Scanner S = new Scanner(System.in);
		
		//incio do programa.
		
				//entrada de dados.
				
				System.out.println("insira o primeiro valor do primeiro ponto: ");
				x1 = S.nextDouble();
				System.out.println("insira o segundo valor do primeiro ponto: ");
			    y1 = S.nextDouble();
			    System.out.println("insira o primeiro valor do segundo ponto: ");
				x2 = S.nextDouble();
				System.out.println("insira o segundo valor do segundo ponto: ");
			    y2 = S.nextDouble();
				
				//processamento de dados.
				
				distancia = Math.sqrt(Math.pow(x2 - x1 , 2) + Math.pow(y2 - y1, 2));
				
				//retorno dos dados.
				
				System.out.printf("%.4f%n", distancia);
				
				//fim do programa.
	}

}

