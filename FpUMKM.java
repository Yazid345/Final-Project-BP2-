/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.FinalProjectBP2_1;
import java.util.Scanner;
public class FpUMKM {
    public static void main(String[] args) {
        cMenu m = new cMenu("Ramen",15000);
        cPelanggan p = new cPelanggan("Monkey D Luffy", "Rungkut", "085263759398");
        cTransaksi tr = new cTransaksi(m, p, 2);
        Scanner sc = new Scanner(System.in);
        int pilih=0;
        do{
            System.out.println("\nMENU");
            System.out.println("1. Makanan");
            System.out.println("2. Pelanggan");
            System.out.println("3. Transaksi");
            System.out.println("4. Exit");
            System.out.print("Pilih = ");
            pilih=sc.nextInt();
            switch(pilih){
                case 1:
                    System.out.println("[Makanan]");
                    System.out.println("  1.Tambah");
                    System.out.println("  2.Ubah");
                    System.out.println("  3.Hapus");
                    System.out.println("  4.Detail");
                    System.out.print("  Pilih = ");
                    int pilih2=sc.nextInt();
                    switch(pilih2){
                        case 1:
                            sc = new Scanner(System.in);
                            System.out.print("  Nama: ");
                            String nm=sc.nextLine();
                            System.out.print("  Harga: ");
                            int hg=sc.nextInt();
                            m = new cMenu(nm,hg);
                            break;
                        case 2:
                            System.out.print("  Ubah harga: ");
                            hg=sc.nextInt();
                            System.out.println("  Yakin Ubah?");
                            System.out.println("  1. Ya");
                            System.out.println("  2. Batal");
                            System.out.print("  Jawab = ");
                            int jwb=sc.nextInt();
                            if(jwb==1){
                                m.setHarga(hg);
                                System.out.println("  Harga berhasil diubah..");
                            }else{
                                System.out.println("  Harga batal diubah..");
                            }
                            break;
                        case 3:
                            System.out.print("  Nama: ");
                            nm=sc.next();
                            if(nm.equalsIgnoreCase(m.getNama())){
                                System.out.println("  Yakin Hapus?");
                                System.out.println("  1. Ya");
                                System.out.println("  2. Tidak");
                                System.out.print("  Jawab = ");
                                jwb=sc.nextInt();
                                if(jwb==1){
                                    m=null;
                                    System.out.println("  Hapus sukses..");
                                }else{
                                    System.out.println("  Batal hapus!");
                                }
                            }else{
                                System.out.println("  Produk tidak ada..");
                            }
                            break;
                        case 4:
                            if(m!=null){
                                System.out.println(p.ToString());
                            }else{
                                System.out.println("  Objek kosong");
                            }
                            break;
                    }
                    break;
                case 2:
                    System.out.println("[Pelanggan]");
                    System.out.println("  1.Nama ");
                    System.out.println("  2.Alamat");
                    System.out.println("  3.Nomor Telepon");
                    System.out.println("  4.Detail");
                    System.out.print("  Pilih: ");
                    int pilih3=sc.nextInt();
                    switch(pilih3){
                        case 1:
                            sc=new Scanner(System.in);
                            System.out.print("  Nama: ");
                            String nm = sc.nextLine();
                            p.setNama(nm);
                            break;
                        case 2:
                            sc=new Scanner(System.in);
                            System.out.print("  Alamat: ");
                            String alm=sc.nextLine();
                            p.setAlamat(alm);
                            break;
                        case 3:
                            sc=new Scanner(System.in);
                            System.out.print("  Nomor Telepon: ");
                            String nt = sc.nextLine();
                            p.setnomorTelepon(nt);
                            break;
                        case 4:
                            System.out.print(p.ToString());
                            break;
                    }
                    break;
                case 3:
                    System.out.println("  [Transaksi]");
                    System.out.println("  1.Buat Pesanan");
                    System.out.println("  2.Detail Pesanan");
                    System.out.print("  Pilih: ");
                    int pilih4=sc.nextInt();
                    switch(pilih4){
                        case 1:
                            sc=new Scanner(System.in);
                            System.out.println("  Produk yang tersedia: ");
                            System.out.println(" > "+m.ToString());
                            System.out.print("  Pilih: ");
                            String psn=sc.nextLine();
                            if(psn.equalsIgnoreCase(m.getNama())){
                                System.out.print("  Jumlah: ");
                                int jml=sc.nextInt();
                                tr.setJumlah(jml);
                            }else{
                                System.out.println("  Produk tidak tersedia");
                            }
                            break;
                        case 2:
                             tr.detailTransaksi();
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Terima Kasih..");
            }
        }while(pilih!=4);    
    }
}
