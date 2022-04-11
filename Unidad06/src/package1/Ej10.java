package package1;

import javax.swing.JOptionPane;

public class Ej10 {

	public static void main(String[] args) {
		
		String num1=JOptionPane.showInputDialog("Introduce el tamaño del Array");
		int num2=Integer.parseInt(num1);
		
		int[] a1=rellenar(num2);
		
		int a2[]=new int [10];
        for (int i=0; i<a1.length; i++) {
            if(esPrimo(a1[i])){
                System.out.println("Número primo: " + a1[i]);
                a2[i]=a1[i];
            }
            
        }
        
        mostrarPrimoMayor(a2);
	}
	
	public static int[] rellenar (int num2) {
		
		int num[]=new int[num2];
		int max = 100;
	    int min = 0;
	    int range = max - min;
		
		for(int i=0;i<num.length;i++) {
	
			int resultado= (int) (Math.random()*range);
			num[i]=resultado;
			
		}
		
		return num;
		
	}
	
    private static boolean esPrimo(int num){
        boolean primo = (num==1)?false:true;
        int divisor=2;
        while(primo && divisor<=Math.sqrt(num)){
            if(num%divisor==0){
                primo = false;
            }
            divisor++;
        }
        return primo;
    }
	
	public static void mostrarPrimoMayor (int lista[]) {
	
			int mayor=lista[0];
			
			for (int x = 1; x < lista.length; x++) {
				if (lista[x] > mayor) {
					mayor = lista[x];
				}
			}
			
			System.out.println("El mayor es: " + mayor);
		}

}
