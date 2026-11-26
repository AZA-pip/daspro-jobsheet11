public class PengunjungCafe03 {
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra" );
        daftarPengunjung("Andi");
        daftarPengunjung("Doni","Eti", "Fahmi", "Galih");
    }
    static void daftarPengunjung(String... namaPenggunjung){
        System.out.println("Daftar Nama Pengunjung:");
        for(int i =0;i< namaPenggunjung.length; i++){
            System.out.println("- "+ namaPenggunjung[i]);
        }
    }
}
