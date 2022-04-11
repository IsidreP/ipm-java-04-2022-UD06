package package1;

import javax.swing.JOptionPane;

public class Ej06 {

	public static void main(String[] args) {
		
		String numero=JOptionPane.showInputDialog("Introduce un numero");
		int numero2=Integer.parseInt(numero);
		
		int num1=numeroCifras(numero2);
		imprimirNumero(num1);
	}
	
	public static int numeroCifras (int x) {
		
		int y=x;
		int z=0;
		do {
			
		  y=y/10;
		  z++;
		  
		}
		while (y > 0);

		return z;
	}
	
	public static void imprimirNumero (int cifra) {
		
		
				System.out.print("El numero tiene "+cifra+" cifras");
			
		}

}
