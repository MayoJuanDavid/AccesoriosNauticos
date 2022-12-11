/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.AlarmaObj;
import java.util.Date;

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
    
    
}
