public class sumOfDigits {
    public static void sumOfdig(int n){
        int digits = n;
        int sum = 0;
        while(digits!=0){
        int rem = digits%10;
        sum = sum+rem;
        digits  = digits/10;    
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sumOfdig(12);
    }
}
