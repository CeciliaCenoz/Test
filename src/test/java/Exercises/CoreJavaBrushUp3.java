package Exercises;

public class CoreJavaBrushUp3 {

    public static void main(String[] args) {

//string is an object //String literal
//        String s = "Rahul Shetty Academy";
//        String s1 = "Rahul Shetty Academy";
        String s5 = "hello";
//new
        String s2 = new String("Welcome");
        String s3 = new String("Welcome");

        String s = "Rahul Shetty Academy";
        String[] splittedString1 = s.split(" ");
        System.out.println(splittedString1[0]);
        System.out.println(splittedString1[1]);
        System.out.println(splittedString1[2]);

        String[] splittedString2 = s.split("Shetty");
        System.out.println(splittedString2[0]);
        System.out.println(splittedString2[1]);
        System.out.println(splittedString2[1].trim());

        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.println(s.charAt(i));
        }
    }
}


