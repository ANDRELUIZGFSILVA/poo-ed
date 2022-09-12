package lista_de_exercicios_02;
import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int i, soma = 0;

		    for(i = 1; i <= 500; i+=2){// 500
		        soma += i; // soma = soma + i -> 500
		    }
		    System.out.printf("Soma dos impares de 1 a 500: %d\n\n", soma);
		}

	}


