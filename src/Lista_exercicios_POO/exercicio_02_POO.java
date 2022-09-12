package Lista_exercicios_POO;
//importando biblioteca de entrada de dados.
import java.util.Scanner;

public class exercicio_02_POO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaracao de variaveis.
		
		double area;
		double n = 3.14159;
		double raio;
		double A;
		Scanner S = new Scanner(System.in);
		
		//inicio do programa.
		
		
		System.out.println("Por favor, insira o valor do Raio: ");
		
		//entrada de dados.
		
		raio = S.nextDouble();
		
		//processamento de dados.
		
		area = n * (raio * raio);
		A = area;
		
		//retorno do resultado.
		
		System.out.println("A = " + A);
		
		//fim do programa.
		
		
		

	}

}
