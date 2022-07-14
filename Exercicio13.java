import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		double salario;
		double kw;
		double valkw;
		double desconto;
		double valtot;
		double valdesc;
		
		System.out.printf("Digite o salario minimo: ");
		salario = sc.nextDouble();
		
		System.out.printf("Digite a quantidade de quilowatt: ");
		kw = sc.nextDouble();

		valkw = salario / 6;
		
		valtot = valkw * kw;
		
		desconto = valtot * 0.18;
		
		valdesc = valtot - desconto;
		
		System.out.println("Valor por kw: " +valkw);
		
		System.out.println("Valor total: " +valtot);
		
		System.out.println("Valor total com desconto: " +valdesc);
	}

}
