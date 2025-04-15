package Pertemuan2;

public class Array {

    // 4. Array Satu Dimensi dan Dua Dimensi
    public static void arrayContoh() {
        System.out.println("<<=== Array 1 Dimensi ===>>");
        int[] angka = {1, 2, 3, 4, 5};
        for (int i = 0; i < angka.length; i++) {
            System.out.println("angka[" + i + "] = " + angka[i]);
        }

        System.out.println("\n<<=== Array 2 Dimensi ===>>");
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6}
        };
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    // Method utama
    public static void main(String[] args) {
        arrayContoh();
    }
}
