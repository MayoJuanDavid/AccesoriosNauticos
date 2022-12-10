package Proyecto;

// Paquetes a utilizar
import Modelo.Cliente;
import Modelo.Entrada;
import Modelo.Pedido;
import Modelo.Producto;
import Modelo.Salida;
import Vista.Inicio;
import Vista.Inventario;
import Vista.Pedidos;
import Vista.VerPedidos;
import Vista.VisualizarProducto;
import com.inicio.Gestionar;
import java.util.ArrayList;
import java.util.List;
import Vista.Login;

public class AccesoriosNauticos {
    
    // Variables a utilizar
    
    //// Ventanas
    private static Login Ventana = new Login();
    private static Inventario VInventario = new Inventario();
    private static Pedidos VPedidos = new Pedidos();
    private static VerPedidos VVPedidos = new VerPedidos();
    private static VisualizarProducto VVProductos = new VisualizarProducto();
    private static Gestionar VGestionar = new Gestionar();
            
    //// Listas de datos
    private static List<Producto> lista_productos = new ArrayList<Producto>(); 
    private static List<Cliente> lista_clientes = new ArrayList<Cliente>(); 
    private static List<Pedido> lista_pedidos = new ArrayList<Pedido>();
    private static List<Entrada> lista_entradas = new ArrayList<Entrada>(); 
    private static List<Salida> lista_salida = new ArrayList<Salida>(); 
    
    // Programa pricipal
    public static void main (String[] args){
        lista_productos = getBD();
        /*VPedidos.actualizar(3);
        VPedidos.setVisible(true);*/
        
        
        /*int lim = 6;
        int lim_inf = (lista_productos.size() - lim);
        List<Producto> lista = lista_productos.subList(lim, (lim_inf < 6)? lim + lim_inf: lim + 6);
        */
        /*for (Salida cli: lista_salida){
            System.out.println(cli.imprimir());
            for (Producto prod: cli.getProductos())
                System.out.println("\t" + prod.imprimir());
        }*/
        //Ventana.setVisible(true);
        Ventana.setVisible(true);        
    }
    
    // Metodos setters y getters 
    public static Login getVentana() {
        return Ventana;
    }
    public static Inventario getVPrincipal() {
        return VInventario;
    }
    public static List<Producto> getLista_productos() {
        return lista_productos;
    }
    public static List<Cliente> getLista_clientes() {
        return lista_clientes;
    }
    public static List<Entrada> getLista_entradas() {
        return lista_entradas;
    }
    public static List<Salida> getLista_salida() {
        return lista_salida;
    }
    public static List<Pedido> getLista_pedidos() {
        return lista_pedidos;
    }
    public static Inventario getVInventario() {
        return VInventario;
    }
    public static Pedidos getVPedidos() {
        return VPedidos;
    }
    public static VerPedidos getVVPedidos() {
        return VVPedidos;
    }
    public static VisualizarProducto getVVProductos() {
        return VVProductos;
    }
    public static Gestionar getVGestionar() {
        return VGestionar;
    }


    public static void setVentana(Login Ventana) {
        AccesoriosNauticos.Ventana = Ventana;
    }
    public static void setVPrincipal(Inventario VPrincipal) {
        AccesoriosNauticos.VInventario = VPrincipal;
    }
    public static void setLista_productos(List<Producto> lista_productos) {
        AccesoriosNauticos.lista_productos = lista_productos;
    }
    public static void setLista_clientes(List<Cliente> lista_clientes) {
        AccesoriosNauticos.lista_clientes = lista_clientes;
    }
    public static void setLista_entradas(List<Entrada> lista_entradas) {
        AccesoriosNauticos.lista_entradas = lista_entradas;
    }
    public static void setLista_salida(List<Salida> lista_salida) {
        AccesoriosNauticos.lista_salida = lista_salida;
    }
    public static void setLista_pedidos(List<Pedido> lista_pedidos) {
        AccesoriosNauticos.lista_pedidos = lista_pedidos;
    }
    public static void setVVProductos() {
        AccesoriosNauticos.VVProductos = new VisualizarProducto();
    }
    
    public static void eliminarProducto(int indice){
        AccesoriosNauticos.lista_productos.remove(indice);
        VVProductos = new VisualizarProducto();
    }
    
    // Metodos para llenar los datos y retornar la lista de productos
    public static List<Producto> getBD(){
        lista_productos = Producto.leer();
        lista_clientes = Cliente.leer();
        lista_entradas = Entrada.leer(lista_productos);
        lista_salida = Salida.leer(lista_productos);
        lista_pedidos = Pedido.generarListaPedidos(lista_entradas, lista_salida);

        /*for (Producto cli: lista_productos){
            System.out.println(cli.imprimir());
        }*/
        
        return lista_productos;
    }
    
}
