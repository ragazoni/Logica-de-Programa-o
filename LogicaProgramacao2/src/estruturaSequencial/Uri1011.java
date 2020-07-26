package estruturaSequencial;

import java.util.Scanner;

public class Uri1011 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio, volume;
		double pi = 3.14159;
		
		raio = sc.nextDouble();
		
		volume = (4/3.0) * pi * (Math.pow(raio, 3.0));
		
		System.out.printf("VOLUME = %.3f%n", volume);
		
	}

}
