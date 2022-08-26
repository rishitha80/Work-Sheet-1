/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classexercise;

/**
 *
 * @author S550507
 */
public class ClassExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a= 2;
        int b= 7;
        int c= 12;
        System.out.println(a * c); // result is 24
        System.out.println(a * c + b); // result is 31
        System.out.println(a * -c); // result is -24
        System.out.println(a * --c + b++); // result is (2 * 11 + 7)=29 c is now 11 and b is now 8
        // now a=2 b=8 c=11
        System.out.println(a + c * b); // result is 90
        System.out.println(b % a); // result is 0
        System.out.println(a % b); // result is 2
        System.out.println(c / a); //result is 5
        
        System.out.println("The values are a=" + a + "\tb=" + b + "\tc=" + c);
        
        
        double d = 17;
        System.out.println(d / a); // result is (17 / 2)= 8.5
        System.out.println((double) d / a); // result is (17 / 2)= 8.5
        System.out.println(a * b); // result is (2*8) = 16
        System.out.println((double) a * b); // result is 16.0
        System.out.println(c / a); //result is 5
        
        
       
    }
    
}
