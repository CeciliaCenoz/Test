package Exercises;

public class MethodsDemo {
    public static void main(String[] args) {

    MethodsDemo d = new MethodsDemo();
//   d.getData(); //print that is at method getData
    String name = d.getData();
    System.out.println(name);

    MethodsDemo2 d1 = new MethodsDemo2();
    //d1.getUserData();
    System.out.println(d1.getUserData());

   //getData2();
        String text = getData2();
        System.out.println(text);
    }

//Methods should be written here
//    public void getData(){
//     // no return because it is void
//     //public: se puede usar en otras clases
//      System.out.println("Hello world");
//    }
    public String getData() {
      //return a string
        System.out.println("hello world en metododemo en get data");
        return "rahul shetty en metododemo";
    }

    public static String getData2() {
        System.out.println("hello world static en get data 2");
        return "rahul shetty static data 2";
    }
 }

