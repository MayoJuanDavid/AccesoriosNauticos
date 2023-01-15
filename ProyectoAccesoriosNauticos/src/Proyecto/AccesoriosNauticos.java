package Proyecto;

// Paquetes a utilizar
import Modelo.AlarmaObj;
import Modelo.Cliente;
import Modelo.Entrada;
import Modelo.Pedido;
import Modelo.Producto;
import Modelo.Salida;
import Vista.AgregarProducto;
import Vista.Alarma;
import Vista.AsignarProd;
import Vista.CrearEntrada;
import Vista.CrearSalida;
import Vista.Gestionar;
import Vista.Inventario;
import Vista.Login;
import Vista.Pedidos;
import Vista.VerPedidos;
import Vista.VisualizarProducto;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class AccesoriosNauticos {
    
    // Variables a utilizar
    
    //// Ventanas
    private static Login Ventana = new Login();
    private static Inventario VInventario = new Inventario();
    private static Pedidos VPedidos = new Pedidos(null);
    private static VerPedidos VVPedidos;
    private static VisualizarProducto VVProductos = new VisualizarProducto();
    private static Gestionar VGestionar;
    private static AgregarProducto VAProducto = new AgregarProducto();
    private static Alarma VAlarma = new Alarma();
    private static CrearEntrada VCEntrada = new CrearEntrada();
    private static CrearSalida VCSalida = new CrearSalida();
    private static AsignarProd VAProd = new AsignarProd();
            
    //// Listas de datos
    private static List<Producto> lista_productos = new ArrayList<Producto>(); 
    private static List<Cliente> lista_clientes = new ArrayList<Cliente>(); 
    private static List<Pedido> lista_pedidos = new ArrayList<Pedido>();
    private static List<Entrada> lista_entradas = new ArrayList<Entrada>(); 
    private static List<Salida> lista_salida = new ArrayList<Salida>();
    private static List<AlarmaObj> lista_alarmas = new ArrayList<AlarmaObj>();
    
    // Variables de pedidos y productosnuevos
    private static Entrada NEntrada = new Entrada();
    private static Salida NSalida = new Salida();
    
    // Programa pricipal
    public static void main (String[] args) throws ParseException, SQLException{
        VVPedidos = new VerPedidos();
        VGestionar = new Gestionar();
        //lista_productos = getBD();
        //Ventana.setVisible(true);
        VInventario.setVisible(true);   
    }
    
    // Metodos getters 
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
    public static AgregarProducto getVAProducto() {
        return VAProducto;
    }
    public static Alarma getVAlarma() {
        return VAlarma;
    }
    public static CrearEntrada getVCEntrada() {
        return VCEntrada;
    }
    public static AsignarProd getVAProd() {
        return VAProd;
    }
    public static Entrada getNEntrada() {
        return NEntrada;
    }
    public static Salida getNSalida() {
        return NSalida;
    }
    public static CrearSalida getVCSalida() {
        return VCSalida;
    }
    
    
    // Metodos setter
    //// Listas
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
    //// Vistas
    public static void setVentana() {
        AccesoriosNauticos.Ventana = new Login();
    }
    public static void setVPrincipal() {
        AccesoriosNauticos.VInventario = new Inventario();
    }
    public static void setVVProductos() {
        AccesoriosNauticos.VVProductos = new VisualizarProducto();
    }
    public static void setVVPedidos() throws ParseException {
        AccesoriosNauticos.VVPedidos = new VerPedidos();
    }
    public static void setVCEntrada() {
        AccesoriosNauticos.VCEntrada = new CrearEntrada();
    }
    public static void setVCSalida() {
        AccesoriosNauticos.VCSalida = new CrearSalida();
    }
    public static void setVAProd() {
        AccesoriosNauticos.VAProd = new AsignarProd();
    }
    public static void setVPedidos(Pedido ped) {
        AccesoriosNauticos.VPedidos = new Pedidos(ped);
    }  
    public static void setVAProductos() {
        AccesoriosNauticos.VAProducto = new AgregarProducto();
    } 
    
    // Metodo para checkear que alarma se debe disparar
    public static AlarmaObj triggerAlarma(){
        return null;
    }
    
}
