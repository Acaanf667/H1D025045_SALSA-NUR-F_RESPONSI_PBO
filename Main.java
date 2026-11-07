public class Main {
    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN SISTEM IOT SMART HOME ===\n");

        TelevisiPintar tv = new TelevisiPintar("TV-01", 5);
        System.out.println("[ Pengujian Televisi Pintar ]");
        tv.infoAlat(); 
        tv.hubungkanWifi();
        tv.nyalakan();
        tv.matikan();

        System.out.println("\n----------------------------------\n");
        KipasAngin kipas = new KipasAngin("KPS-02", 3);
        
        System.out.println("[ Pengujian Kipas Angin ]");
        kipas.infoAlat(); 
        kipas.nyalakan();
        kipas.nyalakan(); 
        kipas.matikan();

        System.out.println("\n=== PENGUJIAN SELESAI ===");
    }
}