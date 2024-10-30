package presentacion;

import logica.Parcial;

public class Principal {
	
	public static void main(String[] args) {
		Parcial parcial = new Parcial();
		
		try {
			int a = 1;
			int b = -1;
			int c = -6;
			
			double raices[]= parcial.calcularRaices(a, b, c);
			
			System.out.println("Las raices son " + raices[0] + " y "+ raices[1]);
		}
		catch(Exception exception){
			System.out.println(exception.getMessage());
		}
	}

}