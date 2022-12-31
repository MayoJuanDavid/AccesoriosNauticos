package Modelo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class Producto {
    // Archivos
    FileWriter filew;
    BufferedWriter bufferw;
    PrintWriter Pfilew;
    
    //Atributos
    private int cod;
    private String nombre;
    private int disponibilidad;
    private double precio_compra;
    private double prentabilidad;
    private double pvpdetal;
    private double pvp2mayor;
    private double ganancia;
    private String imagen;
    private String categoria;
    private double iva;
    private int cantidad;
    
    //Constructor
    public Producto(int cod, String nombre, int disponibilidad, double precio_compra, double prentabilidad, double pvpdetal, double pvp2mayor, double ganancia, String categoria, String imagen) {
        this.cod = cod;
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
        this.precio_compra = precio_compra;
        this.prentabilidad = prentabilidad;
        this.pvpdetal = pvpdetal;
        this.pvp2mayor = pvp2mayor;
        this.ganancia = ganancia;
        this.imagen = imagen;
        this.categoria = categoria;
        this.iva = 0.0;
        this.cantidad = 0;
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
        this.imagen = "";
        this.iva = 0.0;
        this.cantidad = 0;
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
    
    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getIva() {
        return iva;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
    public static Producto getProducto(List<Producto> lista_producto, int cod){
        for (Producto prod: lista_producto){
            if (cod == prod.getCod()) return prod;
        }
        return null;
    }
    
    public String imprimir(){
        return "Cod: " + this.cod + "\tNombre: " + this.nombre + "\tDisp: " + this.disponibilidad + "\tPCompra: " + this.precio_compra + 
                "\tPRent: " + this.prentabilidad + "\tPvpD: " + this.pvpdetal + "\tPvp2: " + this.pvp2mayor + "\tGanancia: " + this.ganancia; 
    }
    
    
}
