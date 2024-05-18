/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KE7.Buku;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ~~ULUM~~
 */
public class TokoBuku {
 
    List<Tugas> listBuku;
    
    public static void main(String[] args) {
        TokoBuku tokoBuku = new TokoBuku();
        tokoBuku.tambah();
        tokoBuku.showBuku();
    }

    private void tambah() {
      
        listBuku = new ArrayList<>();
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Massukkan Judul: ");
            Scanner sc1 = new Scanner(System.in);
            String judul = sc1.nextLine();
            
            System.out.print("Massukkan Pengarang: ");
            Scanner sc2 = new Scanner(System.in);
            String pengarang = sc2.nextLine();
            
            System.out.print("Massukkan Penerbit: ");
            Scanner sc3 = new Scanner(System.in);
            String penerbit = sc3.nextLine();
            
            System.out.print("Massukkan Kategory: ");
            Scanner sc4 = new Scanner(System.in);
            String kategory = sc4.nextLine();
            
             System.out.print("Massukkan thun terbit: ");
            Scanner sc5 = new Scanner(System.in);
            int tahun_Terbit = sc5.nextInt();
            
            kategory = switch (kategory) {
                case "su" -> "semua umur";
                case "r" -> "remaja";
                case "d" -> "dewasa";
                case "a" -> "anak";
                default -> "data tidak di masukkan";
            };
            
//            masuukan data judul dan pengarang ke ArrayBuku
        listBuku.add(new Tugas(judul, pengarang,penerbit,kategory,tahun_Terbit));
            System.out.println("=====================\n");
        }
        
    }

    private void showBuku() {
      
        System.out.println("\n\n List DataBuku");
        
        for (int i = 0; i < listBuku.size(); i++) {
            System.out.println((i+1)+")"+listBuku.get(i).judul+" Dikarang Oleh "+listBuku.get(i).nama_pengarang+" Diterbitkan "+listBuku.get(i).penerbit+" kategory "+listBuku.get(i).kategori+" tahun terbit "+listBuku.get(i).tahun_Terbit);
        }
        
    }
    
}