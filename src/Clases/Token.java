/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author ferna
 */

public class Token {
   private String Palabra;
   private String Token;
   
   public void setPalabra(String _setPalabra)
   {
       Palabra=_setPalabra;
   }
  public void setToken(String _setToken){
      Token=_setToken;
  }
  
  public String getPalabra ()
  {
      return Palabra;
  }
  public String getToken()
  {
      return Token;
  }
  
    
}
