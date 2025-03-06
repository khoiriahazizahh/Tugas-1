public class Phone {
    private String Merk; // atribut untuk menyimpan merk HP
    private int RAM; // atribut untuk menyimpan jumlah RAM dalam GB
    private int Harga; // atribut untuk menyimpan harga dalam juta rupiah

    // Constructor untuk menginisialisasi objek Phone
    public Phone(String Merk, int RAM, int Harga) {
        this.Merk = Merk; // mengisi atribut Merk dengan nilai dari parameter
        this.RAM = RAM; // mengisi atribut RAM dengan nilai dari parameter
        this.Harga = Harga; // mengisi atribut Harga dengan nilai dari parameter
    }

    // Method untuk menampilkan informasi HP
    public void displayInfo() {
        System.out.println("Merk: " + Merk); // menampilkan merk HP
        System.out.println("RAM: " + RAM + " GB"); // menampilkan RAM HP
        System.out.println("Harga: Rp" + Harga + " juta"); // menampilkan harga HP
    }

    // Method untuk mengecek apakah HP mahal atau murah
    public void checkHarga() {
        if (Harga >= 10) { // jika harga 10 juta atau lebih, dianggap mahal
            System.out.println("HP ini mahal.");
        } else { // jika kurang dari 10 juta, dianggap murah
            System.out.println("HP ini termasuk murah.");
        }
    }
}
