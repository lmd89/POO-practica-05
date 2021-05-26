/*
 Dado el siguiente fragmento de código fuente JAVA:
 a. ¿Qué retorna su ejecución?
 	Retorna: C1
 			 C2
 b. ¿Qué son los Stream?
 	La API Stream se utiliza para procesar colecciones de objetos. 
 	Un stream es una secuencia de objetos que admite varios métodos que se pueden hacer pipeline para producir 
 	el resultado deseado.
 c. Brindar otro ejemplo de uso de los mismos.
 	collect: El método colect se utiliza para devolver el resultado de las operaciones 
 	intermedias realizadas en el stream.
 	List number = Arrays.asList(2,3,4,5,3);
	Set square = number.stream().map(x->x*x).collect(Collectors.toSet());
	reduce: se utiliza para reducir los elementos de una secuencia a un solo valor.
	El método  toma un BinaryOperator como parámetro.
	List number = Arrays.asList(2,3,4,5);
	int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
	A la variable ans se le asigna 0 como valor inicial y se le agrega i.
 */

package p05ej04;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("a1", "b1", "c2", "c1");
		myList.stream()
		.filter(s -> s.startsWith("c"))
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);

	}

}
