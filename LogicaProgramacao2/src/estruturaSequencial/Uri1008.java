package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double horasTrab, valorHora, salario;
		int numero;
		numero = sc.nextInt();
		horasTrab = sc.nextDouble();
		valorHora = sc.nextDouble();
		
		salario = horasTrab * valorHora;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);

	}

}
