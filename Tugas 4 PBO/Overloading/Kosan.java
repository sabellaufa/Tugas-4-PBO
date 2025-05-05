public class Kosan {

    public void infoKosan(String nama) {
        System.out.println("Nama kos: " + nama);
    }

     public void infoKosan(String nama, int harga) {
        System.out.println("Nama kos: " + nama + ", Harga per bulan: Rp" + harga);
     }

     public void infoKosan(String nama, int harga, String fasilitas) {
        System.out.println("Nama kos: "+ nama + ", Harga: Rp" + harga + ", Fasilitas: " + fasilitas);
     }

     public static void main(String[] args) {
         Kosan kos1 = new Kosan();

         kos1.infoKosan("Kosan Melati");
         kos1.infoKosan("Kosan Melati", 500000);
         kos1.infoKosan("Kosan Melati", 500000, "wifi, Lemari, Kasur");
     }
}
