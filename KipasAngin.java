public class KipasAngin extends AlatElektronik implements Kontrol {
    private int kecepatan;

    public KipasAngin(String idAlat, int kecepatan) {
        super(idAlat); // Super Chaining
        this.kecepatan = kecepatan;
    }

    @Override
    public void nyalakan() {
        if (isStatus()) {
            System.out.println("Kipas sudah berputar.");
        } else {
            setStatus(true);
            System.out.println("Kipas BERHASIL DIHIDUPKAN.");
        }
    }

    @Override
    public void matikan() {
        if (!isStatus()) {
            System.out.println("Kipas sudah mati.");
        } else {
            setStatus(false);
            System.out.println("Kipas DIMATIKAN.");
        }
    }

    @Override
    public void infoAlat() {
        System.out.println("Info Kipas | ID: " + getIdAlat() + " | Kecepatan: " + kecepatan);
    }
}