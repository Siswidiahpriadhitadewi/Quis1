/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis1_1H_siswi;

/**
 *
 * @author LENOVO IDP 110
 */
import java.util.Scanner;
public class main {
    Scanner sc= new Scanner(System.in);
     public static void main(String[] args) {
      sepedaMotor[] merkArr = new sepedaMotor[4];
      System.out.println("SEPEDA MOTOR");
        merkArr[0] = new sepedaMotor();
        merkArr[0].merk = "Honda";
        merkArr[1] = new sepedaMotor();
        merkArr[1].merk = "Yamaha";
        merkArr[2] = new sepedaMotor();
        merkArr[2].merk = "Ducati";
        merkArr[3] = new sepedaMotor();
        merkArr[3].merk = "Suzuki";
        
         for (int i = 0; i < merkArr.length; i++) {
             merkArr[i].kontakMotor=false;
         }
         System.out.println("");
     }
}
