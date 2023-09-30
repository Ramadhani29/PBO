import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tipe data dan variabelnya
        int num;
        int i = 1;

        // Membuat objek Scanner untuk masukan dari pengguna
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan bilangan bulat positif: ");
        num = input.nextInt();

        // Inisialisasi faktorial
        int factorial = 1;

        // if
        if (num >= 0) {
            // for
            for (int j = 1; j <= num; j++) {
                factorial *= j;
            }

            // Output hasil faktorial
            System.out.println("Faktorial dari " + num + " adalah " + factorial);
        } else {
            System.out.println("Masukkan bilangan bulat positif.");
        }

        // Contoh penggunaan array satu dimensi
        int[] arrSatuDimensi = {1, 2, 3, 4, 5};
        System.out.println("Contoh array satu dimensi: ");
        for (int k = 0; k < 5; k++) {
            System.out.print(arrSatuDimensi[k] + " ");
        }
        System.out.println();

        // Contoh penggunaan array multidimensi
        int[][] arrMultiDimensi = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Contoh array multidimensi:");
        for (int l = 0; l < 2; l++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arrMultiDimensi[l][j] + " ");
            }
            System.out.println();
        }

        // Contoh perulangan while
        System.out.println("Perulangan While:");
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // Contoh perulangan do-while
        i = 1;
        System.out.println("Perulangan Do-While:");
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);
        System.out.println();

        // Menutup objek Scanner
        input.close();
    }
}
