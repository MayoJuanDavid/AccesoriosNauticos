/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Entrada;
import Modelo.Pedido;
import Modelo.Producto;
import Modelo.Salida;
import Proyecto.AccesoriosNauticos;
import Vista.CrearEntrada;
import Vista.CrearSalida;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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
    
    // Metodo que busca un pedido
    public static Pedido buscarPedido(int codigo, List<Pedido> list_pedidos){
        for (Pedido ped: list_pedidos)
            if (ped.getCod() == codigo) return ped;
        return null;
    }
    // Metodo que obtiene los productos de un pedido de entrada
    public static List<Producto> getProductosNoPedSalida(List<Producto> lista_productos, Salida NSalida){
        List<Producto> lista = new ArrayList<Producto>();
        for (Producto p: lista_productos){
            if (!ControladorProducto.buscarProducto(NSalida.getProductos(), p.getCod())){
                lista.add(p);
            }
        }
        return lista;
    }
    // Metodo que obtiene los productos de un pedido de salida
    public static List<Producto> getProductosNoPedEntrada(List<Producto> lista_productos, Entrada NEntrada){
        List<Producto> lista = new ArrayList<Producto>();
        for (Producto p: lista_productos){
            if (!ControladorProducto.buscarProducto(NEntrada.getProductos(), p.getCod())){
                lista.add(p);
            }
        }
        return lista;
    }
    // Metodo que finaliza un pedido
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
    // Metodo que inserta un producto a un pedido de entrada
    public static Entrada insertarProductoDeEntrada(Entrada NEntrada, Producto prod){
        NEntrada.setProductos(prod);
        return NEntrada;
    }
    // Metodo que inserta un producto a un pedido de salida
    public static Salida insertarProductoDeSalida(Salida NSalida, Producto prod){
        NSalida.setProductos(prod);
        return NSalida;
    }
    // Metodo que agrega un pedido a la lista de pedidos
    public static List<Pedido> AgregarPedido(Pedido ped, List<Pedido> lista_pedidos){
        lista_pedidos.add(ped);
        return lista_pedidos;
    }
    
    // CRUD
    //// Metodo para crear una nueva entrada
    public static void crearEntrada(Entrada entrada, String proveedor, int codigo, List<Pedido> lista_ped) throws ParseException{
        //// Fecha
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String date = dateFormat.format(new Date());
        // Modificamos los datos de proveedor
        entrada.setProovedor(proveedor);
        // Modificamos los datos de codigo
        entrada.setCod(codigo);
        // Modificamos los datos de fecha
        try {
            entrada.setFecha_emision(dateFormat.parse(date.toString()));
        } catch (ParseException ex) {
            Logger.getLogger(CrearEntrada.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Modificamos los datos de monto a pagar
        double monto = 0.0;
        for (Producto prod: entrada.getProductos()){
            monto += prod.getPrecio_compra();
        }
        entrada.setMonto_pagar(monto);
        // Ingresamos el pedido a la lista de pedidos
        lista_ped = AccesoriosNauticos.insertarPedido(entrada);                  
        // Mostramos el mensaje de confirmacion
        JOptionPane.showMessageDialog(null, "¡¡Se ha creado el pedido de forma exitosa!!", "Confirmacion",
            JOptionPane.OK_OPTION, new ImageIcon("src/Imagenes/Visto.jpg"));
        // Modificamos la visualizacion
        AccesoriosNauticos.getVCEntrada().setVisible(false);                
        // Actualizamos las vistas de pedidos
        AccesoriosNauticos.setVVPedidos();
        AccesoriosNauticos.setVCEntrada();
        AccesoriosNauticos.setVAProd(); 
        AccesoriosNauticos.eliminarNPedido();

        // Dirigimos a ver pedidos
        AccesoriosNauticos.getVVPedidos().setVisible(true);
    }
    //// Metodo para crear una nueva salida
    public static void crearSalida(Salida salida, int codigo, List<Pedido> lista_ped) throws ParseException{
        //// Fecha
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String date = dateFormat.format(new Date());
        // Modificamos los datos de codigo
        salida.setCod(codigo);
        // Modificamos los datos de fecha
        try {
            salida.setFecha_emision(dateFormat.parse(date.toString()));
        } catch (ParseException ex) {
            Logger.getLogger(CrearSalida.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Modificamos los datos de ganancia
        double ganancia = 0.0;
        for (Producto prod: salida.getProductos()){
            ganancia += prod.getGanancia();
        }
        salida.setGanancia(ganancia);
        // Ingresamos el pedido a la lista de pedidos
        lista_ped = AccesoriosNauticos.insertarPedido(salida);                  
        // Mostramos el mensaje de confirmacion
        JOptionPane.showMessageDialog(null, "¡¡Se ha creado el pedido de forma exitosa!!", "Confirmacion",
            JOptionPane.OK_OPTION, new ImageIcon("src/Imagenes/Visto.jpg"));
        // Modificamos la visualizacion
        AccesoriosNauticos.getVCSalida().setVisible(false);                
        // Actualizamos las vistas de pedidos
        AccesoriosNauticos.setVVPedidos();
        AccesoriosNauticos.setVCSalida();
        AccesoriosNauticos.setVAProd();
        AccesoriosNauticos.eliminarNPedido();
        // Dirigimos a ver pedidos
        AccesoriosNauticos.getVVPedidos().setVisible(true);
    }
}
