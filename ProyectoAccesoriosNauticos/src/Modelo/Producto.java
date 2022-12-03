package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
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
    
    public static List<Producto> leer(){
        // Variales a utilizar
        List<Producto> lista = new ArrayList<Producto>();
        String registro = "";
        String[] atrregistros = null;
        ArrayList<String> listproductos = null;
        File fileproducto = null;
        FileReader filer = null;
        BufferedReader bufferr = null;
        
        // Manejo de archivos
        try { 
            // Archivos y buffer
            fileproducto = new File(".\\src\\Proyecto\\Productos.txt");
            filer = new FileReader(fileproducto);
            bufferr = new BufferedReader(filer);
            
            // Guardar todos los registros
            while((registro=bufferr.readLine())!=null){
                atrregistros = registro.split(",");
                listproductos = new ArrayList<String>(Arrays.asList(atrregistros));
                // Conertimos los datos y agregamos el objeto Producto
                lista.add(new Producto(
                        Integer.parseInt(listproductos.get(0)),
                        listproductos.get(1),
                        Integer.parseInt(listproductos.get(2)),
                        Double.parseDouble(listproductos.get(3)),
                        Double.parseDouble(listproductos.get(4)),
                        Double.parseDouble(listproductos.get(5)),
                        Double.parseDouble(listproductos.get(6)),
                        Double.parseDouble(listproductos.get(7))
                ));
            }
            
            // Cerrar el archivo
            bufferr.close();
            return lista;
            
        } catch (Exception e) {
            System.out.println("Ha ocurido un error con el archivo: " + e);
        }
        return lista;
    }    
    
    
    
}
