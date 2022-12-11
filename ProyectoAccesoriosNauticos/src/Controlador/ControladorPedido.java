/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Entrada;
import Modelo.Pedido;
import Modelo.Salida;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Windows 10
 */
public class ControladorPedido {
    
    
    public ControladorPedido(){}
    
    // Metodos de funcionalidad
    // Retornamos una lista de pedidos con las entradas y las salidas
    public List<Pedido> generarListaPedidos(List<Entrada> lista_entrada, List<Salida> lista_salida){
        List<Pedido> lista = new ArrayList<Pedido>();
        lista.addAll(lista_entrada);
        lista.addAll(lista_salida);
        return lista;
    }
    
        // Buscamos un pedido
    public static Pedido buscarPedido(int codigo, List<Pedido> list_pedidos){
        for (Pedido ped: list_pedidos)
            if (ped.getCod() == codigo) return ped;
        return null;
    }
    
}
