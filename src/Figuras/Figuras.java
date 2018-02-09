package Figuras;

public abstract class Figuras {

	private String color;
	
	
	public abstract void area();
	public abstract void perimetro();
	
	public Figuras() {
		
	}
	public Figuras(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Figuras [color=" + color + "]";
	}
	
	
}
