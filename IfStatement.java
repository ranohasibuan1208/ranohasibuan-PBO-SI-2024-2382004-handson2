import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nomor diantara 1 sampai 7: ");
        int nomorHari = scanner.nextInt();
        String namaHari = "";

        if (nomorHari == 1) {
            namaHari = "Minggu";
        } else if (nomorHari == 2) {
            namaHari = "Senin";
        } else if (nomorHari == 3) {
            namaHari = "Selasa";
        } else if (nomorHari == 4) {
            namaHari = "Rabu";
        } else if (nomorHari == 5) {
            namaHari = "Kamis";
        } else if (nomorHari == 6) {
            namaHari = "Jumat";
        } else if (nomorHari == 7) {
            namaHari = "Sabtu";
        } else {
            System.out.println("Masukkan nomor diantara 1 sampai 7");
            System.exit(0);
        }

        System.out.println("Nama Hari: " + namaHari);

        scanner.close();
    }
}
