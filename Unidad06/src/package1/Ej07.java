package package1;

import javax.swing.JOptionPane;

public class Ej07 {

	public static void main(String[] args) {
		
		String numero=JOptionPane.showInputDialog("Introduce la cantidad de euros");
		float numero2=Float.parseFloat(numero);

		
		conversion(numero2);
	}
	
	public static void conversion (float num) {
		
		
		float a=0.86f;
		float b=1.28611f;
		float c=129.852f;
		float x=0;
		float y=0;
		float z=0;
		
		x=num*a;
		y=num*b;
		z=num*c;


		System.out.println("Corresponde a "+x+" Libras");
		System.out.println("Corresponde a "+y+" Dolares");
		System.out.println("Corresponde a "+z+" Yenes");
	}
	
		
		

	


}
