package arrays;

import java.util.Scanner;

public class ArraysIteration {

    public static void main(String[] args) {

        int arr[] = {7,8,9,16,20,30,78,98,11,76,67,34,86};

        System.out.println("Enter the number to Search : - ");
        int searchitem = new Scanner(System.in).nextInt();


        int iterationNumber = 0;
        for(int i = 0, y = arr.length-1;true;i++,y--)
        {
            iterationNumber++;
            if(arr[i] == searchitem || arr[y] == searchitem)
            {
                System.out.println("Item found : Position : "+i+" Iteration Number : "+iterationNumber);
                break;
            }
            if(i == y) break;
        }



    }


}//end class
