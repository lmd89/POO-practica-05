package p05ej05;

public class Circulo {
	public static double PI = 3.14; // Constante pi
	private double radio;
	
	public void setRadio (double radio) {
		this.radio = radio;
	}
	
	public double getRadio () {
		return radio;
	}
	
	public void calcular () {
		System.out.println("El �rea de un c�rculo de radio " + radio + " es: " + PI*(radio*radio));
		//La Longitud de una circunferencia es igual al valor de su di�metro multiplicado por PI. 
		//El di�metro mide el doble del radio. 
		System.out.println("La longitud de un c�rculo de radio " + radio + " es: " + PI*(radio*2));
	}

}
