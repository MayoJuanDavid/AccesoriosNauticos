package Proyecto;

// Paquetes a utilizar
import Controlador.ControladorArchivo;
import Controlador.ControladorPedido;
import Controlador.ControladorProducto;
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
import java.util.ArrayList;
import java.util.List;

public class AccesoriosNauticos {
    
    // Variables a utilizar
    
    //// Ventanas
    private static Login Ventana = new Login();
    private static Inventario VInventario = new Inventario();
    private static Pedidos VPedidos = new Pedidos();
    private static VerPedidos VVPedidos = new VerPedidos();
    private static VisualizarProducto VVProductos = new VisualizarProducto();
    private static Gestionar VGestionar = new Gestionar();
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
    
    // Variables de pedidos y productosnuevos
    private static Entrada NEntrada = new Entrada();
    private static Salida NSalida = new Salida();
    
    // Programa pricipal
    public static void main (String[] args){
        lista_productos = getBD();
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
    public static void setVVPedidos() {
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
    public static void setVPedidos() {
        AccesoriosNauticos.VPedidos = new Pedidos();
    }
    
    // Metodos de eliminacion    
    public static void eliminarProducto(int indice){
        ControladorProducto.eliminarProducto(indice, lista_productos);
        VVProductos = new VisualizarProducto();
    }
    public static void eliminarNPedido(){
        NEntrada = new Entrada();
        NSalida = new Salida();
    }
    
    // Metodos para modificar los pedidos
    public static void insertarProdEntrada(Producto prod){
       NEntrada.setProductos(prod);
    }
    public static void insertarProdSalida(Producto prod){
       NSalida.setProductos(prod);
    }
    public static void insertarProveedor(String proveedor){
        NEntrada.setProovedor(proveedor);
    }
    public static List<Pedido> insertarPedido(Pedido ped){
        return ControladorPedido.AgregarPedido(ped, lista_pedidos);
    }
    public static void insertarEntrada(Entrada ped){
        lista_entradas.add(ped);
    }
    
    // Metodo para devolver los productos de una categoria
    public static List<Producto> getListaCategoria(String cat, List<Producto> l_productos){
        return ControladorProducto.getListaCategoria(cat, l_productos);
    }
    // Metodo para devolver una lista de productos que no estan en una entrada
    public static List<Producto> getProductosNoPedEntrada(){
        return ControladorPedido.getProductosNoPedEntrada(lista_productos, NEntrada);
    }
    
    // Metodo para devolver una lista de productos que no estan en una salida
    public static List<Producto> getProductosNoPedSalida(){
        return ControladorPedido.getProductosNoPedSalida(lista_productos, NSalida);
    }
    // Metodo para finalizar un pedido
    public static void finalizarPedido(int cod){
        ControladorPedido.finalizarPedido(lista_pedidos, cod);
    }
    
    // Metodo que modifica el producto
    
    public static void modificarProducto(int indice, Producto modif){
        lista_productos = ControladorProducto.ModificarProducto(indice, modif, lista_productos);
    }
    
    // Metodo que agrega un produto
    public static void agregarProducto(Producto p){
        lista_productos = ControladorProducto.AgregarProducto(p, lista_productos);
        VVProductos = new VisualizarProducto();
        VInventario.actualizarListaProd();
        VAProd = new AsignarProd();
        
    }
    
    // Metodos para llenar los datos y retornar la lista de productos
    public static List<Producto> getBD(){
        //Instanciamos el controlador de archivos
        ControladorArchivo ctrlArchivo = new ControladorArchivo();
        // Se instancia el controlador de Pedidos
        ControladorPedido ctrlPedido = new ControladorPedido();
        
        lista_productos = ctrlArchivo.leerArchivoProducto();
        lista_clientes = ctrlArchivo.leerArchivoCliente();
        lista_entradas = ctrlArchivo.leerArchivoEntrada(lista_productos);
        lista_salida = ctrlArchivo.leerArchivoSalida(lista_productos);
        lista_pedidos = ctrlPedido.generarListaPedidos(lista_entradas, lista_salida);
        
        return lista_productos;
    }
    
}
