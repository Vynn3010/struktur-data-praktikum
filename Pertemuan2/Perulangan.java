package Pertemuan2;

public class Perulangan {

    // 3. Perulangan FOR, WHILE, DO WHILE
    public static void perulangan() {
        System.out.println("<<=== Looping FOR ===>>");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("<<=== Looping WHILE ===>>");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        System.out.println("<<=== Looping DO WHILE ===>>");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);

        System.out.println();
    }

    // Method utama
    public static void main(String[] args) {
        perulangan();
    }
}
