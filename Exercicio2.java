import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int a;
		int b;
		int c;
		int d;
		int e;
		float soma;

		System.out.printf("Digite o primeiro n�mero:");
		a = sc.nextInt();
		
		System.out.printf("Digite o segundo n�mero:");
		b = sc.nextInt();
		
		System.out.printf("Digite o terceiro n�mero:");
		c = sc.nextInt();
		
		System.out.printf("Digite o quarto n�mero:");
		d = sc.nextInt();
		
		System.out.printf("Digite o quinto n�mero:");
		e = sc.nextInt();
		
		soma = a + b + c + d + e;
		
		System.out.println(soma / 8);
		
		sc.close();
	}

}
