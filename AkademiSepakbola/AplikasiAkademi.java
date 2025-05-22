package AkademiSepakbola;

/**
 * AplikasiAkademi.java
 * --------------------
 * Tujuan:
 * Class utama (main class) untuk menjalankan simulasi pendaftaran pemain ke akademi
 * dan mendemonstrasikan penanganan exception.
 *
 * Penggunaan Exception Handling:
 * - Menggunakan blok `try-catch` untuk menangani `PemainTidakMemenuhiSyaratException`
 * yang mungkin dilemparkan oleh metode `evaluasiKelayakan()` dari objek `Pemain`.
 */
public class AplikasiAkademi {

    public static void main(String[] args) {
        System.out.println("===== Selamat Datang di Sistem Pendaftaran Akademi Sepak Bola =====");

        // Daftar calon pemain untuk dievaluasi
        Pemain pemain1 = new Pemain("Budi Santoso", 18, false); // Memenuhi syarat
        Pemain pemain2 = new Pemain("Evan Dimas", 14, false);  // Usia di bawah minimal
        Pemain pemain3 = new Pemain("Egy Maulana", 21, false); // Usia di atas maksimal
        Pemain pemain4 = new Pemain("Zlatan Ibrahimovic Muda", 19, true); // Cedera parah
        Pemain pemain5 = new Pemain("Cristiano Ronaldo Junior", 16, false); // Memenuhi syarat

        Pemain[] calonPemain = {pemain1, pemain2, pemain3, pemain4, pemain5};

        for (Pemain pemain : calonPemain) {
            try {
                // Blok 'try': Mencoba menjalankan kode yang berpotensi menimbulkan exception
                pemain.evaluasiKelayakan();
                System.out.println("-> Status untuk " + pemain.getNama() + ": DITERIMA\n");
            } catch (PemainTidakMemenuhiSyaratException e) {
                // Blok 'catch': Menangkap dan menangani exception yang spesifik
                System.err.println("-> Gagal mendaftarkan " + pemain.getNama() + ". Alasan: " + e.getMessage());
                System.err.println("-> Status untuk " + pemain.getNama() + ": DITOLAK\n");
            } finally {
                // Blok 'finally' (opsional): selalu dieksekusi setelah try atau catch,
                // baik ada exception maupun tidak.
                // Bisa digunakan untuk membersihkan resource, tapi dalam contoh ini tidak kritikal.
                // System.out.println("Proses evaluasi untuk " + pemain.getNama() + " selesai.\n");
            }
        }

        System.out.println("===== Proses Pendaftaran Selesai =====");
    }
}