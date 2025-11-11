import java.util.Scanner;
public class SearchNilai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int bykNilai = sc.nextInt();
        
    int[] arrNilaiMhs = new int[bykNilai];
    for (int i = 0; i < arrNilaiMhs.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
        arrNilaiMhs[i] = sc.nextInt();
    }
    System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        int hasil = 0;
    for (int i = 0; i < arrNilaiMhs.length; i++) {
        if (key == arrNilaiMhs[i]) {
            hasil = i;
            break;
        }   
    }
    System.out.println();
    System.out.println("Nilai "+key+" ketemu, merupakan nilai mahasiswa ke-"+(hasil+1));
}
}
        

