package Principal;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
/*
	Scanner sc = new Scanner(System.in);
	String x;
	
	x = sc.next(); //Para receber os dados a serem digitados
	System.out.println("Você digitou: " + x);
	sc.close(); // Para encerrar o recurso!
*/

		
		
/*
	Scanner sc2 = new Scanner(System.in);
	int y;
	
	y = sc2.nextInt();
	System.out.println("O número digitado foi: " + y);
*/
	
		
		
/*	
	//Locale.setDefault(Locale.US); //Muda de "," para "."
	Scanner sc3 = new Scanner(System.in);
	double y;
	
	y = sc3.nextDouble();
	System.out.println("O número digitado foi: " + y); // Exibe resultado com o ponto "."
	System.out.printf("O número digitado foi: %.2f%n", y); //Exibe resultado com a vírgula ","
*/
	
		
/*
		Scanner sc4 = new Scanner(System.in);
		
		char a;
		
		a = sc4.next().charAt(5); //charAt() pega o caracter selecionado
		System.out.println("Você selecionou a letra: " + a);
		
		sc4.close();

*/
		Locale.setDefault(Locale.US); //Altera o insert de "," para "."
		Scanner sc = new Scanner(System.in);
		String x;
		int y;
		Double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados digitados");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
		
		
		
		
		
	}

}
