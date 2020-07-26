package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri1014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double km, combustivel, totalGasto;
		
		km = sc.nextDouble();
		combustivel = sc.nextDouble();
		
		totalGasto = km / combustivel;
		
		System.out.printf("%.3f km/l%n", totalGasto);
		
		sc.close();

	}

}
