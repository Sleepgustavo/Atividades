import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		double salario;
		float vendas;
		double comissao;
		double salariofin;

		System.out.printf("Escreva seu s�lario:");
		salario = sc.nextDouble();
		
		System.out.printf("Escreva o valor de suas vendas:");
		vendas = sc.nextFloat();
	
		comissao = vendas * 0.04;
		
		salariofin = salario + comissao;
		
		System.out.println("Comiss�o: $"+comissao);
		
		System.out.printf("Sal�rio final: $"+salariofin);
		
		sc.close();
	}

}
