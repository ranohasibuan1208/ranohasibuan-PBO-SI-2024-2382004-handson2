package Ternaryoperator;

public class Ternaryoperator {
    public static void main(String[] args) {
        int nilai = 80;
        String hasil = (nilai >= 75) ? "Lulus" : "Tidak Lulus";
        System.out.println(hasil);

        if (nilai > 75) {
            System.out.println("Kamu lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
    }
}
