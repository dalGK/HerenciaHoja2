package EmpleadosAbstractos;

public class EmpleadosHora extends Empleados{

	public int horasTrabajadas;
	public int precioHora;

	
	public EmpleadosHora(String nombre, String dni, int telefono, int horasTrabajadas, int precioHora) {
		
		super(nombre,dni,telefono);
		this.horasTrabajadas = horasTrabajadas;
		this.precioHora = precioHora;
		
	}


	public int getPrecioHora() {
		return precioHora;
	}
	
	public void setPrecioHora(int precioHora) {
		this.precioHora = precioHora;
	}
	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}


	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}


	@Override
	public String toString() {
		return super.toString()+"EmpleadosHora [horasTrabajadas=" + horasTrabajadas + ", precioHora=" + precioHora + "]";
	}


	@Override
	public void calcularSalario() {
		
		System.out.println("El salario del empleado es: "+horasTrabajadas*precioHora);
		
	}


}
