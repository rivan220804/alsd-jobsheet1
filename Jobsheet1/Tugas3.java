import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = input.nextInt();
        input.nextLine();
        
        String[] namaMK = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMK[i] = input.nextLine();
            System.out.print("SKS: ");
            sks[i] = input.nextInt();
            System.out.print("Semester: ");
            semester[i] = input.nextInt();
            input.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = input.nextLine();
        }
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = input.nextInt();
            input.nextLine(); 
            
            switch (pilihan) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                    }
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah: ");
                    String cariHari = input.nextLine();
                    for (int i = 0; i < n; i++) {
                        if (hariKuliah[i].equalsIgnoreCase(cariHari)) {
                            System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Masukkan semester: ");
                    int cariSemester = input.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (semester[i] == cariSemester) {
                            System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String cariMK = input.nextLine();
                    boolean ditemukan = false;
                    for (int i = 0; i < n; i++) {
                        if (namaMK[i].equalsIgnoreCase(cariMK)) {
                            System.out.println(namaMK[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Mata kuliah tidak ditemukan.");
                    }
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    input.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

