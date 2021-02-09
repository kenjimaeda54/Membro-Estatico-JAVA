package aplication;

import java.util.Locale;
import java.util.Scanner;

import utilitario.preco;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual preço do doldar?");
		preco.preco = sc.nextDouble();
        System.out.print("Qual valor deseja comprar?");
        preco.compra = sc.nextDouble();
        double total = preco.total();
        System.out.printf("Valor total da compra e:R$ %.2f",total);
        
		
		sc.close();

	}

}
