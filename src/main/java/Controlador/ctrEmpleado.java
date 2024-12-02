// Paquete
package Controlador;

// Importaciones
import java.text.ParseException;
import java.text.SimpleDateFormat;

// Clase
public class ctrEmpleado {
    // Constructor
    public ctrEmpleado() {
    }

    // Validar empleado
    public boolean validarEmpleaado(String nid, String nombre, String apellido, String fechaNac) {
        return validarNid(nid) && validarNombreApellido(nombre) && validarNombreApellido(apellido)
                && validarFecha(fechaNac);
    }

    // Validar nid
    private boolean validarNid(String nid) {
        return nid.matches("\\d+");
    }

    // Validar Nombre o apellido
    private boolean validarNombreApellido(String texto) {
        return texto.matches("[a-zA-Z ]{1,30}");
    }

    // Validar fecha
    private boolean validarFecha(String fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try {
            sdf.parse(fecha);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}