package controlDeFlujo2;

import java.util.Scanner;

// Programa para evaluar examenes

public class ejercicio11 {

	public static void main(String[] args) {
//
		
		int calMinima = 60, calObtenida;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingresa los puntos obtenidos");
		calObtenida = input.nextInt();
		
		String resFinal = (calObtenida >= calMinima ) ? "La calificancion es aprobatoria" :"La calificaion no es aprobatoria";
		
		System.out.println(resFinal);
		
		
		
		int temperaturaIncubadora = 36;
		
		switch(temperaturaIncubadora) {
		
		case 30:
			System.out.println("Puedes incubar pollos blancos");
		break;
		case 31:
			System.out.println("Puedes incubar  pollos azules");
		break;
		case 32:
			System.out.println("Puedes incubar pollos verdes");
		break;
		case 33:
			System.out.println("Puedes incubar pollos amarillos");
		break;
		case 34:
			System.out.println("Puedes incubar pollos rojos");
		break;
		default: 
			System.out.println("Puedes incubar pollos arcoiris");
		break;
		
		}
		
		System.out.println("El programa ha terminado");
	}

}