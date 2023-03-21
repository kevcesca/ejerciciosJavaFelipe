package controlDeFlujo2;

public class Ejercicio30 {
	
	static String texto2 = "Hola, mi nombre es Felipe";
	int longitudTexto2 = texto2.length();
	
	public static String reversarCadena(String texto2) {
		
		String reversa = "";
		
		for (int i = texto2.length() - 1; i>=0; i-- ) {
			
			reversa = reversa + texto2.charAt(i);
		}
		
		return reversa;
		
	}
	
	public static void revisarPalindromo(String texto2) {
			
			String cadenaInvertida = reversarCadena(texto2).replaceAll(" ","");
			String texto3 = texto2.replaceAll(" ","");
			
			System.out.println(cadenaInvertida + " " + texto3);
			System.out.println(cadenaInvertida.equals(texto3));
			 if(cadenaInvertida.equals(texto3)){
				 System.out.println("Las palabras son palindromas");
			 }else {
				 System.out.println("Las palabras no son palindromas");
			 }
			
		}
	

	public static void main(String[] args) {
		
		
		System.out.println(reversarCadena(texto2));
		
		revisarPalindromo("wow");
		
	}

}