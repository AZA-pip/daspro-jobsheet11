import java.util.Scanner;
public class Kafe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nama="";
        boolean member;
        int jamKunjung=0;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Apakah kamu member? (true/false): ");
        member = sc.nextBoolean();
        System.out.print("Masukkan jam kunjungan: ");
        jamKunjung = sc.nextInt();

        Menu(nama, member,jamKunjung);

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu= sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem  = sc.nextInt();

        int totalBayar = hitungTotalHarga03(pilihanMenu, banyakItem);

        System.out.println("Total harga untuk pesanan Anda: Rp"+totalBayar);

        sc.close();
    }

    public static void Menu(String namaPelanggan, boolean isMember, int jam){
    System.out.println("Selamat datang, "+ namaPelanggan + "!");

    if(isMember){
        System.out.println("Anda adalah member , dapatkan diskon 10% untuk setiap pembelian!");
    }
    
    if(jam >= 14 && jam <=16 ){
        System.out.println("Happy Hour! Diskon 20% untuk semua minuman");
    }
    

    System.out.println("===== MENU RESTO KAFE =====");
    System.out.println("1. Kopi Hitam - Rp 15,000");
    System.out.println("2. Cappuccino - Rp 20,000");
    System.out.println("3. Latte - Rp 12,000");
    System.out.println("4. Teh Tarik - 12,000");
    System.out.println("5. Roti Bakar - Rp 10,000");
    System.out.println("6. Mie Goreng - Rp 18,000");
    System.out.println("==========================");
    System.out.println("Silahkan pilih menu yang Anda inginkan.");

    }

    public static int hitungTotalHarga03(int pilihanMenu, int banyakItem) {
        int hargaItems[] = {15000,20000,22000,12000,10000,18000};

        int hargaTotal = hargaItems[pilihanMenu -1 ]* banyakItem;
        return hargaTotal;
    }
}

