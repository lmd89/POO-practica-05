/*Crear una clase “Circulo” que tenga un atributo estático y constante llamado “PI”, el
cuál, será de tipo double y tendrá como valor 3.14. Agregar a la clase, un atributo
radio (double) que representa el radio del círculo, y los métodos para obtener y
establecer los atributos. También debe disponer de un método para calcular el área
y la longitud del círculo. En la clase principal o main, crear un objeto círculo, pedirle
al usuario el radio e imprimir el área y la longitud.
a. ¿Se puede crear un método en la clase “Circulo” para establecer el valor de
“PI”?
b. ¿Por qué?*/

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
