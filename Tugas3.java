import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        
        String[] menu = { 
        "Nasi Goreng", 
        "Mie Goreng", 
        "Roti Bakar", 
        "Kentang Goreng", 
        "Teh Tarik", 
        "Chocolate Ice", 
        "Cappucino"
    };
        Scanner sc = new Scanner(System.in);
        System.out.println("=== MENU ===");
        for (String item : menu) {
            System.out.println("- " +item);
        }
        System.out.println();
        System.out.print("Masukkan menu yang ingin dicari : ");
        String key = sc.nextLine();

        boolean tersedia = false;
        for (int i = 0; i < menu.length; i++) {
        if (key.equalsIgnoreCase(menu[i])) {
            tersedia = true;
            break;
        }   
    }
        if (tersedia) {
            System.out.println("Menu "+ key +" tersedia ");
        } else {
            System.out.println("Menu yang dicari tidak tersedia");
        }
}
}
