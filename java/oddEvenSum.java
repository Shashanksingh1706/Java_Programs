import java.util.Scanner;

import javax.annotation.processing.ProcessingEnvironment;

public class oddEvenSum {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        int choice;
        do{
            System.out.println("enter the number:");
            n = sc.nextInt();
            if(n%2==0){
                evenSum = evenSum + n;
            }
            else{
                oddSum = oddSum + n;
            }
            System.out.println("do you wish to continue press 1 for yes and 0 for no");
            choice=sc.nextInt();
       
        }while(choice==1);
        System.out.println("sum of even numbers  = "+ evenSum);
        System.out.println("sum of odd numbers ="+ oddSum);
    }
    
}
