package util;

import java.util.Scanner;

public class ScannerDemo2 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in); // this code is pointing towards keyboard

        System.out.println("Enter number : ");
        String numString = sc.nextLine();
        int x = Integer.parseInt(numString);
        System.out.println(x);

        System.out.println("Enter String : ");
        String s = sc.nextLine();
        System.out.println(s);


        System.out.println("Enter float : ");
        String floatString = sc.nextLine();
        float f = Float.parseFloat(floatString);
        System.out.println(f);



    }

}
