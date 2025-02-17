import java.util.Scanner;
public class Pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("===Program Menghitung Nilai Akhir Mahasiswa");
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

        double nilaiAkhir = (0.2 * tugas) + (0.4 * UAS) + (0.2 * kuis) + (0.3 * UTS);
        String grade;
        String status;

        System.out.println("==========================");
        if (nilaiAkhir >= 80) grade ="A"; 
        else if (nilaiAkhir >= 73) grade = "B+";
        else if (nilaiAkhir >= 65) grade = "B";
        else if (nilaiAkhir >= 60) grade = "C+";
        else if (nilaiAkhir >= 50) grade = "C";
        else if (nilaiAkhir >= 39) grade = "D";
        else if (nilaiAkhir <= 39) grade = "E";
        
            
        
        
        
    }
}