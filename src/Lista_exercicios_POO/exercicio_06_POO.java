package Lista_exercicios_POO;
//importando biblioteca de entrada de dados.
import java.util.Scanner;

public class exercicio_06_POO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaracao de variaveis.
		double A;
		double B;
		double C;
		double MEDIA;
		Scanner S = new Scanner(System.in);
		
		//incio do programa.
		
				//entrada de dados.
				
				System.out.println("insira a primeira nota: ");
				A = S.nextDouble();
				if (A >= 0 | A <= 10.0) {
				} 
				else { 
					System.out.println("este valor de nota, e invalido, favor insira uma nota valida! ");
					A = S.nextDouble();
				}
				System.out.println("insira a segunda nota: ");
			    B = S.nextDouble();
			    if (B >= 0 | B <= 10.0) {
				} 
				else { 
					System.out.println("este valor de nota, e invalido, favor insira uma nota valida! ");
					B = S.nextDouble();
				}
			    System.out.println("insira a terceira nota: ");
			    C = S.nextDouble();
			    if (C >= 0 | C <= 10.0) {
				} 
				else { 
					System.out.println("este valor de nota, e invalido, favor insira uma nota valida! ");
					C = S.nextDouble();
				}
				
				//processamento de dados.
				
				MEDIA = ( (A * 2) + (B * 3) + (C * 5)) / 10.0;
				
				//retorno dos dados.
				
				System.out.printf("MEDIA = %.1f%n", MEDIA);
				
				//fim do programa.
	}

}