package Modelo;

import java.util.ArrayList;
import java.util.Calendar;
//import java.util.Calendar;

/**
 *
 * @author juandavid
 */
public class Entrada extends Pedido{
    //Atributos
    private String proovedor;
    private ArrayList <Producto> Productos;

    
    //Constructor
    public Entrada(String proovedor, ArrayList Productos) {
        this.proovedor = proovedor;
        this.Productos = Productos;
    }
    
    //Constructor vacio
    public Entrada() {
        this.proovedor = null;
        this.Productos = null;
    }
    
    //Getters y setters
    public String getProovedor() {
        return proovedor;
    }

    public void setProovedor(String proovedor) {
        this.proovedor = proovedor;
    }

    public ArrayList<Producto> getProductos() {
        return Productos;
    }

    public void setProductos(ArrayList<Producto> Productos) {
        this.Productos = Productos;
    }

    
    //Getter y setters padre
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
