import java.util.Scanner;
public class RekapLaundry03 {
    static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        

        int harga[]= {6000 , 8000, 5000, 12000};

        int penjualan[][] = inputdata(4,6);
        
        tampilSetoran(penjualan);
        System.out.println();

        int id=1;
        int total_perlayanan = totalPerlayanan(penjualan, id);
        System.out.println("total layanan ke" +id +": " +total_perlayanan);
        System.out.println();

        layananTertinggi(penjualan);
        System.out.println();

        int hari_sibuk = hariTersibuk(penjualan);
        System.out.println("Hari tersibuk ada pada hari ke "+ hari_sibuk);
        System.out.println();

        pendapatanLayanan(penjualan, harga);
    }

    static int[][] inputdata(int a, int b){
        int penjualan [][]= new int[a][b];
        for(int i =0;i<penjualan.length;i++){
            System.out.print("Layanan ke "+ (i+1));
            for(int j = 0 ;j < penjualan[0].length ;j++ ){
                System.out.print("\nMasukkan penjualan hari ke "+ (j+1) +": " );
                penjualan[i][j]=sc.nextInt();
            }
        }
        return penjualan;
    } 
    static void tampilSetoran(int[][] penjualan){
        for (int i = 0 ; i< penjualan.length;i++ ){
            System.out.print("layanan ke " + (i+1) + "   ");
            for(int j =0 ; j<penjualan[i].length;j++){
                System.out.print(penjualan [i][j] + "   ");
            }
            System.out.println();
        }
    }
    static int totalPerlayanan(int[][] data, int id){
        int total=0;
        for (int i =0 ;i<id;i++){
            total =0 ;
            for(int j =0;j<data[0].length;j++){
                total+=data[i][j];
            }
        }
        return total;
    }

    static void layananTertinggi(int[][] data){
        int total =0;
        int terbesar = 0;
        int id =0;
        for (int i =0 ;i<data.length;i++){
            total =0;
            for(int j =0;j<data[0].length;j++){
                total+=data[i][j];
            }
            if (total>terbesar){
                terbesar = total;
                id = i ;
            }
        }
        switch (id) {
            case 0:
                System.out.println("Layanan dengan Berat cucian Tertinggi");
                System.out.println("Layanan Cuci Kering : " + terbesar);
                break;
            case 1:
                System.out.println("Layanan dengan Berat cucian Tertinggi");
                System.out.println("Layanan Cuci Setrika : " + terbesar);
                break;
            case 2:
                System.out.println("Layanan dengan Berat cucian Tertinggi");
                System.out.println("Layanan Setrika saja : " + terbesar);
                break;
            case 3:
                System.out.println("Layanan dengan Berat cucian Tertinggi");
                System.out.println("Layanan Express : " + terbesar);
                break;
            default:
                break;
        }
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

    static void pendapatanLayanan(int[][] data, int[] harga){
        int total_pendapatan = 0;
        for (int i = 0 ; i < data.length ; i++){
            int total = 0;
            for(int j = 0 ; j < data[0].length ; j++){
                total += data[i][j];
            }
            int pendapatan = total * harga[i];
            System.out.println("Pendapatan layanan ke " + (i+1) + " : " + pendapatan);
            total_pendapatan += pendapatan;
        }
        System.out.println("Total pendapatan selama 6 hari : " + total_pendapatan);
    }
}
