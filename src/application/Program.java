package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		boolean execute = true;
		
		while (execute) {
			System.out.print("Dado de quantos lados? (-1 para sair) ");	
		
			try {
				var sc = new Scanner(System.in);				
				int sides = sc.nextInt();
				
				if (sides < 0) {
					sc.close();
					execute = false;
				}
				
				else {
					int number = 1 + (int)(Math.random() * sides);				
					System.out.println(number);
				}				
			}
			
			catch (InputMismatchException ex) {
				System.out.println("Caracter inserido é inválido. Insira um número.");
				continue;
			}
		}
	}
}
