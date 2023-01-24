import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // for(int i = 1;i<=4;i++){
        //         System.out.println("* * * *");
        // }
            Scanner sc = new Scanner(System.in);
            
            // do{
            //     System.out.print("Enter your number:");
            //     int n = sc.nextInt();
            //     if(n%10==0){
            //         break;
            //     }
            //     System.out.println(n);
            // }while(true);

            do{
                System.out.print("Enter your number:");
                int n = sc.nextInt();
                if(n%10==0){
                    continue;
                }
                System.out.println(n);
            }while(true);
    }
}
