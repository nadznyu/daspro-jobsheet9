import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int bykNilai = sc.nextInt();

        int[] arrnilaiMhs = new int[bykNilai];
        int total = 0;
        int rata2;
        int nilaiTertinggi = 0;
        int nilaiTerendah = 0;

        for (int i = 0; i < arrnilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            arrnilaiMhs[i] = sc.nextInt();
            total += arrnilaiMhs[i];
        }
        if (arrnilaiMhs.length > 0) {
            nilaiTertinggi = arrnilaiMhs[0];
            nilaiTerendah = arrnilaiMhs[0];
        }
        for (int i = 0; i < arrnilaiMhs.length; i++) {
            if (arrnilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = arrnilaiMhs[i];
            }
            if (arrnilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = arrnilaiMhs[i];
            }
        }
        rata2 = total/arrnilaiMhs.length;
        System.out.println();
        System.out.println("=== DATA NILAI MAHASISWA ===");
        System.out.println("Rata-rata nilai = "+rata2);
        System.out.println("Nilai tertinggi = "+ nilaiTertinggi);
        System.out.println("Nilai terendah  = "+ nilaiTerendah);

        System.out.println();
        System.out.println("=== NILAI YANG TELAH DIMASUKKAN ===");
        for (int i = 0; i < arrnilaiMhs.length; i++) {
        System.out.println("Nilai ke-" + (i + 1) + " = " + arrnilaiMhs[i]);
        }
    }
}
