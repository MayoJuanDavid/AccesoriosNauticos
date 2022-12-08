package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import sun.security.util.Length;

/**
 *
 * @author juandavid
 */
public class Entrada extends Pedido{
    //Atributos
    private String proovedor;
    private ArrayList <Producto> Productos;
    
    //Constructor
    public Entrada(int cod, Date fecha_emision, Date fecha_recepcion, double monto_pagar, String proveedor) {
        super(cod, fecha_emision, fecha_recepcion, monto_pagar);
        this.proovedor = proveedor;
        this.Productos = new ArrayList<Producto>();
    }

    //Constructor vacio
    public Entrada() {
        super();
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

    public void setProductos(Producto prod) {
        this.Productos.add(prod);
    }

    public ArrayList<Producto> getProductos() {
        return Productos;
    }

    public String imprimir(){
        return "Cod: " + this.cod + "\tFEmision: " + this.fecha_emision.getDate() + "/" + (this.fecha_emision.getMonth()+1) + "/" + (this.fecha_emision.getYear()+1900) +
                "\tFRecepcion: " + this.fecha_recepcion.getDate() + "/" + (this.fecha_recepcion.getMonth()+1) + "/" + (this.fecha_recepcion.getYear()+1900) + 
                "\tMPagar: " + this.monto_pagar + "\tProveedor: " + this.proovedor; 
    }
    
    public static List<Entrada> leer(List<Producto> lista_productos){
        // Variales a utilizar
        List<Entrada> lista = new ArrayList<Entrada>();
        DateFormat formateador= new SimpleDateFormat("dd/MM/yy");
        String registro = "";
        String[] atrregistros = null;
        ArrayList<String> listentrada = null;
        File fileentrada = null;
        FileReader filer = null;
        BufferedReader bufferr = null;
        Producto prod = null;
        
        // Manejo de archivos
        try { 
            // Archivos y buffer
            fileentrada = new File(".\\src\\Proyecto\\Entradas.txt");
            filer = new FileReader(fileentrada);
            bufferr = new BufferedReader(filer);
            
            // Guardar todos los registros
            while((registro=bufferr.readLine())!=null){
                atrregistros = registro.split(",");
                listentrada = new ArrayList<String>(Arrays.asList(atrregistros));
                // Conertimos los datos y agregamos el objeto Productos
                lista.add(new Entrada(
                        Integer.parseInt(listentrada.get(0)),
                        formateador.parse(listentrada.get(1)),
                        formateador.parse(listentrada.get(2)),
                        Double.parseDouble(listentrada.get(4)),
                        listentrada.get(3)
                ));
            }
            
            // Cerrar el archivo
            bufferr.close();
            
            
            // Recorremos la lista de entradas para ingresarle los productos
            for (Entrada entra: lista){
                // Leer archivo de las entradas
                fileentrada = new File(".\\src\\Proyecto\\EntProd.txt");
                filer = new FileReader(fileentrada);
                bufferr = new BufferedReader(filer);   
                
                // Guardar todos los registros
                while((registro=bufferr.readLine())!=null){
                    atrregistros = registro.split(",");
                    listentrada = new ArrayList<String>(Arrays.asList(atrregistros));
                    // Verificamos si e producto es de 
                    if (entra.getCod() == Integer.parseInt(listentrada.get(1))){
                        // Bucamos el producto y lo agregamos
                        prod = Producto.getProducto(lista_productos, Integer.parseInt(listentrada.get(0)));
                        entra.setProductos(prod);
                    }
                }
                
                bufferr.close();
            }
            return lista;
            
        } catch (Exception e) {
            System.out.println("Ha ocurido un error con el archivo: " + e);
        }
        return lista;
    }   
    
    // Metodo para buscar una entrada
    public static Entrada buscarEntrada(int cod, List<Entrada> lista){
        System.out.println(lista);
        for (Entrada ped: lista)
            if (ped.cod == cod) return ped;
        return null;
    }
    
}
