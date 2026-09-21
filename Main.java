public class Main {
    public static void main(String[] args) {

        
        Vehicle v1 = new Vehicle();
        v1.brand = "Mercedes-Benz";
        v1.model = "G-Wagon";
        v1.year = 2023;

        Vehicle v2 = new Vehicle();
        v2.brand = "Suzuki";
        v2.model = "Jimny";
        v2.year = 2021;

        Vehicle v3 = new Vehicle();
        v3.brand = "Mercedes-Benz";
        v3.model = "300SL Gullwing";
        v3.year = 1955;

        
        System.out.println("===== Vehicle 1 =====");
        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Vintage? " + v1.isVintage());
        System.out.println();

        System.out.println("===== Vehicle 2 =====");
        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Vintage? " + v2.isVintage());
        System.out.println();

        System.out.println("===== Vehicle 3 =====");
        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Vintage? " + v3.isVintage());
    }
}