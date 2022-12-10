package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

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
    
    // Leer datos de un archivo
    public static List<Salida> leer(List<Producto> lista_productos){
        // Variales a utilizar
        List<Salida> lista = new ArrayList<Salida>();
        DateFormat formateador= new SimpleDateFormat("dd/MM/yy");
        String registro = "";
        String[] atrregistros = null;
        ArrayList<String> listsalida = null;
        File filesalida = null;
        FileReader filer = null;
        BufferedReader bufferr = null;
        BufferedReader buffersalida = null;
        Producto prod = null;
        
        // Manejo de archivos
        try { 
            // Archivos y buffer
            filesalida = new File(".\\src\\Proyecto\\Salidas.txt");
            filer = new FileReader(filesalida);
            bufferr = new BufferedReader(filer);
            
            // Guardar todos los registros
            while((registro=bufferr.readLine())!=null){
                atrregistros = registro.split(",");
                listsalida = new ArrayList<String>(Arrays.asList(atrregistros));
                // Conertimos los datos y agregamos el objeto Productos
                lista.add(new Salida(
                        Integer.parseInt(listsalida.get(0)),
                        formateador.parse(listsalida.get(1)),
                        formateador.parse(listsalida.get(2)),
                        Double.parseDouble(listsalida.get(3)),
                        Double.parseDouble(listsalida.get(4))
                ));
            }
            
            // Cerrar el archivo
            bufferr.close();
            
            // Recorremos la lista de entradas para ingresarle los productos
            for (Salida salida: lista){
                // Leer archivo de las entradas
                filesalida = new File(".\\src\\Proyecto\\SalProd.txt");
                filer = new FileReader(filesalida);
                buffersalida = new BufferedReader(filer);   
                // Guardar todos los registros
                while((registro=buffersalida.readLine())!=null){
                    atrregistros = registro.split(",");
                    listsalida = new ArrayList<String>(Arrays.asList(atrregistros));
                    // Verificamos si e producto es de 
                    if (salida.getCod() == Integer.parseInt(listsalida.get(1))){
                        // Bucamos el producto y lo agregamos
                        prod = Producto.getProducto(lista_productos, Integer.parseInt(listsalida.get(0)));
                        salida.setProductos(prod);
                    }
                }
                
                buffersalida.close();
            }
            return lista;
        } catch (Exception e) {
            System.out.println("Ha ocurido un error con el archivo: " + e);
        }
        return lista;
    }
}
