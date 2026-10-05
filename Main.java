public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Mercedes-Benz", "G-Wagon", 2023);
        Vehicle v2 = new Vehicle("Suzuki", "Jimny", 2021);
        Vehicle v3 = new Vehicle("Mercedes-Benz", "300SL Gullwing", 1955);

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
