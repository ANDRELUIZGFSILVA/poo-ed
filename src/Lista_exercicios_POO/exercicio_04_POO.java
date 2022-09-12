package Lista_exercicios_POO;
//importando biblioteca de entrada de dados.
import java.util.Scanner;

public class exercicio_04_POO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaracao de variaveis.
		int a;
		int b;
		int PROD;
		Scanner S = new Scanner(System.in);
		
		//incio do programa.
		
				//entrada de dados.
				
				System.out.println("insira o primeiro valor: ");
				a = S.nextInt();
				System.out.println("insira o segundo valor: ");
				b = S.nextInt();
				
				//processamento de dados.
				
				PROD = a * b;
				
				//retorno dos dados.
				
				System.out.println("PROD= " + PROD);
				
				//fim do programa
	}

}
