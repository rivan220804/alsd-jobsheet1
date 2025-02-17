import java.util.Scanner;
public class Assignments {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] kode = {"A","B"};
        String[] kota = {"Banten","Jakarta"};

        System.out.print("Masukkan kode plat nomor: ");
        String inputKode = sc.nextLine();

        for (int i = 0; i < kode.length; i++) {
            if (kode[i].equals(inputKode)) {
                System.out.println("Kota: " + kota[i]);
                return;
            }
        }
        System.out.println("Kode tidak ditemukan!");
    }
}
