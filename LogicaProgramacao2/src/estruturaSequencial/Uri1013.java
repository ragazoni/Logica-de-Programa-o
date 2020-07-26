package estruturaSequencial;

import java.util.Scanner;

public class Uri1013 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, maiorA, maiorB;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		maiorA = (a + b + Math.abs(a-b)) / 2;
		maiorB = (maiorA + c + Math.abs(maiorA - c)) /2;
		
		System.out.println(maiorB + " eh o maior");
		
		sc.close();

	}

}
