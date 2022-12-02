package Modelo;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author juandavid
 */
public class Factura {
    //Atributos
    private int cod;
    private Calendar fecha;
    private double iva;
    private double montoTotal;
    private ArrayList <Cliente> Clientes;

    //Constructor
    public Factura(int cod, Calendar fecha, double iva, double montoTotal, ArrayList<Cliente> Clientes) {
        this.cod = cod;
        this.fecha = fecha;
        this.iva = iva;
        this.montoTotal = montoTotal;
        this.Clientes = Clientes;
    }

    //Constructor vacio
    public Factura() {
        this.cod = 0;
        this.fecha = null;
        this.iva = 0.00;
        this.montoTotal = 0.00;
        this.Clientes = null;
    }
    
    //Getters y setters
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }

    public void setClientes(ArrayList<Cliente> Clientes) {
        this.Clientes = Clientes;
    }
    
    
    
}
