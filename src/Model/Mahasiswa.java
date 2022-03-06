package Model;

public class Mahasiswa {
    private String NIM;
    private String NamaLengkap;
    private String Alamat;
    private String Jurusan;
    private String Kelas;
    private double NilaiIPK;

    public Mahasiswa(String mNIM, String mNama,
                     String mAlamat, String mJurusan,
                     String mKelas, double mNilai){

        this.NIM = mNIM;
        this.NamaLengkap = mNama;
        this.Alamat = mAlamat;
        this.Jurusan = mJurusan;
        this.Kelas = mKelas;
        this.NilaiIPK = mNilai;
    }

    public void PrintDataSiswa(){
        System.out.println("NIM    : "+ this.NIM+"\n"+
                "Nama Lengkap      : "+ this.NamaLengkap+"\n"+
                "Alamat            : "+ this.Alamat+"\n"+
                "Jurusan           : "+ this.Jurusan+"\n"+
                "Kelas             : "+ this.Kelas+"\n"+
                "Nilai IPK         : "+ this.NilaiIPK);
    }
}
