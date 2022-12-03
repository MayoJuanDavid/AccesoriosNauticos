package Proyecto;

// Paquetes a utilizar
import Modelo.Cliente;
import Modelo.Entrada;
import Modelo.Producto;
import Modelo.Salida;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccesoriosNauticos {
    
    // Variables a utilizar
    public static List<Producto> lista_productos = new ArrayList<Producto>(); 
    public static List<Cliente> lista_clientes = new ArrayList<Cliente>(); 
    public static List<Entrada> lista_entradas = new ArrayList<Entrada>(); 
    public static List<Salida> lista_salida = new ArrayList<Salida>(); 
    
    // Programa pricipal
    public static void main (String[] args){
        lista_productos = Producto.leer();
        lista_clientes = Cliente.leer();
        lista_entradas = Entrada.leer(lista_productos);
        lista_salida = Salida.leer(lista_productos);
        
        /*for (Salida cli: lista_salida){
            System.out.println(cli.imprimir());
            for (Producto prod: cli.getProductos())
                System.out.println("\t" + prod.imprimir());
            System.out.println("");
            System.out.println("");
        }*/
            
    }
}
