public class Main{
   public static void printAll(Vehicle vehicle){
      vehicle.displayInfo();
        
   
   }   
   public static void printMovement(Vehicle vehicle){
      vehicle.moveForward();
      vehicle.moveBackward();
      vehicle.moveLeft();
      vehicle.moveRight();
      } 
    public static void performService(serviceable item){
         item.service();
    }
    
   public static void main(String[] args){
     
     
                
      Vehicle c1=new car("Toyota",2011,"Furtuner",4); 
            
             printAll(c1);
             
      c1= new motorcycle("ADV",2022," alveywashu","CVT");
            printAll(c1);
      c1=new truck("Ford",2018,"F-series",4);
            printAll(c1);
            
            
            
       System.out.println("One method different types: ");
       
       car car= new car("GTR",1969,"Hakosuka",4);
         printAll(car);
       motorcycle motor=new motorcycle("Honda",2021,"Beat","CVT");
         printAll(motor);
       truck truck= new truck("Ford",2024,"Raptor",4);
         printAll(truck);       
       
       System.out.println("Mixed arrays");
       
       Vehicle[] washu={
         new car("Toyota",2011,"Furtuner",4),
         new motorcycle("Raider",2018,"150","6-speed constant mesh"),
         new truck("Nissan",2010,"Frontier",4)
       };
       for(Vehicle coll: washu){
            printAll(coll); 
            printMovement(coll);
            System.out.println();
         }
         
         printer printer= new printer();
         serviceable[] items = {car,
                            truck,
                            motor,
                            printer
                            };
                            
                 
        for(serviceable item: items){
            performService(item);
            
         }
         
         
            
            

   }
}