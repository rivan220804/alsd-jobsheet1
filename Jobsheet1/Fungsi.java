import java.util.Scanner;

public class Fungsi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[][] stokBunga = new int[4][4];
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        int[] hargaBunga = {75000, 50000, 60000, 10000};
        int[] stokPengurangan = {-1, -2, 0, -5};
        
        for (int i = 0; i < stokBunga.length; i++) {
            System.out.println("======================================");
            System.out.println("Stok Bunga pada Cabang RoyalGarden " + (i + 1));
            System.out.println("======================================");
            for (int j = 0; j < stokBunga[i].length; j++) {
                System.out.print("Masukkan stok bunga " + namaBunga[j] + ": ");
                stokBunga[i][j] = input.nextInt();
            }
        }
        
        while (true) {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Pendapatan setiap Cabang");
            System.out.println("2. Jumlah Stok pada Cabang RoyalGarden 4 setelah pengurangan");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu: ");
            int menu = input.nextInt();
            
            switch (menu) {
                case 1:
                    hitungPendapatan(stokBunga, hargaBunga);
                    break;
                case 2:
                    tampilkanStokCabang4(stokBunga, namaBunga, stokPengurangan);
                    break;
                case 3:
                    System.out.println("Keluar dari program.");
                    input.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
    
    static void hitungPendapatan(int[][] stokBunga, int[] hargaBunga) {
        System.out.println("\nPendapatan Setiap Cabang");
        for (int i = 0; i < stokBunga.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stokBunga[i].length; j++) {
                totalPendapatan += stokBunga[i][j] * hargaBunga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp." + totalPendapatan);
        }
    }
    
    static void tampilkanStokCabang4(int[][] stokBunga, String[] namaBunga, int[] stokPengurangan) {
        System.out.println("\n========================");
        System.out.println("Stok Bunga RoyalGarden 4 setelah pengurangan");
        System.out.println("========================");
        
        for (int i = 0; i < stokBunga[3].length; i++) {
            int stokAkhir = Math.max(stokBunga[3][i] + stokPengurangan[i], 0);
            System.out.println("Stok bunga " + namaBunga[i] + ": " + stokAkhir);
        }
    }
}
