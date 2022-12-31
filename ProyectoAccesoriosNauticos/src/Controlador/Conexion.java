/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    public static Connection getConexion(){
        String URL= "jdbc:sqlserver://DESKTOP-LB388EE:1433;"    //Servidor
                + "database=AccesoriosNauticos;"                   //Data
                + "user=usuarioANautico;"                            //Usuario
                + "password=25846514;";                   //Contraseña
        try{
            Connection Con = DriverManager.getConnection(URL);
            return Con;
        }catch( SQLException ex ){
            System.out.println("Error al conectar");
            return null;
        }
    }
       
}
