/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Producto;
import java.util.List;

/**
 *
 * @author Windows 10
 */
public class ControladorProducto {
    
    public static boolean buscarProducto(List<Producto> lista, int cod){
        for (Producto p: lista){
            if (p.getCod() == cod) return true;
        }
        return false;
    }
    
    
}
