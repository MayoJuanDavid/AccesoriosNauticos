package Modelo;

/**
 *
 * @author juandavid
 */
public class Producto {
    //Atributos
    private int cod;
    private String nombre;
    private int disponibilidad;
    private double precio_compra;
    private double prentabilidad;
    private double pvpdetal;
    private double pvp2mayor;
    private double ganancia;

    
    //Constructor
    public Producto(int cod, String nombre, int disponibilidad, double precio_compra, double prentabilidad, double pvpdetal, double pvp2mayor, double ganancia) {
        this.cod = cod;
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
        this.precio_compra = precio_compra;
        this.prentabilidad = prentabilidad;
        this.pvpdetal = pvpdetal;
        this.pvp2mayor = pvp2mayor;
        this.ganancia = ganancia;
    }

    //Constructor vacio
    public Producto() {
        this.cod = 0;
        this.nombre = null;
        this.disponibilidad = 0;
        this.precio_compra = 0.00;
        this.prentabilidad = 0.00;
        this.pvpdetal = 0.00;
        this.pvp2mayor = 0.00;
        this.ganancia = 0.00;
    }
    
    //Getters y setters
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public double getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(double precio_compra) {
        this.precio_compra = precio_compra;
    }

    public double getPrentabilidad() {
        return prentabilidad;
    }

    public void setPrentabilidad(double prentabilidad) {
        this.prentabilidad = prentabilidad;
    }

    public double getPvpdetal() {
        return pvpdetal;
    }

    public void setPvpdetal(double pvpdetal) {
        this.pvpdetal = pvpdetal;
    }

    public double getPvp2mayor() {
        return pvp2mayor;
    }

    public void setPvp2mayor(double pvp2mayor) {
        this.pvp2mayor = pvp2mayor;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }
    
    
    
    
    
    
}
