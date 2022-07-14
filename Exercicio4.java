import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		float preco;
		double acrescimo;
		
		System.out.printf("Digite o preço da gasolina:");
		preco = sc.nextFloat();
		
		acrescimo = preco * 0.10;
		
		System.out.println(preco + acrescimo);
		
		sc.close();
	}

}
