import java.util.Scanner;
public class Pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Program Menghitung Nilai Akhir Mahasiswa");
        System.out.println("======================================");

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double UTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double UAS = sc.nextDouble();
        System.out.println("==========================");
        System.out.println("==========================");

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || UTS < 0 || UTS > 100 || UAS < 0 || UAS > 100) {
            System.out.println("Nilai tidak valid");
        } else {
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * UTS) + (0.4 * UAS);
            String huruf;
            if (nilaiAkhir >= 80) huruf = "A";
            else if (nilaiAkhir >= 75) huruf = "B+";
            else if (nilaiAkhir >= 70) huruf = "B";
            else if (nilaiAkhir >= 65) huruf = "C+";
            else if (nilaiAkhir >= 60) huruf = "C";
            else if (nilaiAkhir >= 50) huruf = "D";
            else huruf = "E";
            
            String status = (huruf.equals("A") || huruf.equals("B+") || huruf.equals("B") || huruf.equals("C+") || huruf.equals("C")) ? "SELAMAT ANDA LULUS" : "TIDAK LULUS";
            System.out.println("============================");
          
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + huruf);
            System.out.println("Keterangan: " + status);
        }
            
        
        
        
    }
}