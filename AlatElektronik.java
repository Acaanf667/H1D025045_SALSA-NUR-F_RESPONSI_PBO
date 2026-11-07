public abstract class AlatElektronik {
    public static final String MERK_PABRIK = "SMART-TECH"; 
    private final String idAlat; 
    private boolean status;

    public AlatElektronik(String idAlat) {
        this.idAlat = idAlat;
        this.status = false;
    }
 
    public AlatElektronik(String idAlat, boolean status) {
        this.idAlat = idAlat;
        this.status = status;
    }

    public String getIdAlat() { return idAlat; }
    public boolean isStatus() { return status; }
    public void setStatus(boolean status) { this.status = status; }

    public abstract void infoAlat(); 
}