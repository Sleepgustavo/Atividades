import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int valorent;
		int custo;

		System.out.printf("Digite o preço do ingresso:");
		valorent = sc.nextInt();
		
		System.out.printf("Digite o custo do show:");
		custo = sc.nextInt();
		
		System.out.printf("Número de ingressos: " +custo / valorent);
		
		sc.close();
	}

}
