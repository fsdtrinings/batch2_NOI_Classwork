package util;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in); // this code is pointing towards keyboard

        System.out.println("Enter String : ");
        String s = sc.nextLine();
        System.out.println(s);


        System.out.println("Enter number : ");
        int num = sc.nextInt();
        System.out.println(num);




        System.out.println("Enter float : ");
        float f1 = sc.nextFloat();
        System.out.println(f1);











    }
}
