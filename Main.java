public class Main {
    public static void main(String[] args) {
        Vehicle[] cars = {
            new Vehicle("Mercedes-Benz", "G-Wagon", 2023),
            new Vehicle("Suzuki", "Jimny", 2021),
            new Vehicle("Mercedes-Benz", "300SL Gullwing", 1955)
        };

        for (int i = 0; i < cars.length; i++) {
            printVehicle(cars[i], i + 1);
        }

        testSetYear(cars[0]);
        testInvalidYears();
    }

    public static void printVehicle(Vehicle v, int num) {
        System.out.println("===== Vehicle " + num + " =====");
        v.displayInfo();
        System.out.println("Age: " + v.calculateAge());
        System.out.println("Vintage? " + v.isVintage());
        System.out.println("Getters: " + v.getBrand() + " | " + v.getModel() + " | " + v.getYear());
        System.out.println();
    }

    public static void testSetYear(Vehicle v) {
        System.out.println("===== setYear Tests =====");
        System.out.println("setYear(2000) -> " + v.setYear(2000));
        System.out.println("Year now: " + v.getYear() + " | Age: " + v.calculateAge() + " | Vintage: " + v.isVintage());
        System.out.println("setYear(1885) -> " + v.setYear(1885));
        System.out.println("Year still: " + v.getYear());
        System.out.println("setYear(2027) -> " + v.setYear(2027));
        System.out.println("Year still: " + v.getYear());
        System.out.println();
    }

    public static void testInvalidYears() {
        System.out.println("===== Invalid Constructor Years =====");
        Vehicle a = new Vehicle("Test", "Invalid1885", 1885);
        Vehicle b = new Vehicle("Test", "Invalid2027", 2027);
        System.out.println("Input 1885 -> stored year: " + a.getYear());
        System.out.println("Input 2027 -> stored year: " + b.getYear());
    }
}
