
package javacli;

import java.util.Scanner;
public class JAVACLI {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int berat;
    double tinggi;
    double bmi;
    System.out.println("Masukkan Berat");
    berat = input.nextInt();
    System.out.println("Masukkan Tinggi");
    tinggi = input.nextDouble();
    tinggi/=100;
    bmi=berat/(tinggi*tinggi);
    System.out.println("BMI Anda Adalah" +bmi);
    
        if (bmi<20.5) {
        System.out.println("berat badan anda kurang");
    }
        else if (bmi<25.7) {
        System.out.println("berat badan anda ideal");
        }
        else if (bmi<28.9) {
        System.out.println("berat badan anda lebih ");
        }
        else {
        System.out.println("obesitas");
        }
    }
}
    
