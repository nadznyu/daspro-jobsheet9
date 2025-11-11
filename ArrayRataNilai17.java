import java.util.Scanner;
public class ArrayRataNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        double rata2;
        int lulus = 0;
        int tidakLulus = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMhs = sc.nextInt();

        for (int i = 0; i < jmlMhs; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                lulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                tidakLulus++;
            }
        } 
        double rata2lulus = totalLulus/lulus;
        double rata2tidaklulus = totalTidakLulus/tidakLulus; 
        System.out.println("Rata-rata nilai lulus = "+rata2lulus);
        System.out.println("Rata-rata nilai tidak lulus = "+rata2tidaklulus);
    }
}


