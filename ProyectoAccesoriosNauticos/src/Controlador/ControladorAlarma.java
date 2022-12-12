/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AlarmaObj;
import java.util.Date;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author Windows 10
 */
public class ControladorAlarma {
    
    
    //Metodo para verficar si la alarma se debe disparar
    
    public static int esVencida(AlarmaObj alm){
        // si el objeto fecha es menor que el argumento devuelve -1
        // si el objeto fecha es mayor que el argumento devuelve 1
        // si son iguales devuelve 0
        return new Date().compareTo(alm.getFecha());
    }
    
    public static void guardarAlarma(AlarmaObj alm , String fecha){
        
        String alarmaString = alm.getNombre() + ","+fecha+","+alm.getUnidades();
        
        try{
            BufferedWriter out = new BufferedWriter(
                new FileWriter(".\\src\\Proyecto\\alarma.txt", true));
            out.write(alarmaString+"\n");
            out.close();
        }catch(IOException e){
            System.out.println("Error escribiendo en el archivo");
        }
        
    }
    
//    public static List<AlarmaObj> agregarAlarma(AlarmaObj alm, List<AlarmaObj> lista_alarmas){
//        lista_alarmas.add(alm);
//        return lista_alarmas;
//    }
    
    public static List<AlarmaObj> leerArchivo(List<AlarmaObj> lista_alarmas){
        try{
            BufferedReader in = new BufferedReader(
                new FileReader(".\\src\\Proyecto\\alarma.txt"));
            String line;
            while((line = in.readLine()) != null){
                String[] lineArray = line.split(",");
                try{
                    Date fecha = new SimpleDateFormat("dd/MM/yyyy").parse(lineArray[1]);
                    AlarmaObj alm = new AlarmaObj(lineArray[0],fecha,Integer.parseInt(lineArray[2]));
                    lista_alarmas.add(alm);
                }catch(ParseException ex){}
            }
            in.close();
        }catch(IOException e){
            System.out.println("Error leyendo el archivo");
        }
        return lista_alarmas;
    }

}
