import Model.Mahasiswa;

import java.util.Scanner;

public class InputDataMahasiswa {
    public static void main(String[] args) {

        Mahasiswa Putri = new Mahasiswa("21090111",
                "Putri Willa Andini",
                "Tegal", "Teknik Informatika",
                "1C", 3.55);

        Putri.PrintDataSiswa();

        Mahasiswa Rakhma = new Mahasiswa("21090011",
                "Rakhmadhani Nurul Aini",
                "Brebes", "Teknik Informatika",
                "1C", 3.75);

        Rakhma.PrintDataSiswa();

        Mahasiswa[] dataAllInput = new Mahasiswa[100];
        for (int index=0;index< dataAllInput.length;index++){

        }

    }
}