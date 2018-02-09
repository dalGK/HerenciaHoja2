package EmpleadosAbstractos;

public class EmpleadosFijos extends Empleados{

	public int salarioMes;
	

	public EmpleadosFijos(String nombre, String dni, int telefono, int salarioMes) {
		super(nombre, dni, telefono);
		this.salarioMes = salarioMes;
	}

	public int getSalarioMes() {
		return salarioMes;
	}

	public void setSalarioMes(int salarioMes) {
		this.salarioMes = salarioMes;
	}

	@Override
	public String toString() {
		return super.toString()+"EmpleadosFijos [salarioMes=" + salarioMes + "]";
	}

	@Override
	public void calcularSalario() {
		
		System.out.println(this.getSalarioMes());
		
	}
	
	
	
	
	
	
	
	
}
