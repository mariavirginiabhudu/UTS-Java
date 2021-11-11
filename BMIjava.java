package bmijava;

import java.util.Scanner;

public class BMIjava {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int berat;
        double tinggi;
        double bmi;
        System.out.println("masukan berat : ");
        berat = input.nextInt();
        System.out.println("masukan tinggi");
        tinggi = input.nextDouble();
        tinggi/=100;
        bmi=berat/(tinggi*tinggi);
        System.out.println("BMI Anda Adalah "+bmi);
        
        if (bmi<20.9) {
            System.out.println("berat badan anda kurang");
            
    }
        else if (bmi<25.9){
            System.out.println("berat badan anda ideal");
    } 
        else if (bmi<28.9){
            System.out.println("berat anda lebih");
    }
        else {
            System.out.println("OBESITAS");
        }
    }
    
}
