public class motorcycle extends Vehicle implements serviceable{
   
   private String transmissionType;
   
   public motorcycle(String brand, int year, String model,String transmissionType){
       
      super(brand,year, model);
         this.transmissionType= transmissionType;
   
   }
   
   public void displayInfo(){
      super.displayInfo();
      System.out.println("Transmission Type: "+transmissionType);
      System.out.println();
   }
     @Override
   public void moveForward(){
      System.out.println("the motor moved forward");
   } 
    @Override
   public void moveBackward(){
      System.out.println("the motor moved backwards");
   } 

    @Override
   public void moveRight(){
      System.out.println("the motor moved right");
   } 

    @Override
   public void moveLeft(){
      System.out.println("the motor moved left");
   } 
   @Override
    public void service(){
      System.out.println("Your motorcycle need service.");
    }








}