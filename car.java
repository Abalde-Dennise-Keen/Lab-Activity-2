 class car extends Vehicle implements serviceable{

   private int numberOfDoors;
   
   public car(String brand, int year, String model,int numberOfDoors){
      
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
      System.out.println("the car moved forward");
   } 
    @Override
   public void moveBackward(){
      System.out.println("the car moved backwards");
   } 

    @Override
   public void moveRight(){
      System.out.println("the car moved right");
   } 

    @Override
   public void moveLeft(){
      System.out.println("the car moved left");
   } 
   
   @Override
    public void service(){
      System.out.println("Your Car need service.");
    }







}