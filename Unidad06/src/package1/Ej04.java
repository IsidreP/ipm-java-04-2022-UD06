package package1;

import javax.swing.JOptionPane;

public class Ej04 {

	public static void main(String[] args) {
		
		String numero=JOptionPane.showInputDialog("Introduce un numero");
		int numero2=Integer.parseInt(numero);
		
		int resultado1=numeroFactorial(numero2);
		
		System.out.print("El factorial de: "+numero2+" es "+resultado1);
		
	}
	
	
	public static int numeroFactorial (int x) {
		
		int resultado=x;
		
		while(x!=1) {
			resultado+=resultado*(x-2);
			x--;
		}
		
		return resultado;
	}

}
