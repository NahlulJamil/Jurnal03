import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SinglyLinkedList daftarResep = new SinglyLinkedList();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Resep Baru di Awal");
            System.out.println("2. Tambah Resep Baru di Akhir");
            System.out.println("3. Hapus Resep dari Awal");
            System.out.println("4. Hapus Resep dari Akhir");
            System.out.println("5. Cetak Semua Resep");
            System.out.println("6. Cari Resep Berdasarkan Nama");
            System.out.println("7. Keluar");
            System.out.print("Pilih operasi (1-7): ");
            pilihan = s.nextInt();
            s.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Resep: ");
                    String namaAwal = s.nextLine();
                    System.out.print("Masukkan Bahan Utama: ");
                    String bahanAwal = s.nextLine();
                    System.out.print("Masukkan Waktu Memasak (menit): ");
                    int waktuAwal = s.nextInt();
                    daftarResep.insertAtFront(new Resep(namaAwal, bahanAwal, waktuAwal));
                    break;
                case 2:
                    System.out.print("Masukkan Nama Resep: ");
                    String namaAkhir = s.nextLine();
                    System.out.print("Masukkan Bahan Utama: ");
                    String bahanAkhir = s.nextLine();
                    System.out.print("Masukkan Waktu Memasak (menit): ");
                    int waktuAkhir = s.nextInt();
                    daftarResep.insertAtBack(new Resep(namaAkhir, bahanAkhir, waktuAkhir));
                    break;
                case 3:
                    daftarResep.removeFromFront();
                    break;
                case 4:
                    daftarResep.removeFromBack();
                    break;
                case 5:
                    daftarResep.print();
                    break;
                case 6:
                    System.out.print("Masukkan Nama Resep yang dicari: ");
                    String namaCari = s.nextLine();
                    daftarResep.cariResep(namaCari);
                    break;
                case 7:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 7);

        s.close();
    }
}