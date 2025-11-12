import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total;
        int harga = 0;
        int totalHarga = 0;

        System.out.print("Masukkan jumlah pesanan : ");
        int jmlPesanan = sc.nextInt();
        sc.nextLine();
        System.out.println();

        String[] arrnmPesanan = new String[jmlPesanan];
        int[] arrharga = new int[jmlPesanan];

        for (int i = 0; i < arrnmPesanan.length; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-"+(i+1)+" : ");
            arrnmPesanan[i] = sc.nextLine();
            
            System.out.print("Harga "+ arrnmPesanan[i] + " : ");
            arrharga[i] = sc.nextInt();
            sc.nextLine();
            }
            System.out.println();
            System.out.println("=== DAFTAR PESANAN ===");
            for (int i = 0; i < arrnmPesanan.length; i++) {
            System.out.println(arrnmPesanan[i]+ " : " + arrharga[i]);
            totalHarga += arrharga[i];
            }
            System.out.println();
            System.out.println("Total harga pesanan : " +totalHarga);

        
        
        

    }
}
