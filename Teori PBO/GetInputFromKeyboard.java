

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hariansyah131022;
/**
 *
 * @author ACER
 */
import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException; 

public class GetInputFromKeyboard {
    public static void main( String[] args ){ 
 
        BufferedReader dataIn = new BufferedReader(new 
        InputStreamReader( System.in) ); 
        String name = "";
        int nilai = 0;
 
        System.out.print("Please Enter Your Name:"); 
 
        try{ 
            name = dataIn.readLine();
            System.out.print("Please Enter Your Score:"); 
            nilai = Integer.parseInt(dataIn.readLine()); 
             
            }catch( IOException e ){ 
            System.out.println("Error!"); 
            } 
            System.out.println("Hello " + name +"!");
            System.out.println("Angka " + nilai +"!");
    }
}
