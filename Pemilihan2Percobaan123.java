import java.util.Scanner;

public class Pemilihan2Percobaan123 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);

        System.out.print("Masukkan tahun : "); 
        int tahun = input23.nextInt(); 
        System.out.println("Tahun : " + tahun);

        if ((tahun % 4) == 0 && (tahun % 100) != 0 || (tahun % 400) == 0) {
            System.out.println("Tahun kabisat");
        } else {
            System.out.println("bukan tahun kabisat");
        }
    }
}
