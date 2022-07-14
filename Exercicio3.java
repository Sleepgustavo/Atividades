import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		float y;
		
		System.out.printf("Digite um número:");
		x = sc.nextInt();
		
		if(x == 0) {
			do {
			System.out.printf("O primeiro número não pode ser 0, escreva outro número:");
			x = sc.nextInt();
			}
			while(x == 0);
		}
		System.out.printf("Digite outro número:");
		y = sc.nextFloat();
		
		if(y == 0) {
			System.out.println("0");
			sc.close();
			
		}
		else {
		System.out.println(x / y);
		sc.close();
		}
	}

}
