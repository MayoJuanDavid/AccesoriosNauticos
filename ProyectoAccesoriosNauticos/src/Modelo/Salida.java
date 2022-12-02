package Modelo;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author juandavid
 */
public class Salida extends Pedido{
    //Atributos
    private double ganancia;
    private ArrayList <Producto> Productos;

    //Constructor
    public Salida(double ganancia, ArrayList<Producto> Productos) {
        this.ganancia = ganancia;
        this.Productos = Productos;
    }

    //Constructor vacio
    public Salida() {
        this.ganancia = 0.00;
        this.Productos = null;
    }
    
    //Getters y setters
    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public ArrayList<Producto> getProductos() {
        return Productos;
    }

    public void setProductos(ArrayList<Producto> Productos) {
        this.Productos = Productos;
    }

    
    //Getters y setters Padre
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Calendar getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Calendar fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public Calendar getFecha_recepcion() {
        return fecha_recepcion;
    }

    public void setFecha_recepcion(Calendar fecha_recepcion) {
        this.fecha_recepcion = fecha_recepcion;
    }

    public double getMonto_pagar() {
        return monto_pagar;
    }

    public void setMonto_pagar(double monto_pagar) {
        this.monto_pagar = monto_pagar;
    }

    
    
    
}
