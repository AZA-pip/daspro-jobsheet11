public class PengunjungCafe03 {
    public static void main(String[] args) {
        String[] tamu = {"Ali" , "Budi" , "Citra"};
        int hargaa[] = {5000,18000,28000}; 
        int nomorMeja = 1;
        daftarPengunjung(nomorMeja,tamu);

        int hasil = hitungTotalBelanja(hargaa);
        System.out.println("Total biaya: " + hasil);

    }

    static void daftarPengunjung(int nomorMeja, String... namaPenggunjung){
        System.out.println("Daftar Nama Pengunjung:");
        int i =0;
        for (String nama : namaPenggunjung) {
            System.out.println("- "+"Meja no "+(i+1) +": "+ nama);
            i++;
            }
        
        /*for(int i =0;i< namaPenggunjung.length; i++){
            System.out.println("- "+ namaPenggunjung[i]);
        }*/
    }
    
    static int hitungTotalBelanja(int... harga){
        int total=0;
        for (int Rp : harga) {
            total+= Rp;
        }

        return total;
    }
}
