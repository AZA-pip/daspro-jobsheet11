public class PengunjungCafe03 {
    public static void main(String[] args) {
        String[] tamu = {"Ali" , "Budi" , "Citra"};
        daftarPengunjung(tamu);
    }
    static void daftarPengunjung(String... namaPenggunjung){
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama : namaPenggunjung) {
            System.out.println("- "+ nama);
        }
        /*for(int i =0;i< namaPenggunjung.length; i++){
            System.out.println("- "+ namaPenggunjung[i]);
        }*/
    }
}
