package Lista_exercicios_POO;
//importando biblioteca de entrada de dados.
import java.util.Scanner;

public class exercicio_14_POO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaracao de variaveis.
		int x;
		double y , z;
		
		Scanner S = new Scanner(System.in);
		
		//incio do programa.
		
				//entrada de dados.
				
				System.out.println("informe a quilometragem total percorrida: ");
				x = S.nextInt();
				System.out.println("informe a litragem total gasta: ");
			    y = S.nextDouble();
				
				//processamento de dados.
				
				z = x / y;
				
				//retorno dos dados.
				
				System.out.printf("%.3f km/l%n", z);
				
				//fim do programa.
	}

}
