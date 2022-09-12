package lista_de_exercicios_02;
import java.util.Scanner;

public class exercicio_10 {

	public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
    int numero;
    
    System.out.println("Digite o primeiro numero: ");
        numero = S.nextInt();
        long fatorial = 1;
        int i = 1;

        while (i <= numero) {
        fatorial = fatorial * i;
        i++;           
        }
        System.out.println(" O Fatorial de " + numero + " é " + fatorial);
}

}

