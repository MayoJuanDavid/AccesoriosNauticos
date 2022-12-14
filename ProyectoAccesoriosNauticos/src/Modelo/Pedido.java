package Modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author juandavid
 */
public abstract class Pedido {
    //Atributos
    protected int cod;
    protected Date fecha_emision;
    protected Date fecha_recepcion;
    protected double monto_pagar;
    private ArrayList <Producto> Productos;

    //Constructor
    public Pedido(int cod, Date fecha_emision, Date fecha_recepcion, double monto_pagar) {
        this.cod = cod;
        this.fecha_emision = fecha_emision;
        this.fecha_recepcion = fecha_recepcion;
        this.monto_pagar = monto_pagar;
        this.Productos = new ArrayList<Producto>();
    }
    
    //Constructor vacio
    public Pedido() {
        this.cod = 0;
        this.fecha_emision = null;
        this.fecha_recepcion = null;
        this.monto_pagar = 0.00;
        this.Productos = new ArrayList<Producto>();
    }

    
    //Getters y setters 
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public Date getFecha_emision() {
        return fecha_emision;
    }
    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }
    public Date getFecha_recepcion() {
        return fecha_recepcion;
    }
    public void setFecha_recepcion(Date fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }
    public double getMonto_pagar() {
        return monto_pagar;
    }
    public ArrayList<Producto> getProductos() {
        return Productos;
    }
    
    
    public void setMonto_pagar(double monto_pagar) {
        this.monto_pagar = monto_pagar;
    }
    public void setProductos(Producto prod) {
        this.Productos.add(prod);
    }
    
    // Metodo de impresion
    public abstract String imprimir();
    
    
    
}
