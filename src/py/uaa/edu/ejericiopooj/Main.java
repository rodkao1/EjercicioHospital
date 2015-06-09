package py.uaa.edu.ejericiopooj;
import java.util.Scanner;
public class Main {

	
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int d;
       String grupoSanguineo;
       System.out.print("Introduzca el nro de Historia Clinica");
       
       for (d = 1; d <= 100; d ++); {
    	   if (sc = );
       }
       
  
		
		
		
		Medico c = new Medico();
		c.setCantidadHoras(2);
		c.setSalarioBase(5000);
		c.calcularSalario();
		c.setCantidadPacientes(2);
		c.setDiasVacaciones(2);
		c.calcularSalarioBaseDiario();
		c.pagarVacaciones();
		
		Empleado m = new Empleado();
		m.setCantidadHoras(2);
		m.setDiasVacaciones(2);
		m.setSalarioBase(2000000);
		m.calcularSalario();
		m.calcularSalarioBaseDiario();
		m.pagarVacaciones();
		
		
		System.out.println("El salario es:" + " " + m.getSalario());
		System.out.println("Pagar vacaciones =" + " " +  m.getVacaciones());
		
		System.out.println("El sueldo es:" + " "  + c.getSalario());
		System.out.println("Vacaciones" + " " + c.getVacaciones());
	}
}
