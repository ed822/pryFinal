// Paquete
package Modelo;

// Modelo empleado
public class modEmpleado {
    // Privado
    private int id;
    private String nombre;
    private String apellido;
    private String fechaNac;
    private String genero;
    private String cargo;

    // Constructor
    public modEmpleado(int id, String nombre, String apellido, String fechaNac, String genero, String cargo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.genero = genero;
        this.cargo = cargo;
    }

    // Getters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getFechaNac() { return fechaNac; }
    public String getGenero() { return genero; }
    public String getCargo() { return cargo; }
    
    // Setters
    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setFechaNac(String fechaNac) { this.fechaNac = fechaNac; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setCargo(String cargo) { this.cargo = cargo; }
}