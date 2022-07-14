import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int hora;
		int minuto;
		int minutos;
		int totmin;
		int totseg;
		
		System.out.printf("Escreva uma quantidade de horas: ");
		hora = sc.nextInt();
		
		System.out.printf("Escreva uma quantidade de minutos: ");
		minuto = sc.nextInt();
		
		minutos = hora * 60;
		
		totmin = minuto + minutos;
		
		totseg = totmin * 60;
		
		System.out.println(totseg);
		
		sc.close();

	}

}
