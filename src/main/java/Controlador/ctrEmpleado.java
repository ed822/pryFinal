/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ctrEmpleado {

    // Constructor
    public ctrEmpleado() {
    }

    public boolean validarEmpleaado(String nid, String nombre, String apellido, String fechaNac) {
        return validarNid(nid) && validarNombreApellido(nombre) && validarNombreApellido(apellido) && validarFecha(fechaNac);
    }

    private boolean validarNid(String nid) {
        return nid.matches("\\d+");
    }

    private boolean validarNombreApellido(String texto) {
        return texto.matches("[a-zA-Z ]{1,30}");
    }

    private boolean validarFecha(String fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        sdf.setLenient(false);
        try {
            Date date = sdf.parse(fecha);
            return true;
        } catch(I) {
            return false;
        }
        
    }
}
