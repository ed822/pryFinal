// Paquete
package Modelo;

// Modelo mascota
public class modMascota {
    // Privado
    private int idOwner;
    private String nombre;
    private String raza;
    private String edad;
    private String sexo;
    private int peso;

    // Constructor
    public modEmpleado(int idOwner, String nombre, String raza, String edad, String sexo, int peso) {
        this.idOwner = idOwner;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
    }

    // Getters
    public int getidOwner() { return idOwner;}
    public String getnombre() { return nombre;}
    public String getraza() { return raza;}
    public String getedad() { return edad;}
    public String getsexo() { return sexo;}
    public int getpeso() { return peso;}

    // Setters
    public void setidOwner(int idOwner) { this.idOwner = idOwner;}
    public void setnombre(String nombre) { this.nombre = nombre;}
    public void setraza(String raza) { this.raza = raza;}
    public void setedad(String edad) { this.edad = edad;}
    public void setsexo(String sexo) { this.sexo = sexo;}
    public void setpeso(int peso) { this.peso = peso;}
}