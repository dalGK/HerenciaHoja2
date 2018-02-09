package Figuras;

public class Poligono extends Figuras {

	private int numLados;
	
	public Poligono() {
		
	}
	
	public Poligono(String color,int numLados) {
		super(color);
		this.numLados = numLados;
	}

	public int getNumLados() {
		return numLados;
	}

	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}

	@Override
	public String toString() {
		return "Poligono [numLados=" + numLados + "]";
	}

	@Override
	public void area() {
		
	}

	@Override
	public void perimetro() {
	
		
	}
	
	
}
