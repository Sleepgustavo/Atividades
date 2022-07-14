import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int x;
		int tabuada = 1;
		int resultado;
		
		System.out.printf("Escreva um número:");
		x = sc.nextInt();
		
		do {
			resultado = x * tabuada;
			tabuada ++;
			System.out.println(resultado);
		}
		while (tabuada <= 10);
		
		sc.close();

	}

}
