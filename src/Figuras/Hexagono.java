package Figuras;



public class Hexagono extends Poligono{

	private int lado;
	private int apotema;
	
	public Hexagono() {
		
	}
	public Hexagono(int lado, int apotema, int numLados, String color) {
		super(color,numLados);
		this.lado = lado;
		this.apotema = apotema;
		
	}
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	public int getApotema() {
		return apotema;
	}
	public void setApotema(int apotema) {
		this.apotema = apotema;
	}
	@Override
	public void perimetro() {
	System.out.println(lado*getNumLados());
		
	}
	@Override
	public void area() {
	
		double perimetro = lado*getNumLados();
		System.out.println((perimetro*apotema)/2 );
	}
	@Override
	public String toString() {
		return "Hexagono [lado=" + lado + ", apotema=" + apotema + "]";
	}
	
}
