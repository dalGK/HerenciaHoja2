package Figuras;

public class Rectangulo extends Poligono{

	private int base;
	private int altura;
	
	public Rectangulo() {
		
	}
	
	public Rectangulo(int base, int altura, String color,int numLados) {
		super(color, 4);
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	@Override
	public void area() {
		System.out.println(base*altura);
	}
	public void perimetro() {
	
	System.out.println((base*2)+(altura*2));	
		
	}
	
	
	@Override
	public String toString() {
	
	//	return super.toString()+"Rectangulo [base=" + base + ", altura=" + altura + "]";
	return 	"Soy una figura de color "+getAltura()+". Además soy un polígono y un rectángulo"
			+ " con 4 lados: Mi área es "+" y mi perímetro es ";
	

	}
	
}
