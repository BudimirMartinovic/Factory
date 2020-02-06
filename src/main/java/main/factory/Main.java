/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.factory;

/**
 *
 * @author budimir
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("Pocetak");   
        
        String message = "Ovo je poruka";
        
        Car fiat = new Car();
        fiat.model = "Punto";
        fiat.buildYear = 2010;
        fiat.color = "Black";
        fiat.consuption = 6;
        fiat.maxSpeed = 180;
        fiat.currentFuel = 20;
        fiat.maxFuel = 45;
        
        System.out.println("Model:" + fiat.model);
        System.out.println("Godina proizvodnje :" + fiat.buildYear);
       
        
        Car ford = new Car ();
        ford.model = "Ford Fiesta";
        ford.buildYear = 2015;
        
        System.out.println("Model:" + ford.model);
        System.out.println("Godina proizvodnje :" + ford.buildYear);
              
        
        
        
        
        
        
        
        
        
        
    }
    
}
