
package Controlador;

import Modelo.Producto;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ControladorBDProductos {
    // Atributos
    private static List<Producto> lista = new ArrayList<Producto>();
    
    // Metodos de clase
    // Metodo que retorna maximo 6 productos ordenados de forma ascendente
    // Se solicita un cod para saber cual es el ultimo producto visualizado
    public static List<Producto> listaProductosVisiblesPost(int cod, String cat) {
        lista = new ArrayList<Producto>();
        try {
            // Hacemos la conexion
            Statement sql = Conexion.getConexion().createStatement();
            
            // Determinamos la consulta
            String Consulta = "SELECT TOP(6) * FROM Productos WHERE categoria = '" + cat + "' and no_visible = 1 and cod > " + cod + " ORDER BY cod";
            ResultSet Resultado = sql.executeQuery(Consulta);

            while (Resultado.next()){
                lista.add(new Producto(
                    Integer.parseInt(Resultado.getString("cod")),
                    Resultado.getString("nombre"),
                    Integer.parseInt(Resultado.getString("disponibilidad")),
                    Double.parseDouble(Resultado.getString("precio_compra")),
                    Double.parseDouble(Resultado.getString("p_rentabilidad")),
                    Double.parseDouble(Resultado.getString("pvpdetal")),
                    Double.parseDouble(Resultado.getString("pvp2mayor")),
                    Double.parseDouble(Resultado.getString("ganancia")),
                    Resultado.getString("categoria"),
                    Resultado.getString("imagen")));
            }
            
            Resultado.close();
            return lista;
            
        }catch (SQLException ex){
            System.out.println("Error al consultar la lista ascendente de productos");
        }
        return lista;
    }
    
    // Metodo que retorna maximo 6 productos ordenados de forma decreciente
    // Se solicita un cod para saber cual es el primer producto visualizado
    public static List<Producto> listaProductosVisiblesAnt(int cod, String cat) {
        lista = new ArrayList<Producto>();
        try {
            // Hacemos la conexion
            Statement sql = Conexion.getConexion().createStatement();
            
            // Determinamos la consulta
            String Consulta = "SELECT * FROM (SELECT TOP(6) * FROM Productos WHERE categoria = '" + cat + "' and  no_visible = 1 and cod < " + cod + " ORDER BY cod DESC) a ORDER BY cod";
            ResultSet Resultado = sql.executeQuery(Consulta);

            while (Resultado.next()){
                lista.add(new Producto(
                    Integer.parseInt(Resultado.getString("cod")),
                    Resultado.getString("nombre"),
                    Integer.parseInt(Resultado.getString("disponibilidad")),
                    Double.parseDouble(Resultado.getString("precio_compra")),
                    Double.parseDouble(Resultado.getString("p_rentabilidad")),
                    Double.parseDouble(Resultado.getString("pvpdetal")),
                    Double.parseDouble(Resultado.getString("pvp2mayor")),
                    Double.parseDouble(Resultado.getString("ganancia")),
                    Resultado.getString("categoria"),
                    Resultado.getString("imagen")));
            }
            
            Resultado.close();
            return lista;
            
        }catch (SQLException ex){
            System.out.println("Error al consultar la lista descendente de productos");
        }
        return lista;
    }
    
    // Metodo que retorna maximo 6 productos ordenados de forma ascendente que no esten en una lista de codigos
    // Se solicita un cod para saber cual es el ultimo producto visualizado
    public static List<Producto> listaProductosVisiblesNoCodPost(int cod, String cat, String codigos) {
        lista = new ArrayList<Producto>();
        try {
            // Hacemos la conexion
            Statement sql = Conexion.getConexion().createStatement();
            
            // Determinamos la consulta
            String Consulta = "SELECT TOP(6) * FROM Productos "
                    + "WHERE cod not in " + codigos + " and categoria = '" + cat + "' and no_visible = 1 and cod > " + cod + " ORDER BY cod";
            ResultSet Resultado = sql.executeQuery(Consulta);

            while (Resultado.next()){
                lista.add(new Producto(
                    Integer.parseInt(Resultado.getString("cod")),
                    Resultado.getString("nombre"),
                    Integer.parseInt(Resultado.getString("disponibilidad")),
                    Double.parseDouble(Resultado.getString("precio_compra")),
                    Double.parseDouble(Resultado.getString("p_rentabilidad")),
                    Double.parseDouble(Resultado.getString("pvpdetal")),
                    Double.parseDouble(Resultado.getString("pvp2mayor")),
                    Double.parseDouble(Resultado.getString("ganancia")),
                    Resultado.getString("categoria"),
                    Resultado.getString("imagen")));
            }
            
            Resultado.close();
            return lista;
            
        }catch (SQLException ex){
            System.out.println("Error al consultar la lista ascendente de productos");
        }
        return lista;
    }
    
    // Metodo que retorna maximo 6 productos ordenados de forma decreciente que no esten en una lista de codigos
    // Se solicita un cod para saber cual es el primer producto visualizado
    public static List<Producto> listaProductosVisiblesNoCodAnt(int cod, String cat, String codigos) {
        lista = new ArrayList<Producto>();
        try {
            // Hacemos la conexion
            Statement sql = Conexion.getConexion().createStatement();
            
            // Determinamos la consulta
            String Consulta = "SELECT * FROM (SELECT TOP(6) * FROM Productos "
                    + "WHERE cod not in " + codigos + " and categoria = '" + cat + "' and  no_visible = 1 and cod < " + cod + " ORDER BY cod DESC) a ORDER BY cod";
            ResultSet Resultado = sql.executeQuery(Consulta);

            while (Resultado.next()){
                lista.add(new Producto(
                    Integer.parseInt(Resultado.getString("cod")),
                    Resultado.getString("nombre"),
                    Integer.parseInt(Resultado.getString("disponibilidad")),
                    Double.parseDouble(Resultado.getString("precio_compra")),
                    Double.parseDouble(Resultado.getString("p_rentabilidad")),
                    Double.parseDouble(Resultado.getString("pvpdetal")),
                    Double.parseDouble(Resultado.getString("pvp2mayor")),
                    Double.parseDouble(Resultado.getString("ganancia")),
                    Resultado.getString("categoria"),
                    Resultado.getString("imagen")));
            }
            
            Resultado.close();
            return lista;
            
        }catch (SQLException ex){
            System.out.println("Error al consultar la lista descendente de productos");
        }
        return lista;
    }
    
    
    // Metodo para verificar si se ha consultado el ultimo producto
    public static boolean verificarUltimoProducto(int cod, String cat) {
        try {
            // Hacemos la conexion
            Statement sql = Conexion.getConexion().createStatement();
            
            // Determinamos la consulta
            String Consulta = "SELECT MAX(cod) as Codigo FROM Productos WHERE categoria = '" + cat + "' and no_visible = 1";
            ResultSet Resultado = sql.executeQuery(Consulta);
            
            Resultado.next();
            int codigo = Integer.parseInt(Resultado.getString(1));
            
            Resultado.close();
            if (codigo == cod) return true;
            return false;
            
        }catch (SQLException ex){
            System.out.println("Error al verificar la lista");
        }
        return false;
    }
    
    // Metodo para eliminar un producto
    public static boolean eliminarProducto(int cod){
        try {
            // Hacemos la conexion
            Statement sql = Conexion.getConexion().createStatement();
            
            // Determinamos la consulta
            String Consulta = "UPDATE Productos SET no_visible = 0 WHERE cod = " + cod;
            sql.execute(Consulta);
            
        }catch (SQLException ex){
            System.out.println("Error al eliminar un producto de la lista");
        }
        return false;
    }
    
    // Metodo para crear un producto
    public static boolean agregarProducto(Producto producto){
        try {
            // Hacemos la conexion
            Statement sql = Conexion.getConexion().createStatement();
            
            // Determinamos la consulta
            String Consulta = "INSERT INTO [AccesoriosNauticos].[dbo].Productos (nombre, imagen, disponibilidad, precio_compra, p_rentabilidad, pvpdetal, pvp2mayor, ganancia, categoria, no_visible)\n" +
            "VALUES ('" + producto.getNombre() + "','',0,0,0.0,0,0,0,'" + producto.getCategoria() + "',1)";
            sql.execute(Consulta);
            
        }catch (SQLException ex){
            System.out.println("Error al agregar un producto de la lista");
        }
        return false;
    }
    
    // Metodo para buscar un producto
    public static Producto buscarProducto(int codigo){
        Producto prod = null;
        try {
            // Hacemos la conexion
            Statement sql = Conexion.getConexion().createStatement();
            
            // Determinamos la consulta
            String Consulta = "SELECT * FROM [AccesoriosNauticos].[dbo].[Productos] WHERE no_visible = 1 and cod = " + codigo;
            ResultSet Resultado = sql.executeQuery(Consulta);

            if (Resultado.next()){
                prod = new Producto(
                    Integer.parseInt(Resultado.getString("cod")),
                    Resultado.getString("nombre"),
                    Integer.parseInt(Resultado.getString("disponibilidad")),
                    Double.parseDouble(Resultado.getString("precio_compra")),
                    Double.parseDouble(Resultado.getString("p_rentabilidad")),
                    Double.parseDouble(Resultado.getString("pvpdetal")),
                    Double.parseDouble(Resultado.getString("pvp2mayor")),
                    Double.parseDouble(Resultado.getString("ganancia")),
                    Resultado.getString("categoria"),
                    Resultado.getString("imagen"));
            }
            
            Resultado.close();
            return prod;
            
        }catch (SQLException ex){
            System.out.println("Error al consultar la lista ascendente de productos");
        }
        return prod;
    }

    // Metodo para modificar un producto
    public static boolean modificarProducto(Producto producto){
        try {
            // Hacemos la conexion
            Statement sql = Conexion.getConexion().createStatement();
            
            // Determinamos la consulta
            String Consulta = "UPDATE [AccesoriosNauticos].[dbo].Productos \n" +
            "SET nombre = '" + producto.getNombre() + "', imagen = '" + producto.getImagen() + "', disponibilidad = " + producto.getDisponibilidad() + 
            ", precio_compra = " + producto.getPrecio_compra() + ", p_rentabilidad = " + producto.getPrentabilidad() + ", pvpdetal = " + producto.getPvpdetal() + 
            ", pvp2mayor = " + producto.getPvp2mayor() + ", ganancia = " + producto.getGanancia() + ", categoria = '" + producto.getCategoria() + "'\n" +
            "WHERE cod = " + producto.getCod();
            sql.execute(Consulta);
            
        }catch (SQLException ex){
            System.out.println("Error al agregar un producto de la lista");
        }
        return false;
    }
}


