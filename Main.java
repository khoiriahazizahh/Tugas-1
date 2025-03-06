public class Main {
    public static void main(String[] args) {
        // Membuat objek Phone dengan merk "Samsung", RAM 8GB, harga 12 juta
        Phone hp1 = new Phone("Samsung", 8, 12);
        
        // Membuat objek Phone dengan merk "Xiaomi", RAM 6GB, harga 5 juta
        Phone hp2 = new Phone("Xiaomi", 6, 5);

        // Menampilkan informasi HP pertama
        System.out.println("Info HP Pertama:");
        hp1.displayInfo(); // Memanggil method untuk menampilkan informasi hp1
        hp1.checkHarga(); // Mengecek apakah hp1 mahal atau murah
        System.out.println(); // Memberikan spasi kosong di output

        // Menampilkan informasi HP kedua
        System.out.println("Info HP Kedua:");
        hp2.displayInfo(); // Memanggil method untuk menampilkan informasi hp2
        hp2.checkHarga(); // Mengecek apakah hp2 mahal atau murah
    }
}