/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme.nonAnalisa;

/**
 *
 * @author ~~ULUM~~
 */
public class Penyanyi {
    
    String nama = "penyanyi";
    
    public Penyanyi(){
        System.out.println("nama penyanyinya null");
    }
    
    public Penyanyi(String nama){
        System.out.println("nama penyanyinya: "+nama);
    }
    
    public String nama(String nama){
        return this.nama = nama;
    }
    
    protected void genre(String genre){
        System.out.println("genrenya umum");
    }
}
