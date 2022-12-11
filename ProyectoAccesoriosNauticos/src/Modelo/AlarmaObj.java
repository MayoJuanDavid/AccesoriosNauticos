/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

//Libreria para manejar el tiempo
import java.util.Date;

/**
 *
 * @author Windows 10
 */
public class AlarmaObj {
    
    // Atributos
    
    private String nombre;
    private Date fecha;
    private int unidades;
    
    
    //Constructores
    public AlarmaObj(){}
    
    
    public AlarmaObj(String n, Date f, int u){
        nombre = n;
        fecha = f;
        unidades = u;
    }
    
    
    //getters
    
    public String getNombre(){
        return nombre;
    }
    
    public Date getFecha(){
        return fecha;
    }
    
    public int getUnidades(){
        return unidades;
    }
    
    
    // setters 
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public void setFecha(Date f) {
        fecha = f;
    }
    
    public void setUnidades(int n){
        unidades = n;
    }
     
}
