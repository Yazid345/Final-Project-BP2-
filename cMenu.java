/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.FinalProjectBP2_1;
public class cMenu {
    //data
    private String nama, kode;
    private int harga;
    //method
    cMenu(){
        System.out.println("Constructor default..");
    }
    cMenu(String n, int h){
        nama=n; harga=h;
    }
    public void setHarga(int h){ harga=h; }
    public String getNama(){ return nama; }
    public int getHarga(){ return harga; }
    public String ToString(){
    return nama+" Harga: Rp"+harga;
    }
}
