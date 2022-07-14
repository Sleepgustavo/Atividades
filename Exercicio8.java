import java.util.Scanner;
public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		float salario;
		float conta;
		double desconto;
		
		System.out.printf("Digite o salário de João:");
		salario = sc.nextFloat();
		
		System.out.printf("Digite o valor da conta paga por João:");
		conta = sc.nextFloat();
		
		desconto = conta * 0.05;
		
		System.out.println(+salario - ((conta * 2) - (desconto * 2)) + " reais");
		
		sc.close();
	}

}
