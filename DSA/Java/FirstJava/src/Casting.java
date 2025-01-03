import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc=new Scanner(System.in);
        //Type casting
        //A) Automated type conversion(Implicit casting)
        //1) Type should be compatible
        //2) Destination type should be greater than a source type like float-> Int

        float num=sc.nextFloat();
        System.out.println(num);






           //B) force type conversion (Narrowing conversion)(Explicit casting)

      int num2=(int)(66.67f);
        System.out.println(num2);

        // Automatic type promotion in expressions
//        int a=257;
//        byte b=(byte)(a);//257 % 256=1



//        byte a=40;
//        byte b=50;
//        byte c=100;
//        int d=(a*b)/c;
//        System.out.println(d);


        //Rules for casting
        //1) All the byte, short, and character are converted into integer
        //2) Any one of the data type is long in a expression then whole thing is converted to long
        //3) Any one of the data type is float in a expression then whole thing is converted to float
        System.out.println(3* 5.634567654f);//16.903704


        byte b=42;
        char c='a';
        short s=1024;
        int i=50000;
        float f=5.67f;
        double d=0.1234;
        double result=(f*b) *(i/c)-(d-s);
        System.out.println((f*b) +" "+(i/c)+ " "+(d-s));
        //float +int -double=double
        System.out.println(result);



        //loop
        //when is know how many times loop will going to run then use for loop use for loop
        //when is don't know how many times loop will going to run then use for loop use while loop

    }
}
