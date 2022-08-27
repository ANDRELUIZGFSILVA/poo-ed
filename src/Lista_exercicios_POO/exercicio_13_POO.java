package Lista_exercicios_POO;
//importando biblioteca de entrada de dados.
import java.util.Scanner;

public class exercicio_13_POO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaracao de variaveis.
		int a , b , c;
		int maior_ab;
		int maior_abc;
		Scanner S = new Scanner(System.in);
		
		//incio do programa.
		
				//entrada de dados.
				
				System.out.println("insira o primeiro valor: ");
				a = S.nextInt();
				System.out.println("insira o segundo valor: ");
				b = S.nextInt();
				System.out.println("insira o terceiro valor: ");
				c = S.nextInt();
				
				//processamento de dados.
				
				maior_ab = (a + b + Math.abs(a - b)) / 2;
				maior_abc = (maior_ab + c + Math.abs(maior_ab - c)) / 2;
				
				//retorno dos dados.
				
				System.out.println(maior_abc + " eh o maior");
				
				//fim do programa.
	}

}
