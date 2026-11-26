import java.util.Scanner;
public class RekapLaundry03 {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {

        System.out.print("Masukkan jumlah layanan: ");
        int jumlah_layanan = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumlah_hari = sc.nextInt();
        sc.nextLine();

        String namaLayanan[] = new String[jumlah_layanan];
        int harga[] = new int[jumlah_layanan];
        inputLayanan(namaLayanan, harga);

        int penjualan[][] = inputdata(namaLayanan, jumlah_hari);

        tampilSetoran(penjualan, namaLayanan);

        int id=1;
        int total_perlayanan = totalPerlayanan(penjualan, id);
        System.out.println("Total layanan ke " +id +" (" + namaLayanan[id-1] + ") : " +total_perlayanan);

        layananTertinggi(penjualan, namaLayanan);

        int hari_sibuk = hariTersibuk(penjualan);
        System.out.println("Hari tersibuk ada pada Hari ke-"+ (hari_sibuk+1));

        pendapatanLayanan(penjualan, namaLayanan, harga);
    }

    static void inputLayanan(String[] namaLayanan, int[] harga){
        for(int i = 0 ; i < namaLayanan.length ; i++){
            System.out.println("Layanan ke " + (i+1));
            System.out.print("Masukkan nama layanan : ");
            namaLayanan[i] = sc.nextLine();
            System.out.print("Masukkan harga per kg : ");
            harga[i] = sc.nextInt();
            sc.nextLine();
        }
    }

    static int[][] inputdata(String[] namaLayanan, int b){
        int penjualan [][]= new int[namaLayanan.length][b];
        for(int i =0;i<penjualan.length;i++){
            System.out.println("Layanan " + namaLayanan[i]);
            for(int j = 0 ;j < penjualan[0].length ;j++ ){
                System.out.print("Masukkan penjualan (kg) Hari ke-"+ (j+1) +": " );
                penjualan[i][j]=sc.nextInt();
            }
        }
        return penjualan;
    }

    static void tampilSetoran(int[][] penjualan, String[] namaLayanan){
        System.out.printf("%-20s", "Layanan");
        for(int j = 0 ; j < penjualan[0].length ; j++){
            System.out.printf("%-10s", "Hari ke-" + (j+1));
        }
        System.out.println();
        for (int i = 0 ; i< penjualan.length;i++ ){
            System.out.printf("%-20s", namaLayanan[i]);
            for(int j =0 ; j<penjualan[i].length;j++){
                System.out.printf("%-10d", penjualan[i][j]);
            }
            System.out.println();
        }
    }

    static int totalPerlayanan(int[][] data, int id){
        int total=0;
        for(int j =0;j<data[id-1].length;j++){
            total+=data[id-1][j];
        }
        return total;
    }

    static void layananTertinggi(int[][] data, String[] namaLayanan){
        int total =0;
        int terbesar = -1;
        int id =0;
        for (int i =0 ;i<data.length;i++){
            total =0;
            for(int j =0;j<data[i].length;j++){
                total+=data[i][j];
            }
            if (total>terbesar){
                terbesar = total;
                id = i ;
            }
        }
        System.out.println("Layanan dengan Berat cucian Tertinggi");
        System.out.println("Layanan " + namaLayanan[id] + " : " + terbesar);
    }

    static int hariTersibuk(int[][] data){
        int idHari=0;
        int totalTerbesar=-1;
        for (int j = 0; j < data[0].length; j++) {
            int total = 0;
            for (int i = 0; i < data.length; i++) {
                total += data[i][j];
            }
            if (total > totalTerbesar) {
                totalTerbesar = total;
                idHari = j;
            }
        }
        return idHari;
    }

    static void pendapatanLayanan(int[][] data, String[] namaLayanan, int[] harga){
        int total_pendapatan = 0;
        for (int i = 0 ; i < data.length ; i++){
            int total = 0;
            for(int j = 0 ; j < data[i].length ; j++){
                total += data[i][j];
            }
            int pendapatan = total * harga[i];
            System.out.println("Pendapatan layanan " + namaLayanan[i] + " : " + pendapatan);
            total_pendapatan += pendapatan;
        }
        System.out.println("Total pendapatan selama " + data[0].length + " hari : " + total_pendapatan);
    }
}