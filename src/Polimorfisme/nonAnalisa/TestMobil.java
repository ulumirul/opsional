/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme.nonAnalisa;

/**
 *
 * @author ~~ULUM~~
 */
public class TestMobil {
    Mobil mobil1;
    
    public TestMobil(){
        mobil1 = new MobilBalap();
//        mobil 2 tidak copotaible dg mobil1
//        MobilBalap mobil2 = mobil1;
    MobilBalap mobil2 = (MobilBalap) mobil1;
    }
}
