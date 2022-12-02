package Modelo;

/**
 *
 * @author juandavid
 */
public class Cliente {
    //Atributos
    private int cod;
    private int cedularif;
    private String nombre;
    private String direccion;
    private String telefono;

    //constructor
    public Cliente(int cod, int cedularif, String nombre, String direccion, String telefono) {
        this.cod = cod;
        this.cedularif = cedularif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //Constructor vacio
    public Cliente() {
        this.cod = 0;
        this.cedularif = 0;
        this.nombre = null;
        this.direccion = null;
        this.telefono = null;
    }
    
    //Getters y setters
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCedularif() {
        return cedularif;
    }

    public void setCedularif(int cedularif) {
        this.cedularif = cedularif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
