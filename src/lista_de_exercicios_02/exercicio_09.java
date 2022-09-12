package lista_de_exercicios_02;
import java.util.Scanner;

public class exercicio_09 {

	public static void main(String[] args) {
           
		Scanner S = new Scanner(System.in);
           
		
		System.out.println("informe um valor inicial: ");
		int inicial = S.nextInt();
		System.out.println("informe o quociente: ");
		int quociente = S.nextInt();
		int gn = inicial, valor_max = 10;
        
        System.out.printf("Elementos da PG, de valor inicial %d e razão %d, menores que %d\n", inicial, quociente, valor_max );
        while(gn<=valor_max){
            System.out.println(gn);
            gn *= quociente;
        }
    }
}
