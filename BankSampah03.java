import java.util.Scanner;
public class BankSampah03 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        

        System.out.print("Masukkan jumlah nasabah: ");
        int n = sc.nextInt();

        double data [] = inputSetoran(n);

        tampilSetoran(data);

        double total = totalSetoran(data);
        System.out.println("Total seluruh sampah : " +total + " Kg");
        System.out.println();

        int harga = 3000;
        double saldo[] = hitungSaldo(data, harga);
        System.out.println("Saldo para nasabah");
        for(int i =0 ; i<saldo.length ; i++){
            System.out.println("Nasabah ke "+ (i+1) + " : Rp " + saldo[i] );
        }

        System.out.println();
        int terbanyak = nasabahTerbanyak(data);
        System.out.println("Nasabah dengan setoran terbesar");
        System.out.println("Nasabah ke "+terbanyak );
    }

    static double[] inputSetoran(int n){

        double data[]= new double[n];
        for(int i =0 ;i<n;i++){
            System.out.print("Masukkan berat sampah nasabah ke "+(i+1)+" (kg): ");
            data[i] = sc.nextDouble();
        }
        return data; 
    }

    static void tampilSetoran(double data[]){
        for(int i =0 ; i<data.length ; i++){
            System.out.println("Nasabah ke "+ (i+1) + " : " + data[i] + " Kg");
        }
    }

    static double totalSetoran(double data[]){
        double total = 0;
        for(int i =0 ; i<data.length; i++){
            total += data[i];
        }
        
        return total ;
    }

    static double[] hitungSaldo(double data[], int harga){

        double saldo[]=new double[data.length];

        for(int i =0 ; i<saldo.length; i++){
            saldo [i] = data[i] * harga;
        }
        return saldo;
    }

    static int nasabahTerbanyak(double data[]){

        int temp=-1;
        int terbesar=0;
        for (int i =1 ;i<=data.length; i++){
            if(terbesar > temp){
                terbesar = i;
            }
        }

        return terbesar;
    }
}
