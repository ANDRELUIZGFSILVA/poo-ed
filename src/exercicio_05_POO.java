//importando biblioteca de entrada de dados.
import java.util.Scanner;

public class exercicio_05_POO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaracao de variaveis.
		double A;
		double B;
		double MEDIA;
		Scanner S = new Scanner(System.in);
		
		//incio do programa.
		
				//entrada de dados.
				
				System.out.println("insira a primeira nota: ");
				A = S.nextDouble();
				System.out.println("insira a segunda nota: ");
			    B = S.nextDouble();
				
				//processamento de dados.
				
				MEDIA = ( (A * 3.5) + (B * 7.5)) / 11.0;
				
				//retorno dos dados.
				
				System.out.printf("MEDIA = %.5f%n", MEDIA);
				
				//fim do programa.
	}

}
