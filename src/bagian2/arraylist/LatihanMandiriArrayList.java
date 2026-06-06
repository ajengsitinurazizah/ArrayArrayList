/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.arraylist;

import java.util.ArrayList;

/**
 *
 * @author weixi
 */
public class LatihanMandiriArrayList {

public static void main(String[] args) {
        ArrayList<String> daftar_belanja = new ArrayList<>();
        daftar_belanja.add("Telur");
        daftar_belanja.add("Ikan");
        daftar_belanja.add("Ayam");
        daftar_belanja.add("Daging");

        System.out.println("Isi list : " + daftar_belanja);
        daftar_belanja.remove("Ikan");
        System.out.println("Isi list : " + daftar_belanja);
        System.out.println();

        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(84);
        angka.add(74);
        angka.add(95);
        angka.add(86);
        angka.add(79);

        int max = angka.get(0);
        for (int i = 0; i < angka.size(); i++) {

            int angkaNow = angka.get(i);

            if (angkaNow > max) {

                max = angkaNow;
            }
        }
        System.out.println("Nilai max: " + max);
        System.out.println();
          
        ArrayList<String> name = new ArrayList<>();
        name.add("Ayu");
        name.add("Laila");
        name.add("Lily");
        name.add("Ajeng");
        name.add("Listi");
        name.add("Aldy");

        for (int i = 0; i < name.size(); i++) {

            String nameShow = name.get(i);
            if (nameShow.startsWith("A")) {
                System.out.println(nameShow);
            }
        }
    }
}
