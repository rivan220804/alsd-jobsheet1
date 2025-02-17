import java.util.Scanner;
public class Perulangan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String NIM = sc.nextLine();
        System.out.println("=================");
        System.out.print("Masukkan n: ");
        double n = sc.nextDouble();
        
        if (n < 10) n += 10;
        for (int i = 1; i <=n; i++) {
            if (i == 6 || i == 10) continue;
            if (i % 2 == 1) System.out.print("* ");
            else System.out.print(i + " ");
        }
        System.out.println();
    }
}

