package EjerciciosClase1;

public class EjerciciosClase1 {

	public static void main(String[] args) {
		// a. Utilizando la sentencia while, imprima todos los números entre 2 variables
		// “a” y “b”

		System.out.println("números entre 'a' y 'b'");
		int numeroInicio = 5;
		int numeroFin = 14;
		int contador = numeroInicio;

		while (contador <= numeroFin) {
			System.out.print(contador + " ");
			contador++;
		}

		System.out.println();
		System.out.println("==============================");

		// b. A lo anterior, solo muestre los números pares
		System.out.println("números pares entre 'a' y 'b'");
		contador = numeroInicio;
		while (contador <= numeroFin) {

			if (contador % 2 == 0) {
				System.out.print(contador + " ");
			}
			contador++;
		}

		System.out.println();
		System.out.println("==============================");

		/* c. A lo anterior, con una variable extra, elija si se deben mostrar los
		* números pares o impares
		*Variable que define si se imprime impar o par
		*/
		
		String tipoNumero = "impar";

		System.out.println("números pares o impar entre 'a' y 'b'");
		System.out.println(tipoNumero);

		// contador igual al número inicial para comenzar
		contador = numeroInicio;

		// ciclo para imprimir todos los números desde el número inicial hasta el número
		// final inclusive
		while (contador <= numeroFin) {

			// condiciones tipo de número par y verificamos que el número en el que nos
			// encontramos es par , entonces lo imprimimos
			if (contador % 2 == 0 && tipoNumero == "par") {
				System.out.print(contador + " ");
			} else if (contador % 2 != 0 && tipoNumero == "impar") {
				System.out.print(contador + " ");
			}

			// Aumentar en 1 el contador
			contador++;
		}

		//d. Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden
		System.out.println();
		System.out.println("==============================");
		
		
		System.out.println("números pares entre 'b' y 'a' con for");
		System.out.println("Numero de inicio: " + numeroFin);
		System.out.println("Numero de final: " + numeroInicio);
		
		for( int numero = numeroFin; numero >= numeroInicio; numero--) {
			if(numero % 2 == 0) {
				System.out.print( numero + " ");
			}
		}
		
		
		/*2.
		 * Dado el siguiente texto, vamos a atacar el siguiente problema: “determinar si
		 * una persona pertenece al segmento de ingresos altos”. Del i al iii, la idea
		 * es hacerlo en papel y lápiz y sólo implementar el cuarto.
		 * 
		 * “Son hogares que declaran reunir alguna de las siguientes condiciones,
		 * considerando a todas y todos los convivientes:
		 * 
		 * -> Ingresos mensuales totales del hogar equivalentes o superiores a $489.083
		 * (3,5 canastas básicas para un hogar tipo 2 según el INDEC).
		 * 
		 * -> Tener 3 o más vehículos con una antigüedad menor a 5 años.
		 * 
		 * -> Tener 3 o más inmuebles.
		 * 
		 * -> Poseer una embarcación, una aeronave de lujo o ser titular de activos
		 * societarios que demuestren capacidad económica plena.”
		 * 
		 * 
		 */
		
		System.out.println();
		System.out.println("==============================");

		float ingresos = 430000;
		int cantVehiculos = 4;
		int cantInmuebles = 4;
		boolean embarcacionAeronave = true;
		boolean poseeActivos = false;

		if ((ingresos >= 489083) && (cantVehiculos >= 3) && (cantInmuebles >=3)&&(embarcacionAeronave == true || poseeActivos == true)) {
			System.out.println("Pertenece al segmento de ingresos altos");
		} else {
			System.out.println("No pertenece al segmento de ingresos altos");
		}

	}

}
