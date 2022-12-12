/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Producto;
import Proyecto.AccesoriosNauticos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows 10
 */
public class ControladorProducto {
    
    // Metodo que busca un producto
    public static boolean buscarProducto(List<Producto> lista, int cod){
        for (Producto p: lista){
            if (p.getCod() == cod) return true;
        }
        return false;
    }
    
    // Metodo que agrega un producto
    public static List<Producto> AgregarProducto(Producto producto, List<Producto> lista_productos){
        List<Producto> aux = lista_productos; 
        aux.add(producto);
        return aux;
    }
    // Metodo que modifica un producto
    public static List<Producto> ModificarProducto(int index, Producto producto, List<Producto> lista_productos) {
        Producto aux = lista_productos.get(index);
        lista_productos.set(index,aux);
        return lista_productos;
        
    }
    // Metodo que devuelve la lista de productos segun la categoria
    public static List<Producto> getListaCategoria(String cat, List<Producto> l_productos){
        List <Producto> lista = new ArrayList<Producto>();
        for (Producto l: l_productos){
            if (l.getCategoria().equalsIgnoreCase(cat))
                lista.add(l);
        }
        return lista;
    }
   
    // Metodo que elimina un producto
    public static void eliminarProducto(int indice, List<Producto> lista_productos){
        lista_productos.remove(indice);
    }
    
    // CRUD
    //// Metodo para eliminar un producto
    public static void eliminarProducto(List<Producto> lista_productos, int codigo){
        for (int i = 0; i < lista_productos.size();i++){
            if (lista_productos.get(i).getCod() == codigo) {
                AccesoriosNauticos.eliminarProducto(i);
                AccesoriosNauticos.getVInventario().actualizarListaProd();
                lista_productos = AccesoriosNauticos.getLista_productos();
                break;
            }
        }
        AccesoriosNauticos.getVVProductos().setVisible(false);
        AccesoriosNauticos.setVVProductos();
        AccesoriosNauticos.getVVProductos().setVisible(true);
        JOptionPane.showMessageDialog(null, "¡¡El producto se ha eliminado con exito!!", "Confirmacion",
            JOptionPane.OK_OPTION, new ImageIcon("src/Imagenes/Visto.jpg"));
    }
}
