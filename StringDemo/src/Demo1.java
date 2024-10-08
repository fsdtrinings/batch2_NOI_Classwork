


public class Demo1 {

    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "hello";
        String s3 = "Hello";

        String str1 = new String("java");

        String str2 = new String("Java");

        if(str1 == str2)
        {
            System.out.println("both are same");

        }
        else System.out.println("both are not same "+str1+" & "+str2);

        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println("both are same "+str1+" & "+str2);
        }
        else System.out.println("both are not same "+str1+" & "+str2);

    }//end main

}//end class
