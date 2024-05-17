/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasString;

import javax.swing.JOptionPane;

/**
 *
 * @author ~~ULUM~~
 */
public class lagi {
  public static void main(String[] args) {
        // Masukkan nilai masing-masing ke array
        int[][] nilai = {
            {50, 60, 70},
            {70, 75, 87},
            {89, 90, 90}
        };

        // Lakukan perulangan untuk menghitung nilai akhir dan menampilkan hasil
        for (int i = 0; i < nilai.length; i++) {
            // Hitung nilai akhir
            double nilaiAkhir = (nilai[i][0] + nilai[i][1] + nilai[i][2]) / 3;
            
            // Di dalam perulangan, gunakan conditional if untuk pengecekan dan konversi nilai ke huruf
            char huruf;
            if (nilaiAkhir > 80) {
                huruf = 'A';
            } else if (nilaiAkhir > 70) {
                huruf = 'B';
            } else if (nilaiAkhir > 60) {
                huruf = 'C';
            } else if (nilaiAkhir > 50) {
                huruf = 'D';
            } else {
                huruf = 'E';
            }
            
            // Menampilkan hasil
            System.out.println("Mahasiswa " + (i+1) + ": Nilai Akhir = " + nilaiAkhir + ", Huruf = " + huruf);
        }
  }
}
