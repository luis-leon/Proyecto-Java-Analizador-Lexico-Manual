
package Clases;

import java.util.ArrayList;

/**
 *
 * @author ferna
 */
public class Analizador_Lexico {
    ArrayList<Character> Cadena_analizada = new ArrayList<Character>();
    char[] letras_minusculas = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
    char[] letras_mayusculas = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    char[] numeros = {'1','2','3','4','5','6','7','8','9','0'}; 
   public void creador_tokens(String Cadena_solicitada)
   {
       for(char caracter:Cadena_solicitada.toCharArray())
       {
            //bucle que verificara si existen letras dentro de la cadena
           for(int a=0; a<letras_minusculas.length; a++ )
           {
               if(caracter==letras_minusculas[a]|| caracter== letras_mayusculas[a])
               {
                   System.out.println("---"+caracter +"---"+"LETRA");
               }    
           }
           //bucle que verificara si existen numeros dentro de la cadena
           for(int b=0; b<numeros.length; b++ )
           {
               if(caracter==numeros[b])
               {
                   System.out.println("---"+caracter+"---"+"NUMERO");
               }    
           }
           
       }
   
   }
    
    
}
