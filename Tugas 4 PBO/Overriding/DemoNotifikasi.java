class Notifikasi {
    public void kirim(String pesan) {
        System.out.println("Mengirim pesan: " + pesan);
    }
}

class NotifikasiEmail extends Notifikasi {
    @Override
    public void kirim(String pesan) {
        System.out.println("Mengirim email: " + pesan);
    }
}

class NotifikasiSMS extends Notifikasi {
    @Override
    public void kirim(String pesan) {
        System.out.println("Mengirim SMS: " + pesan);
    }
}

    public class DemoNotifikasi {
    public static void main(String[] args) {
        Notifikasi notif1 = new NotifikasiEmail();
        Notifikasi notif2 = new NotifikasiSMS();
        notif1.kirim("hallo hai");
        notif2.kirim("selamat pagi, selamat beraktifitas semangattt");
    }
}
