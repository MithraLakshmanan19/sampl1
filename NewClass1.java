
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class NewClass1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        
        System.out.println("enter a value");
        int a=input.nextInt();
        System.out.println("a value is"+a);
        System.out.println("enter b value");
        int b=input.nextInt();
        System.out.println("b value is "+b);
        int c=a+b;
        System.out.println(c);
        
    }
}
