import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		float x;
		float y;
		
		System.out.printf("Digite um valor decimal:");
		x = sc.nextFloat();
		
		System.out.printf("Digite outro valor decimal:");
		y = sc.nextFloat();
		
		System.out.println(x * y);
		
		sc.close();
	}

}
