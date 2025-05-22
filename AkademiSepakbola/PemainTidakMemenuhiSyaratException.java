package AkademiSepakbola;


/**
 * PemainTidakMemenuhiSyaratException.java
 * ---------------------------------------
 * Tujuan:
 * Class ini mendefinisikan sebuah custom exception yang spesifik untuk kasus di mana
 * seorang pemain tidak memenuhi syarat untuk akademi sepak bola.
 * Exception ini akan dilemparkan jika usia pemain di luar rentang yang diizinkan
 * atau jika pemain sedang mengalami cedera parah.
 *
 * Tipe Exception: Checked Exception (karena mewarisi dari Exception).
 */
public class PemainTidakMemenuhiSyaratException extends Exception {
    public PemainTidakMemenuhiSyaratException(String message) {
        super(message); // Meneruskan pesan error ke constructor kelas Exception
    }
}