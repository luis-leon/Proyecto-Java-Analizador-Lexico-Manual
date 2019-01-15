package proyecto.compiladores;
import Clases.Analizador_Lexico;
import Clases.Producto;
import java.util.Scanner;
 //* @author ferna

public class ProyectoCompiladores 
{
static Scanner leer = new Scanner(System.in);
static Producto p = new Producto();
static Producto p_general = new Producto();
static Producto p_recibido= new Producto();
static Analizador_Lexico AnalizadorLex= new Analizador_Lexico();
static int no_producto;
    public static void main(String[] args) 
    {
       /*for(int i=1; i<=2; i++)
       {    
           p = new Producto();
           p.id=i;
           System.out.println("Ingrese el nombre del producto");  
           p.Nombre=leer.next();
           System.out.println("Ingrese un precio");
           p.Precio= leer.nextDouble();
           p_general.set_producto(p);
       }
       
       System.out.println("Ingrese un producto a buscar");
       no_producto=leer.nextInt();
       p_recibido=p_general.get_producto(no_producto);
       */
       System.out.println("Ingresa una palabra");
       AnalizadorLex.creador_tokens(leer.nextLine());
       
       
    }
    
}
