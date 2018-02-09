package EmpleadosAbstractos;

import java.util.Scanner;

public class PrincipalEmpleados {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	 int nElementos;
	 EmpleadosFijos empF1 = new EmpleadosFijos("Juana","R322313",60323212,120000);
	 EmpleadosFijos empF2 = new EmpleadosFijos("Juan", "3000032k", 623423422, 130000);
	 EmpleadosHora empH1 = new EmpleadosHora("Pepapig", "30000K", 675159092, 10, 5);
	 EmpleadosHora empH2 = new EmpleadosHora("Pepopigo", "232323E", 235235235, 200, 5);
	 Empleados ArrayEmp[] = {empF1,empF2,empH1, empH2};
	 
	 for(Empleados i:ArrayEmp) {
		 System.out.println("Empleados: "+i);
	 }
	 empH1.calcularSalario();
	 empH2.calcularSalario();

	}

}
