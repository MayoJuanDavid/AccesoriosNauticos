package Proyecto;

// Paquetes a utilizar
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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        /*VPedidos.actualizar(3);
        VPedidos.setVisible(true);*/
        
        
        /*int lim = 6;
        int lim_inf = (lista_productos.size() - lim);
        List<Producto> lista = lista_productos.subList(lim, (lim_inf < 6)? lim + lim_inf: lim + 6);
        */
        /*for (Pedido cli: lista_pedido){
            System.out.println(cli.imprimir());
            for (Producto prod: cli.getProductos())
                System.out.println("\t" + prod.imprimir());
        }*/
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
        AccesoriosNauticos.lista_productos.remove(indice);
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
        lista_pedidos.add(ped);
        return lista_pedidos;
    }
    public static void insertarEntrada(Entrada ped){
        lista_entradas.add(ped);
    }
    
    // Metodo para devolver los productos de una categoria
    public static List<Producto> getListaCategoria(String cat, List<Producto> l_productos){
        List <Producto> lista = new ArrayList<Producto>();
        for (Producto l: l_productos){
            if (l.getCategoria().equalsIgnoreCase(cat))
                lista.add(l);
        }
        return lista;
    }
    // Metodo para devolver una lista de productos que no estan en una entrada
    public static List<Producto> getProductosNoPedEntrada(){
        List<Producto> lista = new ArrayList<Producto>();
        for (Producto p: lista_productos){
            if (!Producto.buscarProducto(NEntrada.getProductos(), p.getCod())){
                lista.add(p);
            }
        }
        return lista;
    }
    // Metodo para devolver una lista de productos que no estan en una salida
    public static List<Producto> getProductosNoPedSalida(){
        List<Producto> lista = new ArrayList<Producto>();
        for (Producto p: lista_productos){
            if (!Producto.buscarProducto(NSalida.getProductos(), p.getCod()))
                lista.add(p);
        }
        return lista;
    }
    // Metodo para finalizar un pedido
    public static void finalizarPedido(int cod){
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
