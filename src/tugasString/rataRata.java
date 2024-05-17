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
public class rataRata {
    
    public static void main(String[] args) {

        int Ani[][] = new int[3][3];
        double data=0;
        String[] nama ={"Ani", "Tono", "Budi"};
        
//        masukkan nilai untuk Ani
for (int i = 0; i < 3; i++) {
    System.out.print(nama[i]+" ");
    for (int j = 0; j < 3; j++) {
               String input = JOptionPane.showInputDialog("masukkan nilai "+nama[i]);
              Ani[i][j] = Integer.parseInt(input);
              System.out.print(Ani[i][j]+" ");
    }
    System.out.println();
}
        System.out.println("rata-rata");
for (int i = 0; i < 3; i++) {
    
            data = (Ani[i][0]+Ani[i][1]+Ani[i][2])/3;
            
                 char huruf;
            if (data > 80) {
                huruf = 'A';
            } else if (data > 70) {
                huruf = 'B';
            } else if (data > 60) {
                huruf = 'C';
            } else if (data > 50) {
                huruf = 'D';
            } else {
                huruf = 'E';
            } 
            System.out.println(nama[i]+" "+data+" "+huruf);
           
        }

        
    }       
 }

