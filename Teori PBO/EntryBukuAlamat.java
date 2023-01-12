/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hariansyah151222;

import hariansyah151222.BukuAlamat;

/**
 *
 * @author ACER
 */
public class EntryBukuAlamat {
    public static void main(String[] args) {
        BukuAlamat BukuAlamat1 = new BukuAlamat();
        
        BukuAlamat1.setNama("hariansyah");
        BukuAlamat1.setAlamat("indarung");
        BukuAlamat1.setTelepon("0821716");
        BukuAlamat1.setEmail("hariansyah0@gmail.com");
        
        BukuAlamat1.print();
    }
}
