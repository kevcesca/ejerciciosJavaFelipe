package controlDeFlujo2;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		
		System.out.println("Ingresa un numero");
		Scanner input = new Scanner(System.in);
		
		int numero = input.nextInt(), division = 0, i = 1;
		
		
		
		do {
			division = numero%i;
			if(division==0 && i!=1 && i!= numero) {
				System.out.println("El numero ingresado no es primo");
				break;
			}
			if(numero == i) {
				System.out.println("El numero "+ numero + " es primo");
			}
			
			i++;
		} while (i<=numero);
		
	}

}