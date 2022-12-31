
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
}


