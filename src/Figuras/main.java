package Figuras;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangulo tri = new Triangulo(2,5,3,"Verde");
		Circulo cir = new Circulo(5,"Rojo");
		Hexagono hex = new Hexagono(10,10,6,"Verde");
		Rectangulo rec= new Rectangulo(5,10,"Verde",4);
		tri.area();
		tri.perimetro();
		cir.area();
		cir.perimetro();
		hex.area();
		hex.perimetro();
		rec.getperimetro();
	

		
	}

}
