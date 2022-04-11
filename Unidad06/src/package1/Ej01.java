package package1;

import javax.swing.JOptionPane;

public class Ej01 {

	public static void main(String[] args) {
		
		String figura=JOptionPane.showInputDialog("De que figura quieres hacer el area: Circulo, Triangulo o Cuadrado");
		
		switch(figura) {
		case "Circulo":
			String circulo=JOptionPane.showInputDialog("Introdure el radio");
			double circulo2=Double.parseDouble(circulo);
			double resultado1=areaCirculo(circulo2);
			JOptionPane.showMessageDialog(null, "El area es: "+resultado1);
			break;
		case "Triangulo":
			String base=JOptionPane.showInputDialog("Introdure la base");
			String altura=JOptionPane.showInputDialog("Introdure la altura");
			double base2=Double.parseDouble(base);
			double altura2=Double.parseDouble(altura);
			double resultado2=areaTriangulo(base2, altura2);
			JOptionPane.showMessageDialog(null, "El area es: "+resultado2);
			break;
		case "Cuadrado":
			String lado=JOptionPane.showInputDialog("Introdure el lado");
			double lado2=Double.parseDouble(lado);
			double resultado3=areaCuadrado(lado2);
			JOptionPane.showMessageDialog(null, "El area es: "+resultado3);	
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Introduce la figura correctamente");
		}
	}
	
	public static double areaCirculo (double radio) {
		int valor=2;
		double resultado= Math.pow(radio, valor)*Math.PI;
		return resultado;
	}
	
	public static double areaTriangulo (double base, double altura) {
		
		double resultado=base*altura/2;
		return resultado;
	}
	
	public static double areaCuadrado (double lado) {
		int valor=2;
		double resultado= Math.pow(lado, valor);
		return resultado;
	}

}
