/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.ArrayList;

/**
 *
 * @author ferna
 */
public class Producto {
public int id;
private int posicion;
public String Nombre;
public double Precio;
ArrayList<Producto> Productos = new ArrayList<Producto>();
 static Producto dato_coincide;

public void set_producto(Producto p)    
{
    Productos.add(p);
    
}

public Producto get_producto(int i)
{
   
   
    for(Producto pro :Productos)
    {
        
        if(pro.id==i)
        {
           dato_coincide=pro;
           /* verifica que dato se esta devolviendo del array list comparado con la consulta hecha a travez de objetos
           System.out.println( " ---------------------------------------- " );
           System.out.println(pro.id + " | " +pro +" | "+ pro.Precio );
           System.out.println( " ---------------------------------------- " );
           */
        }
    }
    return dato_coincide;
}

}
