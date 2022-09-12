package lista_de_exercicios_02;
import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// 5) Faça um algoritmo estruturado que leia uma quantidade não determinada de números positivos.
	// Calcule a quantidade de números pares e ímpares, a média de valores pares e a média geral dos
	// números lidos. O número que encerrará a leitura será zero.
		Scanner S = new Scanner(System.in);
		
		int qtdI=0, qtdP=0, i, somaI = 0, somaP = 0, numeroI=0, numeroP=0;
		float mediaG, mediaP=0;
		
		
		
		
		
		do {
			System.out.println("informe um numero: ");
		     i = S.nextInt();
		     
		     if (i%2==0){ 
		    	 qtdP++;
	                somaP = numeroP + i;
	                numeroP = i;
	                
	                mediaP = (somaP / qtdP);
			} 
		     if (i%2==1){ 
		    	 qtdI++;
	                somaI = numeroI + i;
	                numeroI = i;
	                
				
			}
		     
		     mediaG = (somaI + somaP) / (qtdI + qtdP);
			
			
	         System.out.println("media Pares: " + mediaP + " | Quantidade Par: " + qtdP + " | Quantidade Impar: " + qtdI );
	         System.out.println("media geral: " + mediaG );
	         System.out.println("soma Par: " + somaP );
	         System.out.println("soma Impar: " + somaI );
			
			} while (i != 0);

	}

}
