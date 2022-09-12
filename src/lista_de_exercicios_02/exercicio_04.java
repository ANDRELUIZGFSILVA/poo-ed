package lista_de_exercicios_02;
import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Escrever um algoritmo que leia uma quantidade desconhecida de números e conte quantos deles
		//estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve
		//terminar quando for lido um número negativo.
		int i , contA = 0 , contB = 0 , contC = 0 , contD = 0;
		
		Scanner S = new Scanner(System.in);
		
		
		    do {
           System.out.println("digite um numero: X ou um numero negativo para sair.");
		     i = S.nextInt();
		     
		     
			if (i >= 0 && i <= 25) {
				contA ++;
			}
			if (i >= 26 && i <= 50) {
				contB ++;
			}
			if (i >= 51 && i <= 75) {
				contC ++;
			}
			if (i >= 76 && i <= 100) {
				contD ++;
			} 
					
	           } while (i >= 0);
		    
		    
System.out.println(" Quantidade da chave [0 - 25]=  " + contA);
System.out.println(" Quantidade da chave [26 - 50]=  " + contB);
System.out.println(" Quantidade da chave [51 - 75]=  " + contC);
System.out.println(" Quantidade da chave [76 - 100]=  " + contD);
}
}
