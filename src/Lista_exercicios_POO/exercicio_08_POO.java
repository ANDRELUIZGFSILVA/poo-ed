package Lista_exercicios_POO;
//importando biblioteca de entrada de dados.
import java.util.Scanner;

public class exercicio_08_POO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaracao de variaveis.
		int numero_func;
		int hora_trab;
		double valor_hora;
		double salario;
		Scanner S = new Scanner(System.in);
		
		//incio do programa.
		
				//entrada de dados.
				
				System.out.println("informe o numero do funcionario: ");
				numero_func = S.nextInt();
				System.out.println("informe as horas trabalhadas: ");
			    hora_trab = S.nextInt();
			    System.out.println("informe valor da hora: ");
				valor_hora = S.nextDouble();
				
				//processamento de dados.
				
			    salario = hora_trab * valor_hora;
				
				//retorno dos dados.
				
				System.out.println("NUMBER =  "+ numero_func);
				System.out.printf("SALARY = U$ %.1f%n", salario);
				
				//fim do programa.
	}

}
