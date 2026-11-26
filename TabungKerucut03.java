import java.util.Scanner;
public class TabungKerucut03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int pilih;
        do{
            System.out.println("Menu");
            System.out.println("1. Luas Lingkaran");
            System.out.println("2. Volume Tabbung");
            System.out.println("3. Luas Permukaan Tabung");
            System.out.println("4. Volume Kerucut");
            System.out.println("0. Exit");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan jari jari lingkaran: ");
                    double jari = sc.nextDouble();
                
                    double L =luaslingkaran(jari);
                    System.out.println("Luas lingkaran: " + L + " cm2");

                    break;
                
                case 2 :
                    System.out.print("Masukkan jari jari lingkaran: ");
                    jari = sc.nextDouble();
                    System.out.print("Masukkan tinggi tabung: ");
                    double tinggi = sc.nextDouble();

                    double VTabung = volumeTabung(jari, tinggi);
                    System.out.println("Volume tabung : " + VTabung+ " cm3");
                    break;

                case 3 :
                    System.out.print("Masukkan jari jari lingkaran: ");
                    jari = sc.nextDouble();
                    System.out.print("Masukkan tinggi tabung: ");
                    tinggi = sc.nextDouble();

                    double LPeremukaan = luasPermukaanTabung(jari, tinggi) ;
                    System.out.println("Luas permukaan tabung : " + LPeremukaan + " cm2");
                    break;

                case 4 :
                    System.out.print("Masukkan jari jari lingkaran: ");
                    jari = sc.nextDouble();
                    System.out.print("Masukkan tinggi tabung: ");
                    tinggi = sc.nextDouble();

                    double VKerucut = volumeKerucut(jari, tinggi);
                    System.out.println("Volume kerucut: " + VKerucut + " cm3");
                    break;
                default:

                    break;
            }
        }while(pilih !=0);
        
        sc.close();;
    }

    static double luaslingkaran(double r){
        double pi = 3.14;
        double Llingkaran = pi * (r *r);
        return Llingkaran;
    }

    static double volumeTabung(double r, double t){

        double Vlingkaran = luaslingkaran(r) * t;
        return Vlingkaran;
    }

    static double luasPermukaanTabung(double r, double t){
        double pi =3.14;
        double selimut = (2 * pi * r) * t;
        double LPermukaan = 2 * luaslingkaran(r)  + selimut; 
        return LPermukaan;
    }

    static double volumeKerucut(double r, double t){

        double VKerucut = volumeTabung(r, t) / 3;
        return VKerucut;
    }
}
