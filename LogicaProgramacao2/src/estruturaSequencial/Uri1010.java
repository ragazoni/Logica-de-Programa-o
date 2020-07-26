package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPecas1 = sc.nextInt();
		int numPecas1 = sc.nextInt();
		double valorUni1 = sc.nextDouble();
		
		int codPecas2 = sc.nextInt();
		int numPecas2 = sc.nextInt();
		double valorUni2 = sc.nextDouble();
		
		double totalPagar = numPecas1 * valorUni1 + numPecas2 * valorUni2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalPagar);
		
		sc.close();
	}

}
