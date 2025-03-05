public class main {
    public static void main(String[] args) {
        //hp pertama
        phone hp1 = new phone();
        hp1.brand = "Samsung";
        hp1.ram = 8;
        hp1.price = 799.99;

        //hp kedua
        phone hp2 = new phone();
        hp2.brand = "iPhone";
        hp2.ram = 6;
        hp2.price = 999.99;

        // Menampilkan atribut objek pertama
        System.out.println("Phone 1:");
        System.out.println("Brand: " + hp1.brand);
        System.out.println("RAM: " + hp1.ram + "GB");
        System.out.println("Price: $" + hp1.price);
        System.out.println();

        // Menampilkan atribut objek kedua
        System.out.println("Phone 2:");
        System.out.println("Brand: " + hp2.brand);
        System.out.println("RAM: " + hp2.ram + "GB");
        System.out.println("Price: $" + hp2.price);
    }
}
