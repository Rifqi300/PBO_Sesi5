/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import java.util.*;

public class Penjual_Tahu {
  public static void main(String[] args) {
    try {
      Scanner input = new Scanner(System.in);
      System.out.println("=======================Tugas PBO Sesi 5======================");
      System.out.println("=============================No 2============================");
      System.out.println("");
      System.out.print(" Masukkan Nominal Uang Anda : ");

      int Masukan_uang = input.nextInt();
      int Jumlah_tahu = 35;

      if (Masukan_uang < 2000) {
        System.out.println(" Maaf Harga Tahu 2000, Uang Anda Tidak Cukup");
      }

      Tampilan_rak(Masukan_uang);
    }

    catch (InputMismatchException e) {
      System.out.println(" Input Yang Dimasukkan Harus Berupa Angka");
    }

  }
  public static void Ukuran_rak(String[][] rak) {
    for (String[] baris_rak: rak) {
      for (int i = 0; i < baris_rak.length; i++) {
        if (i == 0) {
          System.out.print(baris_rak[i] + " ");
        }

        if (i == 1 || i == 2 || i == 4 || i == 5) {
          System.out.print(baris_rak[i]);
        } 

        if (i == 3) {
          System.out.print(" " + baris_rak[i] + " ");
        }

        if (i == 6) {
          System.out.print(" " + baris_rak[i]);
        }

      }

      System.out.println();
    }
  }

  public static void Tampilan_rak(int Masukan_uang) {
    final int Harga_awal_tahu = 70000;
    int Masukan_uang_lagi = (Masukan_uang % 2000);
    int Harga_tahu = Harga_awal_tahu - (Masukan_uang - Masukan_uang_lagi);
    int Jumlah_tahu_terjual = 0;
    String[][] hasil_rak = new String[5][7];

    for (int i = hasil_rak.length - 1; i >= 0; i--) {
      for (int j = hasil_rak[i].length - 1; j >= 0; j--) {
        if (Harga_tahu >= 2000 && Harga_tahu % 2000 == 0) {
          hasil_rak[i][j] = "#";
        } else {
          hasil_rak[i][j] = " ";
          Jumlah_tahu_terjual++;
        }
        Harga_tahu -= 2000;
      }
    }

    String transaksi = " Anda mendapat " + Jumlah_tahu_terjual + " tahu";

    if (Masukan_uang >= Harga_awal_tahu) {
      transaksi += ". uang kembalian " + (Masukan_uang - Harga_awal_tahu);
    }

    if (Masukan_uang % 2000 != 0) {
      transaksi += ". uang kembalian " + Masukan_uang_lagi;
    }


    System.out.println(transaksi);
    System.out.println("=============================================================");
    System.out.println(" Rak :");
    Ukuran_rak(hasil_rak);
    System.out.println("");
    System.out.println("====================Muhammad Rifqi Darmawan==================");
    System.out.println("=========================Reguler TI20A=======================");
    System.out.println("");
  }


}