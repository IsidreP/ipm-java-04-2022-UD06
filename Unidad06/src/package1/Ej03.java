package package1;

import javax.swing.JOptionPane;

public class Ej03 {

	public static void main(String[] args) {
		
		String numero=JOptionPane.showInputDialog("Introduce un numero");
		double numero2=Double.parseDouble(numero);
		
		boolean resultado=numeroPrimo(numero2);
		
		if(resultado==true) {
			System.out.print("El numero que has introducido es primo");
		}else {
			System.out.print("El numero que has introducido NO es primo");
		}

	}
	
	public static boolean numeroPrimo (double numero2) {
		
		boolean resultado;
		
		double div1=numero2%2;
		double div2=numero2%3;
		double div3=numero2%5;
		double div4=numero2%7;
		double div5=numero2%11;
		
		
		if(numero2==2 || numero2==3 || numero2==5 || numero2==7){
			resultado=true;
		}else if(div1==0 || div2==0 || div3==0 || div4==0 || div5==0 || numero2==1){
			resultado=false;
		}else {
			resultado=true;
		}
		
		return resultado;
	}

}
