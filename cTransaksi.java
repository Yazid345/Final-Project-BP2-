/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.FinalProjectBP2_1;

import com.mycompany.FinalProjectBP2_1.cPelanggan;
import com.mycompany.FinalProjectBP2_1.cMenu;

public class cTransaksi {
    //data
    private cMenu menu;
    private cPelanggan pelanggan ;
    int jumlah;
    //method
    cTransaksi(){
        System.out.println("Constructor default...");
    }
    cTransaksi(cMenu m, cPelanggan p, int jml){
        menu=m;
        pelanggan=p;
        jumlah=jml;
    }
    public void setProduk(cMenu m){ menu=m; }
    public void setPembeli(cPelanggan p){ pelanggan=p; }
    public void setJumlah(int jml){ jumlah=jml; }
    public void detailTransaksi(){
        System.out.println("Nama: "+pelanggan.getNama());
        System.out.println("Alamat: "+pelanggan.getAlamat());
        System.out.println("Nomor Telepon: "+pelanggan.getnomorTelepon());
        System.out.println("Menu: "+menu.getNama());
        System.out.println("Harga: "+menu.getHarga());
        System.out.println("Jumlah: "+jumlah);
        System.out.println("Total: Rp"+(menu.getHarga()*jumlah));
    }
}
