import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Rev {

    public static void primeNumbers() {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        boolean isPrime = true;
        if (input <= 1) {
            isPrime = false;

        } else {
            for (int i = 2; i <=Math.sqrt(input); i++) {
                if (input % i == 0) {
                    isPrime = false;
                    break;
                }


            }


            System.out.println(input + " is " +(isPrime?"prime":"notprime"));

        }



    }
    public static void average(){
        int []numbers={22,33,4,8,10,12};
        int sum = 0;
       for(int i =0; i<numbers.length; i++){
           sum+=numbers[i];

       }
        System.out.println("The average is "+sum/numbers.length);

    }
    public static void largestNumber(){
        int []numbers={22,33,4,8,10,12};
        for(int i= 0; i<numbers.length; i++){
            if (numbers[i] > numbers[i]) {
                
            }
        }
    }
    public static void removeDuplicates(int[]ar){

        Set<Integer> numbers= new HashSet<>();
        for(int num : ar){
            numbers.add(num);
      


        }
        System.out.println(numbers);





    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 3, 7, 1};

        removeDuplicates(arr);
        //primeNumbers();
        //average();
        largestNumber();

    }

}
