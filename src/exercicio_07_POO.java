//importando biblioteca de entrada de dados.
import java.util.Scanner;

public class exercicio_07_POO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaracao de variaveis.
		int A,B,C,D,DIF;
		Scanner S = new Scanner(System.in);
		
		//incio do programa.
		
				//entrada de dados.
				
				System.out.println("insira o primeiro numero: ");
				A = S.nextInt();
				System.out.println("insira o segundo numero: ");
			    B = S.nextInt();
			    System.out.println("insira o terceiro numero: ");
				C = S.nextInt();
				System.out.println("insira o quarto numero: ");
			    D = S.nextInt();
				
				//processamento de dados.
				
			    DIF = (A * B - C * D);
				
				//retorno dos dados.
				
				System.out.println("DIFERENCA = "+ DIF);
				
				//fim do programa.
	}

}
