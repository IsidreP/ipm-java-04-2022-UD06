package package1;

import javax.swing.JOptionPane;

public class Ej09 {

	public static void main(String[] args) {
		
		String num1=JOptionPane.showInputDialog("Introduce el tamaño del Array");
		int num2=Integer.parseInt(num1);
		
		int[] a1=rellenar(num2);
		mostrarSuma(a1);

	}
	
	
	public static int[] rellenar (int num2) {
		
		int num[]=new int[num2];
		int max = 9;
	    int min = 0;
	    int range = max - min;
		
		for(int i=0;i<num.length;i++) {
	
			int resultado= (int) (Math.random()*range);
			num[i]=resultado;
			
		}
		
		return num;
		
	}
	
	
	public static void mostrarSuma (int lista[]) {
		
		int b=0;
		int sum=0;
		
		for(int i=0;i<lista.length;i++) {
			System.out.println("["+b+"]"+lista[i]);
			b++;
			}
		
		for (int i = 0; i < lista.length; i++) {
            sum+=lista[i];
		}
		
		System.out.println("La suma es: "+sum);

	}
	
}
	
	
	
	
	
