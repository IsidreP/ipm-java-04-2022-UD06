package package1;

import javax.swing.JOptionPane;

public class Ej02 {

	public static void main(String[] args) {
		
		String min=JOptionPane.showInputDialog("Introduce el primer numero del intervalo");
		double min2=Double.parseDouble(min);

		String max=JOptionPane.showInputDialog("Introduce el segundo numero del intervalo");
		double max2=Double.parseDouble(max);
		
		double resultado=numeroAleatorio(min2, max2);
		
		System.out.print("El numero aleatorio es: "+resultado);
	}
	
	public static double numeroAleatorio (double min, double max) {
		
		double resultado=Math.random()*(max-min)+min;
		return resultado;
	}

}
