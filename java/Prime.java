import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime =true;
        if(n==2){
            System.out.println("it is prime .");
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    isPrime = false;
                }  
            }

          if(isPrime==true){
            System.out.println("it is prime number.");
          }
          else{
            System.out.println("not a prime.");
          }
        }
       
        
    }
    
}
