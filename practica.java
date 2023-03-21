public static void main(String[] args) {
		
//		System.out.println("Hola mundito");
//
////		Creamos una instacia del scanner
//		Scanner myScanner = new Scanner(System.in);
//		
////		imprimimos en pantalla un texto
//		System.out.println("Enter username");
//		
////		igualamos la variable al scanner y el metodo nextLine nos hace un salto de linea al scanner
//		String username = myScanner.nextLine();
//		
////		imprimimos la variable
//		System.out.println("El username es: "+ username);
//		
////		cerramos el scanner
//		myScanner.close();
		
//		Utilizar tipo de datos primitovs para la informacion personal no delicada
////		edad
//		int edad = 24;
//		
////		fecha nacimiento
//		String fechaNacimiento = "18 de septiembre 1998";
//		
////		iniciales
//		String iniciales = "KMCE";
//		
////		peso / altura / tamanio calzado
//		String medidas = "peso: 78kg, altura: 1.73, calzado: 8";		
//				
////		Ciudad de nacimiento
//		String lugarNacimiento = "Ciudad de Mexico";
//		
////		nacionalidad
//		String nacionalidad = "Mexicano";
//		
////		signo zodiacal
//		String signoZodiacal = "Virgo";
//		
////		signo ascendente
//		String ascendente = "Piscis";
//		
////		signo lunar
//		String signoLunar = "Virgo";
		
//		comida favorita
//		lista de comidas favoritas
//		Tipo de personalidad segun MBTI
//		que nombre de estrella va con ustedes
		
//		String msg = MessageFormat.format("Soy: {0} \nFecha de nacimiento: {1} \n ", iniciales, fechaNacimiento);
//		
//		System.out.println(msg);
		
//		int calif1 = 10;
//		int calif2 = 7;
//		int calif3 = 10;
//		int calif4 = 4;
//		
//		double avg = calif1 + calif2 + calif3 + calif4 ;
//		
//		avg = avg / 4;
//		
//		System.out.println(avg);
//		System.out.println((double)3);
		
		
		
		// Pedir 2 numeros (x), (y)
			// Enteros
		Scanner myScanner = new Scanner(System.in);
		int x = myScanner.nextInt();
		int y = myScanner.nextInt();
		myScanner.close();
				
			// 1. Convertir a double cada numero
		
			System.out.println((double)x + " " + (double)y);
				
			// 2. Tomar las variables enteras y convertir a datos binarios.
			
			String binaryY = Integer.toBinaryString(y);
			String binaryX = Integer.toBinaryString(x);
			
			System.out.println(binaryX + " " + binaryY);
				
			// 3. Mostrar el numero mayor
			
			if(y>x)
	        {
	            System.out.println("El numero mayor es "+ y);
	        }
			else
			{
				System.out.println("El numero mayor es "+ x);
			}
			
			// 4. Obtener el promedio de (x) y (y)
			
			
			System.out.println("El promedio es "+ ((x+y)/2));
		
		

		
	}