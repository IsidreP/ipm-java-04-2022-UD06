package package1;

import javax.swing.JOptionPane;

public class Ej11 {

	public static void main(String[] args) {
		
		String num1=JOptionPane.showInputDialog("Introduce la dimension de los arrays");
		int num2=Integer.parseInt(num1);
		
		int a1[][]=new int [2][num2];
		int a2[][]=new int [2][num2];
		
		int [][] a11=rellenarAleatorio(a1);
		int [][] a22=rellenarOrdenado(a2);
		int [][] a33=multiplica(a11, a22, num2);
		
		System.out.print("[");
		mostrarArrays(a11);
		System.out.print("]");
		System.out.print("\n");
		System.out.print("[");
		mostrarArrays(a22);
		System.out.print("]");
		System.out.print("\n");
		System.out.print("[");
		mostrarArrays(a33);
		System.out.print("]");
	}
	
	
	public static int[][] rellenarAleatorio (int [][] num) {
		
		int max = 100;
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
	
	public static int[][] rellenarOrdenado (int [][] num1) {
		
		int x=1;
		for(int i=0;i<num1.length;i++) {
			for (int j = 0; j < num1[0].length; j++) {
				
				int resultado= x++;
				num1[i][j]=resultado;
			}
		}
		
		return num1;
		
	}
	
	
	public static int[][] multiplica (int [][] a, int [][] b, int num2) {
		
	    int[][] c = new int[a.length][num2];
	    
	        for (int i = 0; i < a.length; i++) {
	            for (int j = 0; j < num2; j++) {
	               
	                    c[i][j] += a[i][j] * b[i][j];
	                
	        }
	    }

	    return c;
	}
	
	
	public static void mostrarArrays (int lista[][]) {
		
		
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista[0].length; j++) {
				System.out.print(+lista[i][j]+",");
			}
		}
	}
		
		
}


