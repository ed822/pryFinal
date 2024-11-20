// Paquete
package Modelo;

// Modelo cliente
public class modCliente {
    // Privado
    private int nid;
    private String nombre;
    private String apellido;
    private String tipo;
    private int ntel;
    private String direccion;
    private String email;

    // Constructor
    public modEmpleado(int nid, String nombre, String apellido, String tipo, int ntel, String dirrecion, String email) {
        this.nid = nid;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipo = tipo;
        this.ntel = ntel;
        this.dirrecion = dirrecion;
        this.email = email;
    }

    // Getters
    public int getNid() { return nid; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getTipo() { return tipo; }
    public int getNtel() { return ntel; }
    public String getDirrecion() { return direccion; }
    public String getEmail() { return email; }
    
    // Setters
    public void setNid(int nid) { this.nid = nid; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setNtel(int ntel) { this.ntel = ntel; }
    public void setDirrecion(String direccion) { this.direccion = direccion; }
    public void setEmail(String email) { this.email = email; }
}