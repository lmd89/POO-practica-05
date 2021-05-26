/* Ejercicio 1
Dado el siguiente m�todo:
public int dividir (int a, int b){
return a/b;
}
a. Realizar pruebas con diferentes valores para �a� y �b�.
b. �Qu� pasa cuando �b� es 0 (cero)?
	Al intentar dividir por cero surge el siguiente error:
	Exception in thread "main" java.lang.ArithmeticException: / by zero
	at p05ej01.Main.dividir(Main.java:18)
	at p05ej01.Main.main(Main.java:25)
c. Modificar el m�todo para que, cuando �b� sea 0 (cero), el valor de retorno sea 0 (cero).
d. �Cu�l ser�a la excepci�n m�s adecuada para utilizar en este caso?
	Ser�a una excepci�n aritm�tica.
Nota: en el inciso d, capturar la excepci�n con un bloque �try � catch�. */

package p05ej01;

public class Main {
	
	public static int dividir (int a, int b){
		//if (b == 0)
		//	return 0;
		// else
		return a/b;
		}

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		//System.out.println("El resultado de dividir " + a + " y " + b + " es: " + dividir (a, b));
		System.out.println("Prueba TRY - CATCH");
		
		try{
	          System.out.println("El resultado es: " + dividir (a, b));
	      } 
	      catch (ArithmeticException e) {
	         System.out.println ("No se puede dividir por cero " + e);
	      }
	}

}
