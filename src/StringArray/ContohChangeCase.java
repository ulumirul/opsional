/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StringArray;

/**
 *
 * @author ~~ULUM~~
 */
public class ContohChangeCase {
    public static void main(String[] args) {
        String a = "Hari ini kita makan soto Ayam ";
        String b = "minumnya cola";
        String c = "                                             dan es teh";
        
        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());
//        baypas concat pake +
        System.out.println(a+b+c.trim());
//        analisa 1
        System.out.println(b.replace("cola", "aqua"));
        System.out.println(c.trim());
    }
}
