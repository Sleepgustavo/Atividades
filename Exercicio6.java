import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		double salariomin;
		double salariofun;
		
		System.out.printf("Digite o salário mínimo:");
		salariomin = sc.nextDouble();
		
		System.out.printf("Digite o salário do funcionário:");
		salariofun = sc.nextDouble();
		
		System.out.println(salariofun / salariomin);

		sc.close();
	}

}
