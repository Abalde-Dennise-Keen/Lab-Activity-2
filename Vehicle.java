public class Vehicle {
    
    public String brand;
    public  String model;
    public  int year;
      
   public  Vehicle(String brand, int year, String model){
      this.brand = brand;
      this.year= year;
      this.model= model;
    }
    
    
    
   public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

   public int calculateAge() {
        return 2026 - year;
    }

    public boolean isVintage() {
        return calculateAge() > 25;
    }
}
