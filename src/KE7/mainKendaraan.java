/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KE7;

/**
 *
 * @author ~~ULUM~~
 */
public class mainKendaraan extends NewClass{

    @Override
    public void setMesin(String mesin) {
        System.out.println("Besar mesin : "+mesin);
    }

    @Override
    public String getMesin() {
        return super.getMesin(); 
    }
    
    
    
    public static void main(String[] args) {
//    instansiasi objec

    mainKendaraan kendaraan = new mainKendaraan();
//        kendaraan.jalankan();
    kendaraan.setMesin("150 cc");
        System.out.println(kendaraan.getMesin());
    }
    
}
