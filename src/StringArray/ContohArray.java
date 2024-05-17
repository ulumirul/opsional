/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringArray;

import javax.swing.JOptionPane;

/**
 *
 * @author ~~ULUM~~
 */
public class ContohArray {
    public static void main(String[] args) {
        int counter = 0;
        int harga[] = new int [2];
        
        do {
            String input = JOptionPane.showInputDialog("masukkan harga ");
            harga[counter] = Integer.parseInt(input);
            counter++;
        } while (counter<harga.length);
        for (int i = 0; i < harga.length; i++) {
            System.out.println("Harga barang: "+harga[i]);
        }
    }
}
