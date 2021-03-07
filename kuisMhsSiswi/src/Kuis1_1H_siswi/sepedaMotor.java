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
public class sepedaMotor {
    Scanner sc = new Scanner(System.in);
    public String merk;
    public boolean kontakMotor= true;
    public int kecepatanMotor;
    private String merkMotor;
    
   
  
    public void nyalakanMotor(boolean tr){
        kontakMotor = tr;
        kecepatanMotor = 0;
    }
    public void matikanMotor (boolean tf){
        kontakMotor = tf;
        kecepatanMotor = 0;
    }
    public int tambahKecepatanMotor(int kec){
        if (kec == 100){
            System.out.println("Mencapai Kecepatan Maksimum");
        } else if( kec == 0){
            System.out.println("Mencapai Kecepatan Minimum");
        } else {
            kec = kec + 5;
        }
        return kec;
    }
    public int kurangiKecepatanMotor(int kec){
        if (kec == 100){
            System.out.println("Mencapai Kecepatan Maksimum");
        } else if( kec == 0){
            System.out.println("Mencapai Kecepatan Minimum");
        } else {
            kec = kec - 5;
        }
        return kec;
    }
    void info(){
        if (kontakMotor== true) {
            System.out.println("SEPEDA MOTOR TELAH HIDUP");
        } else {
            System.out.println("SEPEDA MOTOR TELAH MATI");
        }
        System.out.println("KECEPATAN: " +kecepatanMotor);
    }
}
