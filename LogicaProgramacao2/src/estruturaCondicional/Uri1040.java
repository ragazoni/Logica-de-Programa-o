package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Uri1040 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float n1, n2, n3, n4, media, exame;
		
		n1 = sc.nextFloat();
		n2 = sc.nextFloat();
		n3 = sc.nextFloat();
		n4 = sc.nextFloat();
		
		
		media = ((2f*n1) + (3f*n2) + (4f*n3) + (1f*n4)) / 10f;
		
		System.out.printf("Media: %.1f%n", media);		
		
		if(media >= 7f) {
			System.out.println("Aluno aprovado.");
		}
		else if(media < 5f) {
			System.out.println("Aluno reprovado.");			
		}			
		else {
			System.out.println("Aluno em exame.");
			exame = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n ", exame);
			float mediaFinal = (exame + media) / 2f;
			if(mediaFinal >= 5f) {
				System.out.println("Aluno aprovado.");
			}
			else {
				System.out.println("Aluno reprovado.");	
		}
			
			System.out.printf("Media Final: %.1f%n ", mediaFinal);		
		
		}
		
		sc.close();		
	}
}


