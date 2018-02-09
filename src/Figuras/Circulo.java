package Figuras;

public class Circulo extends Figuras{

	private double radio;
	
	public Circulo() {
		
	}
	
	public Circulo(double radio, String color) {
		super(color);
		this.radio = radio;
	}
	
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		System.out.println(Math.PI*Math.pow(radio, 2)); 
	}

	@Override
	public void perimetro() {
		System.out.println(2*Math.PI*radio);
		
	}

	@Override
	public String toString() {
		return super.toString()+"Circulo [radio=" + radio + "]";
	}

	
	
}
