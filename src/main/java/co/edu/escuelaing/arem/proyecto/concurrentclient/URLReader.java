/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.arem.proyecto.concurrentclient;
import java.io.*; 
import java.net.*; 
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Nicolás Osorio Arias
 */

public class URLReader implements Runnable  { 
    String[] args;
    
    URLReader(String[] args) {
        this.args=args;
    }
 
    @Override
    public void run() {
      try {
          URL url = new URL(this.args[0]);
          try (BufferedReader reader = new BufferedReader(
                  new InputStreamReader(url.openStream()))) {
              String inputLine = null;
              while ((inputLine = reader.readLine()) != null) {
                  System.out.println(inputLine);
              }
          } catch (IOException x) { 
              System.err.println(x);
          }
      } catch (MalformedURLException ex) { 
               Logger.getLogger(URLReader.class.getName()).log(Level.SEVERE, null,ex); 
       } 

    }
}
