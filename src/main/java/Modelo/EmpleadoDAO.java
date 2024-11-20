// Paquete
package Modelo;

// Importaciones
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

// Empleado DAO
public class EmpleadoDAO {
    // Variables
    private final String rutaArchivo = "empleado.json";

    // Agregar empleado
    public boolean agregarEmpleado(modEmpleado empleado) throws IOException {
        List<modEmpleado> empleados = obtenerEmpleados();
        for (modEmpleado e : empleados) {
            if (e.getNid() == empleado.getNid()) {
                return false;
            }
        }
        empleados.add(empleado);
        guardarEmpleados(empleados);
        return true;
    }

	// Modificar empleado
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

	// Eliminar empleado
    public boolean eliminarEmpleado(int nid) throws IOException {
        List<modEmpleado> empleados = obtenerEmpleados();
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getNid() == nid) {
                empleados.remove(i);
                guardarEmpleados(empleados);
                return true;
            }
        }
        return false;
    }

    // Guardar empleados (en rutaArchivo)
    private void guardarEmpleados(List<modEmpleado> empleados) throws IOException {
        Gson gson = new Gson();
        try (FileWriter fw = new FileWriter(rutaArchivo)) {
            gson.toJson(empleados, fw);
        }
    }

    // Obtener empleados
    private List<modEmpleado> obtenerEmpleados() throws IOException {
        Gson gson = new Gson();
        try (FileReader fr = new FileReader(rutaArchivo)) {
            return gson.fromJson(fr, new TypeToken<List<modEmpleado>>() {}.getType());
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }
}