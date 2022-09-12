package Lista_exercicios_POO;
//importando biblioteca de entrada de dados.
import java.util.Scanner;

public class exercicio_12_POO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaracao de variaveis.
		
		double a , b , c;
		double area_tr , area_circ , area_trap , area_quad , area_ret ;
		double pi = 3.14159;
		
		Scanner S = new Scanner(System.in);
		
		//incio do programa.
		
				//entrada de dados.
				
				System.out.println("informe o primeiro valor: ");
				a = S.nextDouble();
				System.out.println("informe o segundo valor: ");
			    b = S.nextDouble();
			    System.out.println("informe o terceiro valor: ");
				c = S.nextDouble();
				
				//processamento de dados.
				
				area_tr = (a * c) / 2.0;
				area_circ = pi * Math.pow(c, 2);
				area_trap = ((a + b) * c) / 2.0;
				area_quad = b * b;
				area_ret = a * b;
				
				//retorno dos dados.
				
				System.out.printf("TRIANGULO: %.3f%n", area_tr);
				System.out.printf("CIRCULO: %.3f%n", area_circ);
				System.out.printf("TRAPEZIO: %.3f%n", area_trap);
				System.out.printf("QUADRADO: %.3f%n", area_quad);
				System.out.printf("RETANGULO: %.3f%n", area_ret);
				
				//fim do programa.
	}

}
