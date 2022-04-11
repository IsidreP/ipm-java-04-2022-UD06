package package1;

import javax.swing.JOptionPane;

public class Ej08 {

	public static void main(String[] args) {
		
		int[] a1=rellenar();
		mostrar(a1);
	}
	
	public static int[] rellenar () {
		
		int num[]=new int[10];
		
		for(int i=0;i<num.length;i++) {
	
			String num1=JOptionPane.showInputDialog("Introduce un numero");
			int num2=Integer.parseInt(num1);
			
			num[i]=num2;
			
		}
		
		return num;
		
	}
	
	public static void mostrar (int lista[]) {
		
		int b=0;
		
		for(int i=0;i<lista.length;i++) {
			System.out.println("["+b+"]"+lista[i]);
			b++;
			}
		}
	
	

}
