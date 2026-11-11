public class truck extends Vehicle implements serviceable{
   private int numberOfDoors;
   
   public truck(String brand, int year, String model,int numberOfDoors){
      
      super(brand,year, model);
         this.numberOfDoors= numberOfDoors;
   
   }
   
   public void displayInfo(){
      super.displayInfo();
      System.out.println("Doors: "+numberOfDoors);
      System.out.println();
   }
    @Override
   public void moveForward(){
      System.out.println("the truck moved forward");
   } 
    @Override
   public void moveBackward(){
      System.out.println("the truck moved backwards");
   } 

    @Override
   public void moveRight(){
      System.out.println("the truck moved right");
   } 

    @Override
   public void moveLeft(){
      System.out.println("the truck moved left");
   } 

    @Override
    public void service(){
      System.out.println("Your Truck need service.");
    }



}