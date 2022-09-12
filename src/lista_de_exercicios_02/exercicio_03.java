package lista_de_exercicios_02;
import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Desenvolver um algoritmo que leia um número não determinado de valores e calcule e escreva a
		//média aritmética dos valores lidos, a quantidade de valores positivos, a quantidade de valores
		//negativos e o percentual de valores negativos e positivos.
		
		int numero=0 , qtdP = 0 , qtdN = 0 ,  somaP , somaN, numeroP = 0 , numeroN = 0 ;
		double mediaP = 0 , mediaN = 0 , percentP, percentN ;
		Scanner S = new Scanner(System.in);
		
		do {
			System.out.println("informe um numero: ");
		     numero = S.nextInt();
			
			if (numero >= 0) {   //positivo
				qtdP ++;
				somaP = numero + numeroP;
				mediaP = somaP / qtdP;
				numeroP = numero;
			} 
			if (numero < 0) {   //negativo
				qtdN ++;
				somaN = numero + numeroN;
				mediaN = somaN / qtdN;
				numeroN = numero;
				
			}
			
			percentP = (qtdP * 100) / (qtdP + qtdN);
			percentN = (qtdN * 100) / (qtdP + qtdN);
			
	         System.out.println("media positiva: " + mediaP + " | percentua positiva: " + percentP);
	         System.out.println("media positiva: " + mediaN + " | percentua positiva: " + percentN);
			
			} while (numero != 0);
		
		
		
		
		
		
		
		
	}
	

}
