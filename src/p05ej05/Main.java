/*Crear una clase �Circulo� que tenga un atributo est�tico y constante llamado �PI�, el
cu�l, ser� de tipo double y tendr� como valor 3.14. Agregar a la clase, un atributo
radio (double) que representa el radio del c�rculo, y los m�todos para obtener y
establecer los atributos. Tambi�n debe disponer de un m�todo para calcular el �rea
y la longitud del c�rculo. En la clase principal o main, crear un objeto c�rculo, pedirle
al usuario el radio e imprimir el �rea y la longitud.
a. �Se puede crear un m�todo en la clase �Circulo� para establecer el valor de
�PI�?
b. �Por qu�?*/

package p05ej05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Circulo miCirculo = new Circulo();
		Scanner in = new Scanner(System.in);
		System.out.print("Ingrese el radio del circulo:");
		miCirculo.setRadio(in.nextDouble());
		miCirculo.calcular();
	}
}
