package Lista_exercicios_POO;
//importando biblioteca de entrada de dados.
import java.util.Scanner;

public class exercicio_09_POO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaracao de variaveis.
		String nome_vend;
		double salario_fixo;
		double vendas;
		double comissao;
		Scanner S = new Scanner(System.in);
		
		//incio do programa.
		
				//entrada de dados.
				
				System.out.println("informe o nome do vendedor: ");
				nome_vend = S.next();
				System.out.println("informe o valor do salario fixo: ");
			    salario_fixo = S.nextDouble();
			    System.out.println("informe o valor total em vendas: ");
			    vendas = S.nextDouble();
				
				//processamento de dados.
				
				comissao = (vendas * 0.15) + salario_fixo;
				
				//retorno dos dados.
				
				System.out.printf("TOTAL = R$ %.2f%n", comissao);
				
				//fim do programa.
	}

}
