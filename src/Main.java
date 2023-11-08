import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //-----------FirstTothree--------------
        //System.out.println("Hello World");
//        int my_age = 24;
//        int her_age = my_age;
//        System.out.println(her_age);


        //-----------primitive types--------------
//        byte age = 8 ;
//        short temp = 28 ;
//        int stock = 3_485_236;
//        long phone = 913_816_2670L;
//        double score = 15.25;
//        float mathscore = 16.75f;
//        char character = '4';
//        boolean form = false;
//
//        System.out.println(phone);


        //-----------reference types--------------

//        Date now = new Date();
//        System.out.println(now);


        //-----------مقایسه primitive type ها و reference type ها--------------

//        int x = 1;
//        int y = x;
//        x = 2;
//        System.out.println("x = "+x);
//        System.out.println("y = "+y);


//        Point point1 = new Point(1,1) ;
//        Point point2 = point1;
//        point1.x=2;
//        point1.y=5;
//
//        System.out.println("point1 is "+point1);
//        System.out.println("point2 is "+point2);


        //-----------کلاس String--------------
//        String hello = new String("Hello world");
//        System.out.println(hello);
//
//        String hello2 = "Hello2 world";
//        boolean isStrWith = hello2.startsWith("H");
//        boolean isEndWith = hello2.startsWith("L");
//        boolean isIn = hello2.contains("e");
//        String Email = "";
//        System.out.println(isStrWith);
//        System.out.println(isEndWith);
//        System.out.println(isIn);
//        System.out.println(Email.isEmpty());
//        System.out.println(hello2.length());
//        System.out.println(hello2.indexOf("H"));
//        System.out.println(hello2.charAt(3));
//        System.out.println(hello2.toLowerCase());
//        System.out.println(hello2.toUpperCase());
//        System.out.println(hello2.substring(0,5));
//        System.out.println(hello2.replace('l','*'));


        //----------------- Array -----------------
//        int[] ages = {20,14,28};
//        Arrays.sort(ages);
//        System.out.println(Arrays.toString(ages));
//        System.out.println(ages.length);
//
//        int[][] people = {{150,24},{175,25},{190,32}};
//        System.out.println(Arrays.deepToString(people));
//
//        int[][][] people2 = {
//                {{1,2,3,4},{4,8,9,6}},
//                {{7,5,68,6},{4,456,52,}},
//                {{65,85,96,3},{121,3,4,8}}
//        };



        //--------------------- constants ----------------------
//        final float PI = 3.14f; //constant
//        int r = 4;
//        float S = PI * r * r ;
//        System.out.println(S);



        //--------------------- operatores ----------------------

//        int x = 15;
//        System.out.println(x + 5);
//        System.out.println(x - 5);
//        System.out.println(x * 5);
//        System.out.println(x / 5);
//        System.out.println(x % 5);


        //--------------------- Casting ----------------------
        // byte > short > int > long > float > double
//        short x = 2;
//        int sum = x+5 ;
//        System.out.println(sum);

//        double x = 2.1;
//        int sum = (int) x + 3 ;
//        System.out.println(sum);

//        String x = "1";
//        int sum = Integer.parseInt(x) + 3;
//        System.out.println(sum);



        //--------------------- MATH ----------------------

//        System.out.println(Math.round(1.8f));
//        System.out.println(Math.floor(1.8f));
//        System.out.println(Math.ceil(1.0001f));
//        System.out.println(Math.min(4,5));
//        System.out.println(Math.max(4,5));
//        System.out.println((int) (Math.random()*100));



        //--------------------- Scanner ----------------------
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please Enter Your Age : ");
//        byte Age = scanner.nextByte();
//        System.out.println("Your age is "+Age);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please Enter Your Name : ");
//        String name = scanner.nextLine().trim();
//        System.out.print("Please Enter Your Age : ");
//        int Age = scanner.nextInt();
//        System.out.println("Your Name is "+name);
//        System.out.println("Your Age is "+Age);



        //--------------------- Comparison Operators ----------------------

//        int x = 1;
//        int y = 2;
//
//        System.out.println(x==y); //boolean
//        System.out.println(x!=y); //boolean
//        System.out.println(x>=y); //boolean
//        System.out.println(x>y); //boolean
//        System.out.println(x<y); //boolean
//        System.out.println(x<=y); //boolean


        //--------------------- Logical  Operators ----------------------

        // AND : && & All of True
        //OR : || | NotAll of True
//        boolean license = true;
//        int age = 18;
//        boolean HasCar = false;
//
//        boolean canRegister = (license == true) && (age > 18) && (HasCar == false);
//        System.out.println(canRegister);

//        boolean married = true;
//        int age = 40;
//
//        boolean canGet = married || age>35 ;
//        System.out.println(canGet);


        //--------------------- IF ----------------------

//        Scanner input = new Scanner(System.in);
//        System.out.print("Please Enter Your Age : ");
//
//        int age = input.nextInt();
//        if (age<18){
//            System.out.println("You Are Under Age");
//        } else if (age<50) {
//            System.out.println("Wellcom");
//        } else {
//            System.out.println("You Are OverAge");
//        }



        //--------------------- SWITCH ----------------------

//        Scanner input = new Scanner(System.in);
//        System.out.print("PLEASE Enter Your position : ");
//        String userLevel = input.next();
//
//        switch (userLevel){
//            case "admin" :
//                System.out.println("You Are Admin");
//                break;
//            case "user" :
//                System.out.println("You Are User");
//                break;
//            default:
//                System.out.println("You Are Guest");
//        }


//        if (userLevel.equals("admin")){
//            System.out.println("You Are Admin");
//        } else if (userLevel.equals("user")) {
//            System.out.println("You Are User");
//        }else {
//            System.out.println("You Are Guest");
//        }



        //--------------------- For ----------------------
//        Scanner input = new Scanner(System.in);
//        System.out.print("Please Enter Number Of Repeat : ");
//        int x = input.nextInt();
//
//        for (int i = 0 ; i<x ; i++){
//            System.out.println("Hello World");
//        }



        //--------------------- WHILE ----------------------

//        String input = "";
//        Scanner scanner = new Scanner(System.in);
//        while (!input.equals("quit")) {
//            input = scanner.nextLine().toLowerCase();
//            System.out.println(input);
//        }


        //--------------------- FOREACH ----------------------

        String[] users = {"kasra","Ali","Reza"};
        for (String user : users) {
            System.out.println("user--"+user);
        }





    }
}