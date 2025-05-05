class Kendaraan {
    public void suaraKlakson() {
        System.out.println("Kendaraan membunyikan klakson.");
    }
}

class Mobil extends Kendaraan {
    @Override
    public void suaraKlakson() {
        System.out.println("Mobil: Beep beep!");
    }
}

class Motor extends Kendaraan {
    @Override
    public void suaraKlakson() {
        System.out.println("Motor: Tiiinnn!");
    }
}
    public class Kendaraann {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Mobil();
        Kendaraan kendaraan2 = new Motor();

        kendaraan1.suaraKlakson();  // Output dari class Mobil
        kendaraan2.suaraKlakson();  // Output dari class Motor
    }
}