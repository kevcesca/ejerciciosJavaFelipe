import java.util.Scanner;

public class Ciclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingresa un numero");
		Scanner input = new Scanner(System.in);
		
		
//		Declaracion de variables
		int datoGuardado = 0;
		int suma = 0;
		
		while(datoGuardado>=0) {
			
			datoGuardado = input.nextInt();
			suma = suma + datoGuardado;
			System.out.println("La suma de tus numeros es: "+ suma);
		}
		System.out.println("La suma final de tus numeros fue: "+ suma);
		
		
		
		int valor;
		
		do {  //inicio del do .. while
            System.out.print("Introduce un número entero <= 100: ");                                              
            valor = input.nextInt();
            if(valor > 100){
                System.out.println("Número no válido");
            }
        }while (valor > 100);  //fin del do .. while
        System.out.println("Ha introducido: " + valor);

		
        
	}
}