public class Makeup {
    public void tampilkanProduk (String nama) {
        System.out.println("Produk: " + nama);
    }

    public void tampilkanProduk(String nama, String jenis) {
        System.out.println("Produk: " + nama + ", Jenis: " + jenis);
    }

    public void tampilkanProduk(String nama, String jenis, double harga) {
        System.out.println("Produk: " + nama + ", Jenis: " + jenis + ", Harga: Rp" + harga );
    }

    public static void main(String[] args) {
        Makeup lipstik = new Makeup();
        lipstik.tampilkanProduk("Lip vnyl");
        lipstik.tampilkanProduk("lip vnyl", "glosy");
        lipstik.tampilkanProduk("lip vnyl", "glosy", 40000);
    }
}
