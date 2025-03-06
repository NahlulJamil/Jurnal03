public class Resep {
    private String namaResep;
    private String bahanUtama;
    private int waktuMemasak;
    
    public Resep(String namaResep, String bahanUtama, int waktuMemasak) {
        this.namaResep = namaResep;
        this.bahanUtama = bahanUtama;
        this.waktuMemasak = waktuMemasak;
    }
    public String getNama() {
        return namaResep;
    }
    public String getBahan() {
        return bahanUtama;
    }
    public Integer getWaktu() {
        return waktuMemasak;
    }
    @Override
    public String toString() {
        return "nama resep : " + this.namaResep + " bahan utama : " + this.bahanUtama + " waktu memasak : " + this.waktuMemasak;
    }
}