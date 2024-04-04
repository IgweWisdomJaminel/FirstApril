import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TIo1 {

    public static void testOne(String name){
        System.out.println(name);
        List<String>list= Arrays.asList(name,"wisdom","fola");
        for(String s : list){
            System.out.println(s);
        }
    }
    public static int takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input your digits for a sum");
        int num1 = sc.nextInt();
        int num2= sc.nextInt();
        int sum =Math.addExact(num1,num2);
        sc.close();
        return sum;

    }
    public static void evenNumbers(){
        int sum=0;
        for(int i= 0; i<10; i++){
            if(i%2!=0){
                sum+=i;

                System.out.println(i);

            }

        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        evenNumbers();
//        System.out.println("Happy new year");
//        testOne("wisdom");
       // System.out.println(takeInput());
//        TIo1 t1 = new TIo1();
//        Class c1= t1.getClass();
//        System.out.println(c1.getName());
//
//        Method method[] = c1.getDeclaredMethods();
//        for(Method m :method){
//            System.out.println(m.getName());
//        }
//        Field field []= c1.getFields();
//        for(Field f : field){
//            System.out.println(f.getName());
//        }
    }
}
