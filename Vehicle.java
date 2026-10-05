public class Vehicle {
    
     String brand;
     String model;
     int year;
      
    Vehicle(String brand, int year, String model){
      this.brand = brand;
      this.year= year;
      this.model= model;
    }
    
    
    
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    int calculateAge() {
        return 2026 - year;
    }

    boolean isVintage() {
        return calculateAge() > 25;
    }
}
