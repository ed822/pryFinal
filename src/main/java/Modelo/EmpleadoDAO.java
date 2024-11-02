// paquete
package Modelo;

// Importaciones
import java.io.IOException;
import java.util.List;

// Clase
public class EmpleadoDAO {
	// Variables

	private final String rutaArchivo = "empleado.json";

	// Agregar empleado
	public boolean agragarEmpleado(modEmpleado empleado) throws IOException {
		List<modEmpleado> empleados = obtenerEmpleado();
		for (modEmpleado e : empleados) {
			if (e.getNid() == empleado.getNid()) {
				return false;

			}
		}
		empleados.add(empleado);
		guardarEmpleados(empleados);
	}

	public boolean modificarEmpleado(modEmpleado empleado) throws IOException {
		List<modEmpleado> empleados = obtenerEmpleados();
		for (int i = 0; i < empleados.size(); i++) {
			if (empleados.get(i).getNid() == empleado.getNid()) {
				empleados.set(i, empleado);
				guardarEmpleados(empleados);
				return true;
			}
		}
		return false;
	}

	public boolean eliminarEmpleado(int nid) throws IOException {
		List<modEmpleado> empleados = obternerEmpleados();
		for (int i = 0; i < empleados.size(); i++) {
			if (empleados.get(i).getNid() == nid) {
				empleados.remove(i);
				guardarEmpleados(empleados);
				return true;
			}
		}
		return false;
	}
}
