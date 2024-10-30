package logica;

public class Parcial {
	
	public double[] calcularRaices(int a, int b, int c) throws Exception {
		
		double discriminante = b*b - 4*a*c;
		
		if (a==0) {
			throw new Exception("a no puede ser 0, la ecuación no sería cuadrática");
		}
		
		if (discriminante<0) {
			throw new Exception("La solución no es real, es compleja");
		}
		
		double respuesta1 = (-b+ Math.sqrt(discriminante))/(2*a);
		double respuesta2 = (-b- Math.sqrt(discriminante))/(2*a);
		
		double[] raices= {respuesta1,respuesta2};
		return raices;
	}

}
