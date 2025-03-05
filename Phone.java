public class Phone {
    private String Merk;
    private int RAM; 
    private int Harga; 

    //Constructor
    public Phone(String Merk, int RAM, int Harga) {
        this.Merk = Merk;
        this.RAM = RAM;
        this.Harga = Harga;
    }

    //Method atribut object
    public void displayInfo() {
        System.out.println("Merk: " + Merk);
        System.out.println("RAM: " + RAM + " GB");
        System.out.println("Harga: Rp" + Harga + " juta");
    }

    //Method bebas: cek apakah HP mahal atau murah
    public void checkHarga() {
        if (Harga >= 10) {
            System.out.println("HP ini mahal.");
        } else {
            System.out.println("HP ini termasuk murah.");
        }
    }

    //Getter akses atribut 
    public String getMerk() {
        return Merk;
    }

    public int getRAM() {
        return RAM;
    }

    public int getHarga() {
        return Harga;
    }
}
