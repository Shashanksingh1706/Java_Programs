public class ReverseNum {
    public static void main(String[] args) {
        int n = 17061;
            // while(n>0){
            //     int lastDigit = n%10;
            //     n=n/10;
            //     System.out.print(lastDigit+" ");
            // }
                int rev= 0;
        while(n>0){
            int lastDigit = n%10;
             rev = (rev*10)+lastDigit;
            n=n/10;
        }
        System.out.println(rev);
    }
    
}
