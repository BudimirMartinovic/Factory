
package main.factory;


public class Car {
    
    private final String vehicleType = "Car";
    private String model;
    private int buildYear;
    private int maxSpeed;
    private String color;
    private int maxFuel;
    private int currentFuel;
    private int consuption;
    
    
    public Car (){
            this.model = "";
            this.buildYear = 0;
            this.color = "";
            this.maxFuel = 0;
            this.currentFuel =0;
            this.consuption = 0;
    }
    
    public Car (String customModel, int customBuildYear) {
            this.model = customModel;
            this.buildYear = customBuildYear;
            this.color = customColor ;
            this.maxFuel= customMaxFuel ;
    }    
    
      public Car (String customModel, int customBuildYear, string customColor, int customMaxFuel int customConsuption, int ) {
            this.model = customModel;
            this.buildYear = customBuildYear;
            this.color = customColor;
            this.maxFuel= customMaxFuel;
            this.consuption= customConsuption;
            this.currentFuel = customCurrentFuel;
    }    
    
    
    public String getModel () {
            return this.model;
            
    }
    
    
    public void setModel(String customModel){
            this.model = customModel;
    }
  
    
    public int getBuildYear() {
            return this.buildYear;
    }
    
    public void setBuildYear (int customBuildYear) {
            this.buildYear = customBuildYear;
    }
    
    public int getMaxSpeed () {
            return this.maxSpeed;
    }
            
    public void setMaxSpeed(int customMaxSpeed){
            this.maxSpeed = customMaxSpeed;
    } 
    
    public String getColor (){
            return this.color;
    }
    
    public void setColor(String customColor) {
            this.color = customColor;
    }
    
    public int getMaxFuel (){
            return this.maxFuel;
    }
    
    public void setMaxFuel(int customMaxFuel) {
            this.maxFuel= customMaxFuel;
    }
    
    public int getCurrentFuel (){
            return this.currentFuel;
    }
    
    public void setCurrentFuel(int customCurrentFuel) {
            this.currentFuel = customCurrentFuel;
    }
    
    public int getConsuption(){
            return this.consuption;
    }
    
    public void setConsuption(int customConsuption) {
            this.consuption= customConsuption;
    }
    
    public String getVehicleType () {
            return this.vehicleType;
    } 
    
    
    public void showData () {
        System.out.println("Model:" + this.getModel());
        System.out.println("Godina proizvodnje :" + this.getBuildYear ());
        System.out.println("Boja :" + this.getColor());
        System.out.println("Potrosnja :" + this.getConsuption());
        System.out.println("Stanje rezervoara :" + this.getCurrentFuel ());
        System.out.println("KApacitet rezervoara je :" + this.getMaxFuel());
        System.out.println();
}


}