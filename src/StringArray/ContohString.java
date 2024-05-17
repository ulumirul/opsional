/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringArray;

/**
 *
 * @author ~~ULUM~~
 */
public class ContohString {
    public static void main(String[] args) {
      String Buku_1 = "Java OOP";
      String Buku_2 = "KoalaKumal";
      String Buku_3 = "TesT";
      
      String pengarang_1 = ": Abdul Kadir";
      String pengarang_2 = ": Raditya Dika";
      
//      MENGETAHUI PANJANG STRING
      
        System.out.println(Buku_1.length());
//        menggabungkan string
        System.out.println(Buku_2.concat(pengarang_2));
//        memparshing memecah array dari array ke char
        for (int i = 0; i<Buku_1.length(); i++) {
            char temporary = Buku_1.charAt(i);
            System.out.print(temporary+" | ");
        }
        System.out.println();
//        indexOF untuk mencari
        String sub = "T";
        System.out.println(Buku_3.indexOf(sub));
        System.out.println(Buku_3.indexOf(sub, 1));
//        analisa 1
        String temp = pengarang_1.concat(pengarang_2);
        System.out.println("panjang"+temp.length());
//        analisa 2
        System.out.println(Buku_3.indexOf(sub, 4));
//        analisa 3
        String Buku_4 = "java oop";
        System.out.println(Buku_1.equals(Buku_4));
    }
}
