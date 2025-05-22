package AkademiSepakbola;


/**
 * Class ini merepresentasikan seorang pemain sepak bola dengan atribut nama, usia,
 * dan status cedera. Terdapat metode untuk mengevaluasi kelayakan pemain.
 *
 * Penggunaan Exception Handling:
 * - Metode `evaluasiKelayakan()` menggunakan `throw` untuk melemparkan
 * `PemainTidakMemenuhiSyaratException` jika pemain tidak memenuhi syarat.
 * - Metode `evaluasiKelayakan()` juga menggunakan `throws` pada signature-nya
 * untuk mendeklarasikan bahwa ia dapat melemparkan `PainTidakMemenuhiSyaratException`.
 */
public class Pemain {
    private String nama;
    private int usia;
    private boolean sedangCederaParah;

    private static final int USIA_MINIMAL = 15;
    private static final int USIA_MAKSIMAL = 20;

    public Pemain(String nama, int usia, boolean sedangCederaParah) {
        this.nama = nama;
        this.usia = usia;
        this.sedangCederaParah = sedangCederaParah;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public boolean isSedangCederaParah() {
        return sedangCederaParah;
    }

    /**
     * Mengevaluasi kelayakan pemain untuk akademi.
     * Melemparkan PemainTidakMemenuhiSyaratException jika tidak layak.
     *
     * @throws PemainTidakMemenuhiSyaratException jika pemain tidak memenuhi syarat usia atau sedang cedera.
     */
    public void evaluasiKelayakan() throws PemainTidakMemenuhiSyaratException {
        System.out.println("Mengevaluasi kelayakan untuk pemain: " + this.nama);

        if (this.usia < USIA_MINIMAL) {
            // Menggunakan 'throw' untuk melemparkan custom exception
            throw new PemainTidakMemenuhiSyaratException(
                this.nama + " tidak memenuhi syarat: Usia (" + this.usia + ") di bawah minimal (" + USIA_MINIMAL + " tahun)."
            );
        }

        if (this.usia > USIA_MAKSIMAL) {
            // Menggunakan 'throw' untuk melemparkan custom exception
            throw new PemainTidakMemenuhiSyaratException(
                this.nama + " tidak memenuhi syarat: Usia (" + this.usia + ") di atas maksimal (" + USIA_MAKSIMAL + " tahun)."
            );
        }

        if (this.sedangCederaParah) {
            // Menggunakan 'throw' untuk melemparkan custom exception
            throw new PemainTidakMemenuhiSyaratException(
                this.nama + " tidak memenuhi syarat: Sedang mengalami cedera parah."
            );
        }

        System.out.println(this.nama + " (" + this.usia + " tahun) memenuhi syarat untuk akademi!");
    }
}