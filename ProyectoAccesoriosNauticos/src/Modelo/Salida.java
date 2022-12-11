package Modelo;


import java.util.Date;


/**
 *
 * @author juandavid
 */
public class Salida extends Pedido{
    //Atributos
    private double ganancia;

    //Constructor
    public Salida(int cod, Date fecha_emision, Date fecha_recepcion, double monto_pagar, double ganancia) {
        super(cod, fecha_emision, fecha_recepcion, monto_pagar);
        this.ganancia = ganancia;
    }

    //Constructor vacio
    public Salida() {
        super();
        this.ganancia = 0.00;
    }
    
    //Getters y setters
    public double getGanancia() {
        return ganancia;
    }
    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }  
    
    // Imprimir datos
    public String imprimir(){
        return "Cod: " + this.cod + "\tFEmision: " + this.fecha_emision.getDate() + "/" + (this.fecha_emision.getMonth()+1) + "/" + (this.fecha_emision.getYear()+1900) +
                "\tFRecepcion: " + this.fecha_recepcion.getDate() + "/" + (this.fecha_recepcion.getMonth()+1) + "/" + (this.fecha_recepcion.getYear()+1900) + 
                "\tMPagar: " + this.monto_pagar + "\tGanancia: " + this.ganancia; 
    }
    
 
}
