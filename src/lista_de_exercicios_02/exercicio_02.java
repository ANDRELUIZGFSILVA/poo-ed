package lista_de_exercicios_02;
import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
        Double maior = Double.MIN_VALUE;
        Double menor = Double.MAX_VALUE;

        for (int i = 0; i < 14; i++) {
            System.out.println("Digite sua altura: ");
            Double altura = S.nextDouble();
            if (maior < altura) {
                maior = altura;
            }
            if (menor > altura) {
                menor = altura;
            }
        }

        System.out.println("O maior integrante tem altura: " + maior);
        System.out.println("O menor integrante tem altura: " + menor);
		
		
	}

}
