public class Demo2
{
    public static void main(String[] args) {

        String s1 = "0123456789";

        String s2 = s1.substring(5,8);
        System.out.println(s2);

        String name = "Ramesh";
        name = name.concat(" Kumar");
        System.out.println(name);


        String str = "Hello how are you";
         String arr[] = str.split(" ");

         for(String word:arr)
         {
             System.out.println(word);
         }


    }
}
