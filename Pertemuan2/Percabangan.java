package Pertemuan2;

public class Percabangan {

    // 2. Percabangan IF ELSE dan SWITCH CASE
    public static void percabangan() {
        int nilai = 58;
        System.out.println("<<=== Percabangan ===>>");

        // IF ELSE
        if (nilai >= 100) {
            System.out.println("Nilai A");
        } else if (nilai >= 80) {
            System.out.println("Nilai B");
        } else if (nilai >= 70) {
            System.out.println("Nilai C");
        } else if (nilai >= 60) {
            System.out.println("Nilai D");
        } else if (nilai >= 50) {
            System.out.println("Nilai E");
        } else {
            System.out.println("Nilai E atau di bawahnya");
        }

        // SWITCH CASE
        int hari = 6;
        switch (hari) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
                System.out.println("Hari tidak dikenal");
        }

        System.out.println();
    }

    // Method utama
    public static void main(String[] args) {
        percabangan();
    }
}
