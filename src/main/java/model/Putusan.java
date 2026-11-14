package model;

import java.time.LocalDate;


public class Putusan {

    private String caseId;
    private String nomorPerkara;
    private String pengadilan;
    private LocalDate tanggalPutusan;
    private String terdakwaKode;
    private String jenisNarkotika;
    private double beratBarangBuktiGram;
    private String pasalDakwaan;
    private String pasalTerbukti;
    private int tuntutanBulan;
    private long vonisBulan;
    private long dendaRupiah;
    private String barangBukti;
    private String keadaanMemberatkan;
    private String keadaanMeringankan;
    private String sourcePages;

    public Putusan(
            String caseId,
            String nomorPerkara,
            String pengadilan,
            LocalDate tanggalPutusan,
            String terdakwaKode,
            String jenisNarkotika,
            double beratBarangBukti,
            String pasalDakwaan,
            String pasalterbukti,
            int tuntutanBulan,
            int vonisBulan,
            long dendaRupiah,
            String barangBukti,
            String keadaanMemberatkan,
            String keadaanMeringankan,
            String sourcePages
    ) {
        if (caseId == null || caseId.isBlank()) {
            throw new IllegalArgumentException("caseId wajib diisi");
        }
        if (nomorPerkara == null || nomorPerkara.isBlank()) {
            throw new IllegalArgumentException("Nomor perkara wajib diisi");
        }
        if (tanggalPutusan == null) {
            throw new IllegalArgumentException("Tanggal putusan wajib diisi");
        }
        if (beratBarangBuktiGram < 0 || tuntutanBulan < 0 || vonisBulan < 0 || dendaRupiah < 0) {
            throw new IllegalArgumentException("Nilai numerik tidak boleh negatif");
        }

        this.caseId = caseId.trim();
        this.nomorPerkara = nomorPerkara.trim();
        this.pengadilan = clean(pengadilan);
        this.tanggalPutusan = tanggalPutusan;
        this.terdakwaKode = clean(terdakwaKode);
        this.jenisNarkotika = clean(jenisNarkotika);
        this.beratBarangBuktiGram = beratBarangBuktiGram;
        this.pasalDakwaan = clean(pasalDakwaan);
        this.pasalTerbukti = clean(pasalTerbukti);
        this.tuntutanBulan = tuntutanBulan;
        this.vonisBulan = vonisBulan;
        this.dendaRupiah = dendaRupiah;
        this.barangBukti = clean(barangBukti);
        this.keadaanMemberatkan = clean(keadaanMemberatkan);
        this.keadaanMeringankan = clean(keadaanMeringankan);
        this.sourcePages = clean(sourcePages);
    }

    private static String clean(String value) {
        return value == null ? "" : value.trim();
    }

    public String getCaseId() {
        return caseId;
    }

    public String getNomorPerkara() {
        return nomorPerkara;
    }

    public String getPengadilan() {
        return pengadilan;
    }

    public LocalDate getTanggalPutusan() {
        return tanggalPutusan;
    }

    public String getTerdakwaKode() {
        return terdakwaKode;
    }

    public String getJenisNarkotika() {
        return jenisNarkotika;
    }

    public double getBeratBarangBuktiGram() {
        return beratBarangBuktiGram;
    }

    public String getPasalDakwaan() {
        return pasalDakwaan;
    }

    public String getPasalTerbukti() {
        return pasalTerbukti;
    }

    public int getTuntutanBulan() {
        return tuntutanBulan;
    }

    public long getVonisBulan() {
        return vonisBulan;
    }

    public long getDendaRupiah() {
        return dendaRupiah;
    }

    public String getBarangBukti() {
        return barangBukti;
    }

    public String getKeadaanMemberatkan() {
        return keadaanMemberatkan;
    }

    public String getKeadaanMeringankan() {
        return keadaanMeringankan;
    }

    public String getSourcePages() {
        return sourcePages;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public void setNomorPerkara(String nomorPerkara) {
        this.nomorPerkara = nomorPerkara;
    }

    public void setPengadilan(String pengadilan) {
        this.pengadilan = clean(pengadilan);
    }

    public void setTanggalPutusan(LocalDate tanggalPutusan) {
        this.tanggalPutusan = tanggalPutusan;
    }

    public void setTerdakwaKode(String terdakwaKode) {
        this.terdakwaKode = terdakwaKode;
    }

    public void setJenisNarkotika(String jenisNarkotika) {
        this.jenisNarkotika = clean(jenisNarkotika);
    }

    public void setBeratBarangBuktiGram(double beratBarangBuktiGram) {
        if (beratBarangBuktiGram < 0) {
            throw new IllegalArgumentException("Berat tidak boleh negatif");
        }
        this.beratBarangBuktiGram = beratBarangBuktiGram;
    }

    public void setPasalDakwaan(String pasalDakwaan) {
        this.pasalDakwaan = pasalDakwaan;
    }

    public void setPasalTerbukti(String pasalTerbukti) {
        this.pasalTerbukti = clean(pasalTerbukti);
    }

    public void setTuntutanBulan(int tuntutanBulan) {
        this.tuntutanBulan = tuntutanBulan;
    }

    public void setVonisBulan(long vonisBulan) {
        if (vonisBulan < 0) {
            throw new IllegalArgumentException("Vonis tidak boleh negatif");
        }
        this.vonisBulan = vonisBulan;
    }

    public void setDendaRupiah(long dendaRupiah) {
        if (dendaRupiah < 0) {
            throw new IllegalArgumentException("Denda tidak boleh negatif");
        }
        this.dendaRupiah = dendaRupiah;
    }

    public void setBarangBukti(String barangBukti) {
        this.barangBukti = barangBukti;
    }

    public void setKeadaanMemberatkan(String keadaanMemberatkan) {
        this.keadaanMemberatkan = keadaanMemberatkan;
    }

    public void setKeadaanMeringankan(String keadaanMeringankan) {
        this.keadaanMeringankan = keadaanMeringankan;
    }

    public void setSourcePages(String sourcePages) {
        this.sourcePages = sourcePages;
    }

    @Override
    public String toString() {
        return "Case ID: " + caseId +
                "\nNomor Perkara: " + nomorPerkara +
                "\nPengadilan: " + pengadilan +
                "\nTanggal Putusan: " + tanggalPutusan +
                "\nTerdakwa: " + terdakwaKode +
                "\nJenis Narkotika: " + jenisNarkotika +
                "\nBerat Barang Bukti: " + beratBarangBuktiGram + " gram" +
                "\nPasal Dakwaan: " + pasalDakwaan +
                "\nPasal Terbukti: " + pasalTerbukti +
                "\nTuntutan: " + tuntutanBulan + " bulan" +
                "\nVonis: " + vonisBulan + " bulan" +
                "\nDenda: Rp" + dendaRupiah +
                "\nBarang Bukti: " + barangBukti +
                "\nKeadaan Memberatkan: " + keadaanMemberatkan +
                "\nKeadaan Meringankan: " + keadaanMeringankan +
                "\nSource Pages: " + sourcePages;
    }
}

