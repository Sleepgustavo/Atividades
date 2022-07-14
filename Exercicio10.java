import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		float dinheiro;
		double dolar;
		double bitcoin;
		double libra;
		
		System.out.printf("Escreva a quantidade de dinheiro para a viagem:");
		dinheiro = sc.nextFloat();
		
		dolar = dinheiro * 0.28;
		
		libra = dinheiro * 0.16;
		
		bitcoin = dinheiro * 0.0000051;
		
		System.out.println("Dolar australiano: $" +dolar);
		
		System.out.println("Bitcoin: $" +bitcoin);
		
		System.out.println("Libra esterlina: $" +libra);
				
		sc.close();
	}

}
