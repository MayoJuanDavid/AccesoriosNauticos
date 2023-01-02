package Controlador;

import Modelo.Entrada;
import Modelo.Pedido;
import Modelo.Producto;
import Modelo.Salida;
import Vista.CrearEntrada;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

// Controlador para los pedidos en la bd
public class ControladorBDPedidos {
    // Atributos
    private static List<Producto> lista = new ArrayList<Producto>();
    
    // Metodos de clase
    // Metodo que retorna maximo 6 productos del pedido ordenados de forma ascendente
    // Se solicita un cod para saber cual es el ultimo producto visualizado
    public static List<Producto> listaProductosVisiblesPost(int cod, Pedido ped, String cat) {
        lista = new ArrayList<Producto>();
        try {
            // Hacemos la conexion
            Statement sql = Conexion.getConexion().createStatement();
            String Consulta = "";
            if (ped instanceof Entrada){
                // Determinamos la consulta
                Consulta = "SELECT TOP (6) prod.*\n" +
                "FROM [AccesoriosNauticos].[dbo].[Entradas] ent LEFT JOIN [AccesoriosNauticos].[dbo].Ent_Prod epr on ent.cod = epr.cod_entrada\n" +
                "LEFT JOIN [AccesoriosNauticos].[dbo].Productos prod on epr.cod_producto = prod.cod\n" +
                "WHERE ent.cod = " + ped.getCod() + " and categoria = '" + cat + "' and prod.cod > " + cod +"\n" +
                "ORDER BY prod.cod";
            }else{
                // Determinamos la consulta
                Consulta = "SELECT TOP (6) prod.*\n" +
                "FROM [AccesoriosNauticos].[dbo].[Salidas] sal LEFT JOIN [AccesoriosNauticos].[dbo].Sal_Prod spr on sal.cod = spr.cod_salida\n" +
                "LEFT JOIN [AccesoriosNauticos].[dbo].Productos prod on spr.cod_producto = prod.cod\n" +
                "WHERE sal.cod = " + ped.getCod() + " and categoria = '" + cat + "' and prod.cod > " + cod +"\n" +
                "ORDER BY prod.cod";
            }
            
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
    
    // Metodo que retorna maximo 6 productos del pedido ordenados de forma decreciente
    // Se solicita un cod para saber cual es el primer producto visualizado
    public static List<Producto> listaProductosVisiblesAnt(int cod, Pedido ped, String cat) {
        lista = new ArrayList<Producto>();
        try {
            // Hacemos la conexion
            Statement sql = Conexion.getConexion().createStatement();
            String Consulta = "";
            if (ped instanceof Entrada){
                // Determinamos la consulta
                Consulta = "SELECT * FROM (SELECT TOP (6) prod.*\n" +
                "FROM [AccesoriosNauticos].[dbo].[Entradas] ent LEFT JOIN [AccesoriosNauticos].[dbo].Ent_Prod epr on ent.cod = epr.cod_entrada\n" +
                "LEFT JOIN [AccesoriosNauticos].[dbo].Productos prod on epr.cod_producto = prod.cod\n" +
                "WHERE ent.cod = " + ped.getCod() + " and categoria = '" + cat + "' and prod.cod < " + cod + "\n" +
                "ORDER BY prod.cod DESC) a ORDER BY a.cod";
            }else{
                // Determinamos la consulta
                Consulta = "SELECT * FROM (SELECT TOP (6) prod.*\n" +
                "FROM [AccesoriosNauticos].[dbo].[Salidas] sal LEFT JOIN [AccesoriosNauticos].[dbo].Sal_Prod spr on sal.cod = spr.cod_salida\n" +
                "LEFT JOIN [AccesoriosNauticos].[dbo].Productos prod on spr.cod_producto = prod.cod\n" +
                "WHERE sal.cod = " + ped.getCod() + " and categoria = '" + cat + "' and prod.cod < " + cod + "\n" +
                "ORDER BY prod.cod DESC) a ORDER BY a.cod";
            }
            
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
    public static boolean verificarUltimoProducto(int cod, Pedido ped, String cat) {
        try {
            // Hacemos la conexion
            Statement sql = Conexion.getConexion().createStatement();
            
            // Determinamos la consulta
            String Consulta = "SELECT TOP (6) MAX(DISTINCT prod.cod) as Maximo\n" +
            "FROM [AccesoriosNauticos].[dbo].[Entradas] ent LEFT JOIN [AccesoriosNauticos].[dbo].Ent_Prod epr on ent.cod = epr.cod_entrada\n" +
            "LEFT JOIN [AccesoriosNauticos].[dbo].Productos prod on epr.cod_producto = prod.cod\n" +
            "WHERE ent.cod = " + ped.getCod() + " and categoria = '" + cat + "'";
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
    
    // Metodo para verificar si se ha consultado el ultimo pedido
    public static boolean verificarUltimoPedido(Pedido ped) {
        try {
            // Hacemos la conexion
            Statement sql = Conexion.getConexion().createStatement();
            
            // Si es una entrada, verificamos si es la ultima y no hay salidas
            if (ped instanceof Entrada) {
                // Determinamos el cod maximo del pedido
                String Consulta = "SELECT MAX(cod) as maximo FROM [AccesoriosNauticos].[dbo].[Entradas]";
                ResultSet Resultado = sql.executeQuery(Consulta);
                
                Resultado.next();
                int codigo = Integer.parseInt(Resultado.getString(1));
                
                // Determinamos si hay salidas
                Consulta = "SELECT COUNT(cod) as cont FROM [AccesoriosNauticos].[dbo].[Salidas]";
                Resultado = sql.executeQuery(Consulta);
                
                Resultado.next();
                int cantidad = Integer.parseInt(Resultado.getString(1));
                return (cantidad == 0 && codigo == ped.getCod());
            }else{
                // Determinamos el cod maximo del pedido
                String Consulta = "SELECT MAX(cod) as maximo FROM [AccesoriosNauticos].[dbo].[Salidas]";
                ResultSet Resultado = sql.executeQuery(Consulta);
                
                Resultado.next();
                int codigo = Integer.parseInt(Resultado.getString(1));
                return (codigo == ped.getCod());
            }            
        }catch (SQLException ex){
            System.out.println("Error al verificar la lista");
        }
        return false;
    }
    
    // Metodo que retorna un pedido
    public static Pedido consultarPedidoPost(Pedido ped) throws ParseException {
        Pedido pedido = null;
        try {
            // Hacemos la conexion
            Statement sql = Conexion.getConexion().createStatement();
            
            // Verificamos si es la ultima entrada
            if (ped instanceof Entrada){
                // Determinamos el cod maximo del pedido
                String Consulta = "SELECT MAX(cod) as maximo FROM [AccesoriosNauticos].[dbo].[Entradas]";
                ResultSet Resultado = sql.executeQuery(Consulta);
                
                Resultado.next();
                String codigo = Resultado.getString(1);
                
                // Verificamos si hay alguna entrada y si esta es la ultima en la BD
                if (codigo.equalsIgnoreCase("" + ped.getCod()) || codigo == null){
                    // Determinamos la consulta
                    Consulta = "SELECT TOP(1) * FROM [AccesoriosNauticos].[dbo].[Salidas] WHERE cod > 0 ORDER BY cod";
                    Resultado = sql.executeQuery(Consulta);

                    if (Resultado.next()){
                        pedido = new Salida(
                                Integer.parseInt(Resultado.getString("cod")),
                                new SimpleDateFormat("yyyy-mm-dd").parse(Resultado.getString("f_emision")),
                                (Resultado.getString("f_recepcion") == null)? null: new SimpleDateFormat("yyyy-mm-dd").parse(Resultado.getString("f_recepcion")),
                                Double.parseDouble(Resultado.getString("monto_pagar")),
                                Double.parseDouble(Resultado.getString("ganancia"))
                        );
                        Resultado.close();
                    }else{
                        Resultado.close();
                        return null;
                    }
                }else{
                    // Determinamos la consulta
                    Consulta = "SELECT TOP(1) * FROM [AccesoriosNauticos].[dbo].[Entradas] WHERE cod > " + ped.getCod() + " ORDER BY cod";
                    Resultado = sql.executeQuery(Consulta);

                    if (Resultado.next()){
                        pedido = new Entrada(
                                Integer.parseInt(Resultado.getString("cod")),
                                new SimpleDateFormat("yyyy-mm-dd").parse(Resultado.getString("f_emision")),
                                (Resultado.getString("f_recepcion") == null)? null: new SimpleDateFormat("yyyy-mm-dd").parse(Resultado.getString("f_recepcion")),
                                Double.parseDouble(Resultado.getString("monto_pagar")),
                                Resultado.getString("proveedor")
                        );
                        Resultado.close();
                    }else{
                        Resultado.close();
                        return null;
                    }
                }
            }else{
                // Determinamos la consulta
                String Consulta = "SELECT TOP(1) * FROM [AccesoriosNauticos].[dbo].[Salidas] WHERE cod > " + ped.getCod() + " ORDER BY cod";
                ResultSet Resultado = sql.executeQuery(Consulta);

                if (Resultado.next()){
                    pedido = new Salida(
                            Integer.parseInt(Resultado.getString("cod")),
                            new SimpleDateFormat("yyyy-mm-dd").parse(Resultado.getString("f_emision")),
                            (Resultado.getString("f_recepcion") == null)? null: new SimpleDateFormat("yyyy-mm-dd").parse(Resultado.getString("f_recepcion")),
                            Double.parseDouble(Resultado.getString("monto_pagar")),
                            Double.parseDouble(Resultado.getString("ganancia"))
                    );
                    Resultado.close();
                }else{
                    Resultado.close();
                    return null;
                }
            }    
            return pedido;
            
        }catch (SQLException ex){
            System.out.println("Error al consultar la lista ascendente de pedidos");
        }
        return pedido;
    }
    
    // Metodo que retorna un pedido
    public static Pedido consultarPedidoAnt(Pedido ped) throws ParseException {
        Pedido pedido = null;
        try {
            // Hacemos la conexion
            Statement sql = Conexion.getConexion().createStatement();
            
            // Determinamos si es una salida o una entrada
            if (ped instanceof Salida){
                // Determinamos el cod minimo del pedido
                String Consulta = "SELECT MIN(cod) as minimo FROM [AccesoriosNauticos].[dbo].[Salidas]";
                ResultSet Resultado = sql.executeQuery(Consulta);
                
                Resultado.next();
                int codigo = Integer.parseInt(Resultado.getString(1));
                
                if (codigo == ped.getCod()){
                    // Determinamos el cod maximo del pedido
                    Consulta = "SELECT MAX(cod) as maximo FROM [AccesoriosNauticos].[dbo].[Entradas]";
                    Resultado = sql.executeQuery(Consulta);

                    Resultado.next();
                    codigo = Integer.parseInt(Resultado.getString(1)) + 1;
                    
                    // Determinamos la consulta
                    Consulta = "SELECT TOP(1) * FROM [AccesoriosNauticos].[dbo].[Entradas] WHERE cod < " + codigo + " ORDER BY cod DESC";
                    Resultado = sql.executeQuery(Consulta);

                    if (Resultado.next()){
                        pedido = new Entrada(
                                Integer.parseInt(Resultado.getString("cod")),
                                new SimpleDateFormat("yyyy-mm-dd").parse(Resultado.getString("f_emision")),
                                (Resultado.getString("f_recepcion") == null)? null: new SimpleDateFormat("yyyy-mm-dd").parse(Resultado.getString("f_recepcion")),
                                Double.parseDouble(Resultado.getString("monto_pagar")),
                                Resultado.getString("proveedor")
                        );
                        Resultado.close();
                    }else{
                        Resultado.close();
                        return null;
                    }
                }else{
                    // Determinamos la consulta
                    Consulta = "SELECT TOP(1) * FROM [AccesoriosNauticos].[dbo].[Salidas] WHERE cod < " + ped.getCod() + " ORDER BY cod DESC";
                    Resultado = sql.executeQuery(Consulta);

                    if (Resultado.next()){
                        pedido = new Salida(
                                Integer.parseInt(Resultado.getString("cod")),
                                new SimpleDateFormat("yyyy-mm-dd").parse(Resultado.getString("f_emision")),
                                (Resultado.getString("f_recepcion") == null)? null: new SimpleDateFormat("yyyy-mm-dd").parse(Resultado.getString("f_recepcion")),
                                Double.parseDouble(Resultado.getString("monto_pagar")),
                                Double.parseDouble(Resultado.getString("ganancia"))
                        );
                    }else return null;

                    Resultado.close();
                }
            }else{
                // Determinamos la consulta
                String Consulta = "SELECT TOP(1) * FROM [AccesoriosNauticos].[dbo].[Entradas] WHERE cod < " + ped.getCod() + " ORDER BY cod DESC";
                ResultSet Resultado = sql.executeQuery(Consulta);

                if (Resultado.next()){
                    pedido = new Entrada(
                            Integer.parseInt(Resultado.getString("cod")),
                            new SimpleDateFormat("yyyy-mm-dd").parse(Resultado.getString("f_emision")),
                            (Resultado.getString("f_recepcion") == null)? null: new SimpleDateFormat("yyyy-mm-dd").parse(Resultado.getString("f_recepcion")),
                            Double.parseDouble(Resultado.getString("monto_pagar")),
                            Resultado.getString("proveedor")
                    );
                    Resultado.close();
                }else{
                    Resultado.close();
                    return null;
                }
            }
            return pedido;
            
        }catch (SQLException ex){
            System.out.println("Error al consultar la lista ascendente de pedidos");
        }
        return pedido;
    }

    // Metodo para finalizar un pedido
    public static void finalizarPedido(Pedido ped) throws SQLException{
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFormat.format(new Date());
        Statement sql = Conexion.getConexion().createStatement();
        String Consulta = "";
        if (ped instanceof Entrada)
            Consulta = "UPDATE Entradas SET f_recepcion = '" + date + "' WHERE cod = " + ped.getCod();
        else
            Consulta = "UPDATE Salidas SET f_recepcion = '" + date + "' WHERE cod = " + ped.getCod();
        sql.execute(Consulta);
    }

}
