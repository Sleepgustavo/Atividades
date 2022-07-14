import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int horas;
		int salario;
		int horasext;
		float valhora;
		float valhoraext;
		float salariobruto;
		float valorext;
		double receber;
		
		System.out.printf("Digite a quantidade de horas trabalhadas: ");
		horas = sc.nextInt();
		
		System.out.printf("Digite a quantidade de horas extras trabalhadas: ");
		horasext = sc.nextInt();
		
		System.out.printf("Digite o salário mínimo: ");
		salario = sc.nextInt();

		
		valhora = horas * (salario / 6);
		
		valhoraext = horasext * (salario / 3);
		
		salariobruto = horas * valhora;
		
		valorext = horasext * valhoraext;
		
		receber = salariobruto + valorext;
		
		System.out.printf("Valor a receber: R$" +receber);
		
		sc.close();
		
	}

}
