package Lista_exercicios_POO;
//importando biblioteca de entrada de dados.
import java.util.Scanner;

public class exercicio_03_POO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaracao de variaveis.
		int A;
		int B;
		int SOMA;
		Scanner S = new Scanner(System.in);
		
		//incio do programa.
		
		//entrada de dados.
		
		System.out.println("insira o primeiro valor: ");
		A = S.nextInt();
		System.out.println("insira o segundo valor: ");
		B = S.nextInt();
		
		//processamento de dados.
		
		SOMA = A + B;
		
		//retorno dos dados.
		
		System.out.println("SOMA: " + SOMA);
		
		//fim do programa
		
		
		

	}

}
