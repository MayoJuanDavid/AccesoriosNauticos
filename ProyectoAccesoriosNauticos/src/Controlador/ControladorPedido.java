/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Entrada;
import Modelo.Pedido;
import Modelo.Producto;
import Modelo.Salida;
import Vista.CrearEntrada;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Windows 10
 */
public class ControladorPedido {
    
    
    public ControladorPedido(){}
    
    // Metodos de funcionalidad
    // Retornamos una lista de pedidos con las entradas y las salidas
    public List<Pedido> generarListaPedidos(List<Entrada> lista_entrada, List<Salida> lista_salida){
        List<Pedido> lista = new ArrayList<Pedido>();
        lista.addAll(lista_entrada);
        lista.addAll(lista_salida);
        return lista;
    }
    
        // Buscamos un pedido
    public static Pedido buscarPedido(int codigo, List<Pedido> list_pedidos){
        for (Pedido ped: list_pedidos)
            if (ped.getCod() == codigo) return ped;
        return null;
    }
    
    public static List<Producto> getProductosNoPedSalida(List<Producto> lista_productos, Salida NSalida){
        List<Producto> lista = new ArrayList<Producto>();
        for (Producto p: lista_productos){
            if (!ControladorProducto.buscarProducto(NSalida.getProductos(), p.getCod())){
                lista.add(p);
            }
        }
        return lista;
    }
    
    public static List<Producto> getProductosNoPedEntrada(List<Producto> lista_productos, Entrada NEntrada){
        List<Producto> lista = new ArrayList<Producto>();
        for (Producto p: lista_productos){
            if (!ControladorProducto.buscarProducto(NEntrada.getProductos(), p.getCod())){
                lista.add(p);
            }
        }
        return lista;
    }
    
    public static void finalizarPedido(List<Pedido> lista_pedidos, int cod){
        for (Pedido p: lista_pedidos){
            if (p.getCod() == cod){
                //// Fecha
                DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String date = dateFormat.format(new Date());
                System.out.println("Se ha actualizado con exito");
                // Modificamos los datos de fecha
                try {
                    p.setFecha_recepcion(dateFormat.parse(date.toString()));
                } catch (ParseException ex) {
                    Logger.getLogger(CrearEntrada.class.getName()).log(Level.SEVERE, null, ex);
                }  
                System.out.println(p.getFecha_recepcion());
            }
        }
    }
    
    public static Entrada insertarProductoDeEntrada(Entrada NEntrada, Producto prod){
        NEntrada.setProductos(prod);
        return NEntrada;
    }
    
    public static Salida insertarProductoDeSalida(Salida NSalida, Producto prod){
        NSalida.setProductos(prod);
        return NSalida;
    }
    
    public static List<Pedido> AgregarPedido(Pedido ped, List<Pedido> lista_pedidos){
        lista_pedidos.add(ped);
        return lista_pedidos;
    }
    
}
