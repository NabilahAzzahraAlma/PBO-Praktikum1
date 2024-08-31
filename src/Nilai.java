public class Nilai {
    String nim;
    String nama;
    double nilaiAbsen;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
//Class Nilai dengan atribut (nim, nama, nilaiAbsen, nilaiTugas, nilaiUTS, nilaiUAS) serta 2 method (Nilai() dan cetakNilai())

    public Nilai(String nim, String nama, double nilaiAbsen, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiAbsen = nilaiAbsen;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }
    //Method Nilai untuk menginisialisasi objek Nilai dari nilai yang diberikan.

    public void cetakNilai() {
        double nilaiAkhir = (nilaiAbsen * 0.1) + (nilaiTugas * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Absen [10%] : " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%] : " + nilaiTugas);
        System.out.println("Nilai UTS [30%] : " + nilaiUTS);
        System.out.println("Nilai UAS [40%] : " + nilaiUAS);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }
    //Method cetakNilai menghitung nilaiAkhir berdasarkan bobot dari masing-masing komponen nilai (absen, tugas, UTS, UAS) lalu mencetak semua nilai nya.
}