/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program : Berisi program yang menghitung gaji karyawan 
 */
public class IF110118005Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Manager mgr = new Manager();
        
        System.out.println("===Program Perhitungan Gaji Karyawan===");
        System.out.print("Masukkan NIK: ");
        mgr.setNik(sc.nextLine());
        System.out.print("Masukkan Nama: ");
        mgr.setNama(sc.next());
        System.out.print("Masukkan Golongan(1/2/3): ");
        mgr.setGolongan(sc.nextInt());
        System.out.print("Masukkan Jabatan(Manager/Kabag): ");
        mgr.setJabatan(sc.next());
        System.out.print("Masukkan Jumlah Kehadiran: ");
        mgr.setKehadiran(sc.nextInt());
        
        System.out.println("\n===Hasil Perhitungan===");
        System.out.println("NIK: " +mgr.getNik());
        System.out.println("Nama: " +mgr.getNama());
        System.out.println("Golongan: " +mgr.getGolongan());
        System.out.println("Jabatan: " +mgr.getJabatan() + "\n");
        
        System.out.println("Tunjangan Golongan: " +mgr.tunjanganGolongan(mgr.getGolongan()));
        System.out.println("Tunjagan Jabatan: " +mgr.tunjanganJabatan(mgr.getJabatan()));
        System.out.println("Tunjangan Kehadiran: " +mgr.tunjanganKehadiran(mgr.getKehadiran()) +"\n");
        System.out.println("GAJI TOTAL: " +mgr.gajiTotal());
        
        
                
                
        
    }
    
}
