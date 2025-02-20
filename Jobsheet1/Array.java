import java.util.Scanner;

public class Array{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] namaMK = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking and Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum dan Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };
        
        int jumlahMK = namaMK.length;
        int[] sks = {2, 3, 3, 2, 2, 3, 3, 2};
        int[] nilaiAngka = new int[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] nilaiSetara = new double[jumlahMK];
        
        double totalNilai = 0;
        int totalSKS = 0;
        
        System.out.println("=====================================");
        System.out.println("    Program Menghitung IP Semester   ");
        System.out.println("=====================================");
        
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan nilai angka untuk MK" + namaMK[i] + ": ");
            nilaiAngka[i] = input.nextInt();
            
            nilaiHuruf[i] = konversiNilaiHuruf(nilaiAngka[i]);
            nilaiSetara[i] = konversiNilaiSetara(nilaiHuruf[i]);
            
            totalNilai += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }
        
        double ipSemester = totalNilai / totalSKS;
        
        System.out.println("\n==============================================");
        System.out.println("            Hasil Perhitungan IP Semester      ");
        System.out.println("==============================================");
        System.out.printf("%-40s %-10s %-15s %-15s%n", "Mata Kuliah", "SKS", "Nilai Huruf", "Nilai Setara");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-40s %-10d %-15s %-15.1f%n", namaMK[i], sks[i], nilaiHuruf[i], nilaiSetara[i]);
        }
        
        System.out.println("==============================================");
        System.out.printf("IP Semester: %.2f%n", ipSemester);
        System.out.println("==============================================");
        
        input.close();
    }
    
    public static String konversiNilaiHuruf(int nilai) {
        return (nilai > 80) ? "A" :
               (nilai > 73) ? "B+" :
               (nilai > 65) ? "B" :
               (nilai > 60) ? "C+" :
               (nilai > 50) ? "C" :
               (nilai > 39) ? "D" : "E";
    }
    
    public static double konversiNilaiSetara(String nilaiHuruf) {
        return switch (nilaiHuruf) {
            case "A" -> 4.0;
            case "B+" -> 3.5;
            case "B" -> 3.0;
            case "C+" -> 2.5;
            case "C" -> 2.0;
            case "D" -> 1.0;
            default -> 0.0;
        };
        
    }
}
