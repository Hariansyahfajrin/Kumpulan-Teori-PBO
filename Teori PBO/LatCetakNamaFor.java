/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hariansyah271022;

import java.util.Scanner;
public class LatCetakNamaFor {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int i,n;
        String nama="Frentyusmelia";
        
        System.out.print("Masukkan Batas : ");
        n = in.nextInt();
        
        for(i=0; i<n ; i++){
            System.out.println(nama); 
        }
        
    } 
}

