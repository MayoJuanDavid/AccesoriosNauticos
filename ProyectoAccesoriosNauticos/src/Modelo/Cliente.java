package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author juandavid
 */
public class Cliente {
    //Atributos
    private int cod;
    private int cedularif;
    private String nombre;
    private String direccion;
    private String telefono;

    //constructor
    public Cliente(int cod, int cedularif, String nombre, String direccion, String telefono) {
        this.cod = cod;
        this.cedularif = cedularif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //Constructor vacio
    public Cliente() {
        this.cod = 0;
        this.cedularif = 0;
        this.nombre = null;
        this.direccion = null;
        this.telefono = null;
    }
    
    //Getters y setters
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCedularif() {
        return cedularif;
    }

    public void setCedularif(int cedularif) {
        this.cedularif = cedularif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String imprimir(){
        return "Cod: " + this.cod + "\tCedula: " + this.cedularif + "\tNombre: " + this.nombre + "\tDireccion: " + this.direccion + 
                "\tTelefono: " + this.telefono; 
    }
    
    public static List<Cliente> leer(){
        // Variales a utilizar
        List<Cliente> lista = new ArrayList<Cliente>();
        String registro = "";
        String[] atrregistros = null;
        ArrayList<String> listclientes = null;
        File fileclientes = null;
        FileReader filer = null;
        BufferedReader bufferr = null;
        
        // Manejo de archivos
        try { 
            // Archivos y buffer
            fileclientes = new File(".\\src\\Proyecto\\Clientes.txt");
            filer = new FileReader(fileclientes);
            bufferr = new BufferedReader(filer);
            
            // Guardar todos los registros
            while((registro=bufferr.readLine())!=null){
                atrregistros = registro.split(",");
                listclientes = new ArrayList<String>(Arrays.asList(atrregistros));
                // Conertimos los datos y agregamos el objeto Producto
                lista.add(new Cliente(
                        Integer.parseInt(listclientes.get(0)),
                        Integer.parseInt(listclientes.get(1)),
                        listclientes.get(2),
                        listclientes.get(3),
                        listclientes.get(4)
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
