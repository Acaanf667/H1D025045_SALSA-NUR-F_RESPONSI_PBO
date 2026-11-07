public class TelevisiPintar extends AlatElektronik implements Kontrol, Koneksi {
    private int channel;

    public TelevisiPintar(String idAlat, int channel) {
        super(idAlat); // Super Chaining
        this.channel = channel;
    }

    @Override
    public void hubungkanWifi() {
        System.out.println("TV " + getIdAlat() + " terhubung ke Internet.");
    }

    @Override
    public void nyalakan() {
        if (isStatus()) {
            System.out.println("TV sudah menyala.");
        } else {
            setStatus(true);
            System.out.println("TV BERHASIL DIHIDUPKAN.");
        }
    }

    @Override
    public void matikan() {
        if (!isStatus()) {
            System.out.println("TV sudah mati.");
        } else {
            setStatus(false);
            System.out.println("TV DIMATIKAN.");
        }
    }

    @Override
    public void infoAlat() {
        System.out.println("Info TV | ID: " + getIdAlat() + " | Channel: " + channel);
    }
}