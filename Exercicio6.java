import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		double salariomin;
		double salariofun;
		
		System.out.printf("Digite o sal�rio m�nimo:");
		salariomin = sc.nextDouble();
		
		System.out.printf("Digite o sal�rio do funcion�rio:");
		salariofun = sc.nextDouble();
		
		System.out.println(salariofun / salariomin);

		sc.close();
	}

}
