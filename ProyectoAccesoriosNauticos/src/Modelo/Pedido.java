package Modelo;

import java.util.Calendar;

/**
 *
 * @author juandavid
 */
public abstract class Pedido {
    //Atributos
    protected int cod;
    protected Calendar fecha_emision;
    protected Calendar fecha_recepcion;
    protected double monto_pagar;

    //Constructor
    public Pedido(int cod, Calendar fecha_emision, Calendar fecha_recepcion, double monto_pagar) {
        this.cod = cod;
        this.fecha_emision = fecha_emision;
        this.fecha_recepcion = fecha_recepcion;
        this.monto_pagar = monto_pagar;
    }
    
    //Constructor vacio
    public Pedido() {
        this.cod = 0;
        this.fecha_emision = null;
        this.fecha_recepcion = null;
        this.monto_pagar = 0.00;
    }

    
    //Getters y setters 
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