package Exercises;

import java.util.ArrayList;

public class CoreJavaBrushUp2 {
    public static void main(String[] args) {

        int [] array1 = {1,2,4,5,6,7,8,9,10,122};
                //2,4,6,8,10,122
        for(int i=0; i<array1.length; i++){
            if(array1[i] % 3 == 0){
                System.out.println(array1[i] + " is multiple of 3");
                break; // to stop the loop when it finds one multiple of 3
            }
           else{
                System.out.println( array1[i] + " isn't multiple of 3");
            }
        }
        ArrayList a = new ArrayList<>();
//        creates an object of the class - object.method
        a.add("a");
        a.add("b");
        a.add("c");
        a.add("d");
        System.out.println(a);
        a.remove(3);
        System.out.println(a);
        System.out.println(a.get(2));
    }
}
