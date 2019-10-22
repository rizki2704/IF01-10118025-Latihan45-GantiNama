/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan45.gantinama;

import java.util.Scanner;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class IF0110118025Latihan45GantiNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Printer print = new Printer();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("===Aplikasi Pencetak Nama===");
        System.out.print("Masukkan Nama Anda : ");
        print.setNama(scan.nextLine());
        System.out.print("Mau cetak nama berapa kali : ");
        print.setJmlCetak(scan.nextInt());
        print.cetak(print.getNama());
        System.out.println("\nHasil Cetak :");
        print.cetak(print.getJmlCetak(), print.getNama());
    }
    
}
