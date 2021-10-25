/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
import java.util.Arrays;

public class Petani_Buah {
  public static void main(String[] args) {
    String[] Buah_rak_acak = {
      "Apel",
      "Pisang",
      "Jambu",
      "Anggur",
      "Pepaya",
      "Duku",
      "Durian",
      "Jeruk",
      "Mangga",
      "Manggis",
    };

    int box_tujuan = 0;
    int tempat_buah = 0;
    int ukuran_box = Buah_rak_acak.length;

    String[] Susun_box_buah = Urutan_buah(Buah_rak_acak);
    String[][] Susunan_box_buah = new String[5][2];
    String pointer = Susun_box_buah[0];

    for (int i = 0; i < Susun_box_buah.length; i++) {

      if (pointer.charAt(0) != Susun_box_buah[i].charAt(0)) {
        pointer = Susun_box_buah[i];
        tempat_buah++;
        box_tujuan = 0;
      }

      if (pointer.charAt(0) == Susun_box_buah[i].charAt(0)) {
        Susunan_box_buah[tempat_buah][box_tujuan] = Susun_box_buah[i];
        box_tujuan += 1;
      } 
    }
    System.out.println("===================================Tugas PBO Sesi 5==================================");
    System.out.println("=========================================No 1========================================");
    System.out.println("");
    System.out.println(Arrays.deepToString(Susunan_box_buah));
    System.out.println("");
    System.out.println("================================Muhammad Rifqi Darmawan==============================");
    System.out.println("=====================================Reguler TI20A===================================");
    System.out.println("");
  }

  public static String[] Urutan_buah(String[] buah) {
    for (int i = 0; i < buah.length; i++) {
      String mantep = buah[i];
      int posisi = i;

      while( posisi >= 1 && buah[posisi - 1].charAt(0) > mantep.charAt(0) ) {
        buah[posisi] = buah[posisi - 1];
        posisi--;
      }
      buah[posisi] = mantep;
    }
    return buah;
  }
}