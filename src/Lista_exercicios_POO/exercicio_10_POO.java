package Lista_exercicios_POO;
//importando biblioteca de entrada de dados.
import java.util.Scanner;

public class exercicio_10_POO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaracao de variaveis.
		int cod_1 , cod_2 , qtd_1 , qtd_2;
		double v_unit_1 , v_unit_2;
		double valorapagar;
		Scanner S = new Scanner(System.in);
		
		//incio do programa.
		
				//entrada de dados.
				
				System.out.println("informe o codigo do produto : "); //1
				cod_1 = S.nextInt();
				System.out.println("informe o numero de peças: "); //1
			    qtd_1 = S.nextInt();
			    System.out.println("informe o valor unitario: "); //1
				v_unit_1 = S.nextDouble();
				System.out.println("informe o codigo do produto : "); //2
				cod_2 = S.nextInt();
				System.out.println("informe o numero de peças: "); //2
			    qtd_2 = S.nextInt();
			    System.out.println("informe o valor unitario: "); //2
				v_unit_2 = S.nextDouble();
				
				
				//processamento de dados.
				
				valorapagar = (qtd_1 * v_unit_1) + (qtd_2 * v_unit_2);
				
				//retorno dos dados.
				
				System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorapagar);
				
				//fim do programa.
	}

}
