/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import java.util.List;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Windows 10
 */
public class ControladorArchivo {
    
    
    //Metodos del controlador
    public ControladorArchivo(){}
    
    //Metodo que devuelve una lista de productos proporcionada por un archivo txt
    public List<Producto> leerArchivoProducto(){
                // Variales a utilizar
        List<Producto> lista = new ArrayList<Producto>();
        String registro = "";
        String[] atrregistros = null;
        ArrayList<String> listproductos = null;
        File fileproducto = null;
        FileReader filer = null;
        BufferedReader bufferr = null;
        
        // Manejo de archivos
        try { 
            // Archivos y buffer
            fileproducto = new File(".\\src\\Proyecto\\Productos.txt");
            filer = new FileReader(fileproducto);
            bufferr = new BufferedReader(filer);
            
            // Guardar todos los registros
            while((registro=bufferr.readLine())!=null){
                atrregistros = registro.split(",");
                listproductos = new ArrayList<String>(Arrays.asList(atrregistros));
                // Conertimos los datos y agregamos el objeto Producto
                lista.add(new Producto(
                        Integer.parseInt(listproductos.get(0)),
                        listproductos.get(1),
                        Integer.parseInt(listproductos.get(2)),
                        Double.parseDouble(listproductos.get(3)),
                        Double.parseDouble(listproductos.get(4)),
                        Double.parseDouble(listproductos.get(5)),
                        Double.parseDouble(listproductos.get(6)),
                        Double.parseDouble(listproductos.get(7)),
                        listproductos.get(8)
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
    
    public List<Entrada> leerArchivoEntrada(List<Producto> lista_productos){
                // Variales a utilizar
        List<Entrada> lista = new ArrayList<Entrada>();
        DateFormat formateador= new SimpleDateFormat("dd/MM/yyyy");
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
            // Variables para fecha
            Date fecha_e = new Date();
            Date fecha_r = new Date();
            // Guardar todos los registros
            while((registro=bufferr.readLine())!=null){
                atrregistros = registro.split(",");
                listentrada = new ArrayList<String>(Arrays.asList(atrregistros));
                // Verificamos si hay una fecha que ingresar
                if (listentrada.get(1).equalsIgnoreCase("")) fecha_e = null;
                else fecha_e = formateador.parse(listentrada.get(1));
                if (listentrada.get(2).equalsIgnoreCase("")) fecha_r = null;
                else fecha_r = formateador.parse(listentrada.get(2));
                // Conertimos los datos y agregamos el objeto Productos
                lista.add(new Entrada(
                        Integer.parseInt(listentrada.get(0)),
                        fecha_e,
                        fecha_r,
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
    
    public List<Salida> leerArchivoSalida(List<Producto> lista_productos) {
        // Variales a utilizar
        List<Salida> lista = new ArrayList<Salida>();
        DateFormat formateador= new SimpleDateFormat("dd/MM/yyyy");
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
            // Variables para fecha
            Date fecha_e = new Date();
            Date fecha_r = new Date();
            // Guardar todos los registros
            while((registro=bufferr.readLine())!=null){
                atrregistros = registro.split(",");
                listsalida = new ArrayList<String>(Arrays.asList(atrregistros));
                // Verificamos si hay una fecha que ingresar
                if (listsalida.get(1).equalsIgnoreCase("")) fecha_e = null;
                else fecha_e = formateador.parse(listsalida.get(1));
                if (listsalida.get(2).equalsIgnoreCase("")) fecha_r = null;
                else fecha_r = formateador.parse(listsalida.get(2));
                // Conertimos los datos y agregamos el objeto Productos
                lista.add(new Salida(
                        Integer.parseInt(listsalida.get(0)),
                        fecha_e,
                        fecha_r,
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
    
    public List<Cliente> leerArchivoCliente() {
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
