package lista_de_exercicios_02;
import java.util.Scanner;

public class exercicio_07 {

	public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        Integer A =  null;
        while (A == null || A < 0 || A > 10){
            System.out.println("Digite o multipicador : ");
            A = S.nextInt() ;
        }
            int i, multi = 0;

            for(i = 0; i < 11; i++){
                
                    multi = A * i;
                    System.out.println("    "+A +" X " +i +" = " +multi);
                
                
        
            }
        
         }

}
