/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.FinalProjectBP2_1;
public class cPelanggan {
    //data
    private String nama;
    private String alamat;
    private String nomorTelepon ;
    //method
    cPelanggan(){
        System.out.println("Cosntructor default...");
    }
    cPelanggan(String n,String a,String nT){
        nama= n;alamat= a;nomorTelepon= nT;
    }
    public void setNama(String n){ nama=n; }
    public void setAlamat(String a){ alamat= a; } 
    public void setnomorTelepon(String nT){ nomorTelepon= nT;}
    public String getNama(){ return nama; }
    public String getAlamat(){ return alamat; }
    public String getnomorTelepon(){ return nomorTelepon; }
    public String ToString(){
    return "Nama:"+nama+"  Alamat:"+alamat+"  Nomor Telepon:"+nomorTelepon;
    }    
}
