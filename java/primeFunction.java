import java.util.Scanner;

public class primeFunction {

    // public static boolean isPrime(int n){
    
    //     if(n==2){
    //         return true;
    //     }

    //     for(int i =2; i<=n-1; i++){
    //         if( n % i == 0){
    //             return false;
    //         }
    //     }    
    //  return true;
    // }

    //optimised approach
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }

        for(int i =2; i<=Math.sqrt(n); i++){
            if( n % i == 0){
                return false;
            }
        }    
     return true;
    }

    //PRIMES IN RANGE
    public static void primeInRange(int n){
       for(int i =2;i<=n;i++){
        if(isPrime(i)==true){
            System.out.println(i);
        }

        }
     }
    



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(isPrime(n));
        primeInRange(n);
    }
    
}
