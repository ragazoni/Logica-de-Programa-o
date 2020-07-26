package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {

@SuppressWarnings("unused")
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salarioFixo, vendas, comissao;
		String nome;
		
		nome = sc.next();
		salarioFixo = sc.nextDouble();
		vendas = sc.nextDouble();
		
		comissao = (vendas * 0.15) + salarioFixo;	
		
		System.out.printf("TOTAL = R$ %.2f%n", comissao);
		
		sc.close();

	}

}
