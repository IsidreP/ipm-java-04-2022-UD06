package package1;

import javax.swing.JOptionPane;

public class Ej05 {

	public static void main(String[] args) {
		
		String numero=JOptionPane.showInputDialog("Introduce un numero");
		int numero2=Integer.parseInt(numero);
	
		
		
		int num[]=numeroBinario(numero2);
		int num1[]=reverse(num, num.length);
		imprimirArray(num1);
	}
		

	public static int[] numeroBinario (int x) {
		
		int num[]=new int[4];
		int div=x;
		for(int i=0;i<num.length;i++) {
			
			num[i]=div%2;
			div=div/2;
		}
		
		return num;
	}
	
    public static int[] reverse(int a[], int n)
    {
        int[] num1 = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            num1[j - 1] = a[i];
            j = j - 1;
        }
        
        return num1;
    }
	
	public static void imprimirArray (int lista[]) {
		
			
		for(int i=0;i<lista.length;i++) {
			System.out.print(lista[i]);
			}
		}

}
