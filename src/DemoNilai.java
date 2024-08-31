public class DemoNilai {
    public static void main(String[] args) {
        Nilai nilai = new Nilai("1234567", "Soo Yeon", 80, 85, 75, 90);
        nilai.cetakNilai();
    }
}
//Class DemoNilai berisi main() method awal masuk program. Membuat objek Nilai dengan data tertentu dan memanggil method cetakNilai() untuk menampilkan nilai nya.

//run:
//NIM : 1234567
//Nama : Soo Yeon
//Nilai Absen [10%] : 80.0
//Nilai Tugas [20%] : 85.0
//Nilai UTS [30%] : 75.0
//Nilai UAS [40%] : 90.0
//Nilai Akhir : 83.5
//BUILD SUCCESSFUL (total time: 1 second)