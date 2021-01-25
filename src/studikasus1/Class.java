package studikasus1;
import java.util.Scanner;
public class Class {
    Scanner io = new Scanner (System.in);
    String nama;
    double p, l, total;
    
    void pembuka () {
        System.out.println("--------Program Hitung Luas Lapangan--------");
    }
    void isi () {
        System.out.print("Masukkan nama lapangan         : ");
        nama = io.nextLine();
        System.out.print("Masukkan panjang lapangan (m)  : ");
        p = io.nextDouble();
        System.out.print("Masukkan lebar lapangan (m)    : ");
        l = io.nextDouble();
    }
    void hitung () {
        total = p * l;
    }
    void hasil () {
        System.out.println("---------------------------------------------");
        System.out.println("Nama lapangan                  : "+nama);
        System.out.println("Total luas lapangan            : "+total+" m²");
    }
}
