import java.util.Scanner;
public class Pemilihan2Percobaan123 {
    public static void main(String[] args) {
        Scanner Absen23 = new Scanner(System.in);

        System.out.print("Masukkan tahun : "); 
        int tahun = Absen23.nextInt(); 
        System.out.println("Nomor absen Anda adalah: " + tahun);

        if ((tahun %  4)== 0) {
            if ((tahun % 100 )!=0);
            System.out.println("Tahun kabisat");
        } else {
            System.out.println("bukan tahun kabisat");
        }
    }
}