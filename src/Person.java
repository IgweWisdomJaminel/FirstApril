import java.util.Scanner;

public class Person {


    Scanner sc = new Scanner(System.in);
    int age;





    public Person(int age) {
        age= sc.nextInt();

        if(age<0){
            this.age =0;
            System.out.println("Age is not valid, setting age to 0.. ");
        }else {
            this.age = age;
        }
    }

    public void yearPasses(){
        age++;
    }
    public void amIOld(){
        if(age <13){
            System.out.println("You are young..");

        } else if  (age >13&& age <18){
            System.out.println("print You are a teenager..");
        }else {
            System.out.println("You are old..");
        }

    }


    public static void main(String[] args) {
        Person person = new Person(2);

    }
}
