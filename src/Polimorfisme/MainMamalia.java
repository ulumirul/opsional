/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme;

/**
 *
 * @author ~~ULUM~~
 */
public class MainMamalia {

    public static void main(String[] args) {
        show(new Mamalia());
        show(new Sapi());
        show(new Limosin());
        show(new Brahman());
        show(new Kelinci());
    }

    private static void show(Object obj) {
        System.out.println(obj);
    }
    
}
