package Modelo;


import java.util.Date;


/**
 *
 * @author juandavid
 */
public class Entrada extends Pedido{
    //Atributos
    private String proovedor;
    
    
    //Constructor
    public Entrada(int cod, Date fecha_emision, Date fecha_recepcion, double monto_pagar, String proveedor) {
        super(cod, fecha_emision, fecha_recepcion, monto_pagar);
        this.proovedor = proveedor;
    }

    //Constructor vacio
    public Entrada() {
        super();
        this.proovedor = null;
    }
    
    //Getters y setters
    public String getProovedor() {
        return proovedor;
    }

    public void setProovedor(String proovedor) {
        this.proovedor = proovedor;
    }

    public String imprimir(){
        return "Cod: " + this.cod + "\tFEmision: " + this.fecha_emision.getDate() + "/" + (this.fecha_emision.getMonth()+1) + "/" + (this.fecha_emision.getYear()+1900) +
                "\tFRecepcion: " + ((this.fecha_recepcion != null)? this.fecha_recepcion.getDate(): "null") + "/" + 
                ((this.fecha_recepcion != null)? this.fecha_recepcion.getMonth()+1: "null") + "/" + 
                ((this.fecha_recepcion != null)? this.fecha_recepcion.getYear()+1900: "null") + 
                "\tMPagar: " + this.monto_pagar + "\tProveedor: " + this.proovedor; 
    }
    
   
}
