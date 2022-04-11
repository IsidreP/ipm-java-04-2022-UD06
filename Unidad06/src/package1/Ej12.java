package package1;

import javax.swing.JOptionPane;

public class Ej12 {

	public static void main(String[] args) {
		
		String num1=JOptionPane.showInputDialog("Introduce la primera dimension del array");
		int num2=Integer.parseInt(num1);
		
		String num3=JOptionPane.showInputDialog("Introduce la segunda dimension del array");
		int num4=Integer.parseInt(num3);
		
		int a1[][]=new int [num2][num4];
		
		int [][] a11=rellenarAleatorio(a1);
		
		System.out.print("[");
		mostrarArrays(a11);
		System.out.print("]");
		System.out.print("\n");
		
		String num5=JOptionPane.showInputDialog("Pon un numero del 0 al 9");
		int num6=Integer.parseInt(num5);
		
		int [][] a22=acabadosEnNumero(a11, num6, num2, num4);
		
		System.out.print("[");
		mostrarArrays(a22);
		System.out.print("]");

	}
	
	public static int[][] rellenarAleatorio (int [][] num) {
		
		int max = 300;
	    int min = 0;
	    int range = max - min;
		
		for(int i=0;i<num.length;i++) {
			for (int j = 0; j < num[0].length; j++) {
				
				int resultado= (int) (Math.random()*range);
				num[i][j]=resultado;
			}
		}
		
		return num;
		
	}
	
	public static int[][] acabadosEnNumero (int [][] a, int num6, int num2, int num4) {
		
		int a2[][]=new int [num2][num4];
		
		for(int i=0;i<a.length;i++) {
			for (int j = 0; j < a.length; j++) {
				
				if(a[i][j]%10==num6) {
					int resultado=a[i][j];
					a2[i][j]=resultado;	
				}
			}
		}
		
		return a2;
		
	}
	
	public static void mostrarArrays (int lista[][]) {
		
		
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista[0].length; j++) {
				System.out.print(+lista[i][j]+",");
			}
		}
	}

}
