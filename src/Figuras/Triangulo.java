package Figuras;

public class Triangulo extends Poligono {

	private double base;
	private double altura;
	
	public Triangulo() {
		
	}

	public Triangulo(double base,double altura, int numLados,String color) {
		super(color,3);
		this.base = base;
		this.altura = altura;
		
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public void perimetro() {
	 System.out.println(base*getNumLados());
	}
	@Override
	public void area() {
		System.out.println((base*altura)/2);
	}

	@Override
	public String toString() {
		return super.toString()+"Triangulo [base=" + base + "]";
	}

	
	
	
}
