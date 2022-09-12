package lista_de_exercicios_02;
import java.util.Scanner;

public class exercicio_08 {

	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
           
		
		System.out.println("informe um valor inicial: ");
		int inicial = S.nextInt();
		System.out.println("informe a razao: ");
		int razao = S.nextInt();
		int an = inicial, valor_max = 10;
        
        
        System.out.printf("Elementos da PA, de valor inicial %d e razão %d, menores que %d\n", inicial, razao, valor_max );
        while(an<=valor_max){
            System.out.println(an);
            an += razao;
        }
    }

}
