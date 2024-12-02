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
    public modMascota(int idOwner, String nombre, String raza, String edad, String sexo, int peso) {
        this.idOwner = idOwner;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
    }

    // Getters
    public int getIdOwner() { return idOwner;}
    public String getNombre() { return nombre;}
    public String getRaza() { return raza;}
    public String getEdad() { return edad;}
    public String getSexo() { return sexo;}
    public int getPeso() { return peso;}

    // Setters
    public void setIdOwner(int idOwner) { this.idOwner = idOwner;}
    public void setNombre(String nombre) { this.nombre = nombre;}
    public void setRaza(String raza) { this.raza = raza;}
    public void setEdad(String edad) { this.edad = edad;}
    public void setSexo(String sexo) { this.sexo = sexo;}
    public void setPeso(int peso) { this.peso = peso;}
}