/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheriyance;

/**
 *
 * @author ~~ULUM~~
 */
public class ContohVMI {

    public static void main(String[] args) {
        HtungLuas htungLuas = new PersegiPanjang();
        System.out.println("Panjang = "+htungLuas.Panjang);
        System.out.println("Lebar = "+htungLuas.Lebar);
        htungLuas.luas();
    }
    
}
