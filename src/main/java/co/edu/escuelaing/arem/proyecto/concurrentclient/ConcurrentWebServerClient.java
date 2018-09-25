/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.escuelaing.arem.proyecto.concurrentclient;


import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicolás Osorio 
 */
public class ConcurrentWebServerClient {
    public static Integer threads= 5;
    public static Integer request= 5;

    
    public static void main(String[] args) throws IOException {
        
         
        
        
        
        boolean isCompleted=false;
        
        ExecutorService executor = Executors.newFixedThreadPool(threads);
        while (request>0){
            executor.execute(new URLReader(args));
            request--;
        }
        
    }
    
    
    
}