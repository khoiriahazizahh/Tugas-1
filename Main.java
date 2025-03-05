public class Main {
    public static void main(String[] args) {
        
        Phone hp1 = new Phone("Samsung", 8, 12);
        Phone hp2 = new Phone("Xiaomi", 6, 5);

        
        System.out.println("Info HP Pertama:");
        hp1.displayInfo();
        hp1.checkHarga(); 
        System.out.println();

        System.out.println("Info HP Kedua:");
        hp2.displayInfo();
        hp2.checkHarga(); 
    }
}
