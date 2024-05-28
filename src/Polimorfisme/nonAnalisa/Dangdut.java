/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfisme.nonAnalisa;

import Polimorfisme.nonAnalisa.Penyanyi;

/**
 *
 * @author ~~ULUM~~
 */
public class Dangdut extends Penyanyi{
    
    String nama = "Via Vale";

    @Override
    protected void genre(String genre) {
        System.out.println("genre-nya dangdut");
    }

    @Override
    public String nama(String nama) {
        return this.nama = nama;
    }
    
    
    
}
