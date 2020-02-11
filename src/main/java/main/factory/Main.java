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
        Car fiat = new Car ("Fiat Punto", 2010, "black", 45);
        fiat.showData();
        
        Car ford = new Car ("Ford Fiesta", 2015, "red", 40, 10, 5);
        ford.showData();
        
        Car lada = new Car ("Lada Niva", 1980, "zelena", 50, 40, 12);
        lada.showData();
        
        
    /*    System.out.println("Pocetak");   
        
        String message = "Ovo je poruka";
        
        Car fiat = new Car();
        //fiat.model = "Punto";
        fiat.setModel("Fiat punto");
        fiat.buildYear = 2010;
        fiat.color = "Black";
        fiat.consuption = 6;
        fiat.maxSpeed = 180;
        fiat.currentFuel = 20;
        fiat.maxFuel = 45;
        
        fiat.showData();
       
        
        Car ford = new Car ();
        //ford.model = "Ford Fiesta";
        ford.setModel("Ford Fiesta");
        ford.buildYear = 2015;
        ford.maxSpeed = 200;
              
        ford.showData(); */
        
        
        //System.out.println("Model:" + ford.getModel());
        
        
        
        
        
        
    }
    
}
