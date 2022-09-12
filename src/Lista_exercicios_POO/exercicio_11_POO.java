package Lista_exercicios_POO;
//importando biblioteca de entrada de dados.
import java.util.Scanner;

public class exercicio_11_POO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaracao de variaveis.
		double r;
		double pi = 3.14159;
		double volume;
		Scanner S = new Scanner(System.in);
		
		//incio do programa.
		
				//entrada de dados.
				
				System.out.println("informe o raio: ");
				r = S.nextDouble();
				
			
				//processamento de dados.
				
				volume = (4/3) * pi * Math.pow(r, 3);
				
				//retorno dos dados.
				
				System.out.printf("VOLUME = %.3f%n", volume);
				
				//fim do programa.
	}

}

