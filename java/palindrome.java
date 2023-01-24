public class palindrome {
    public static void main(String[] args) {
        isPalindrome(121);
    }
    public static void isPalindrome(int n){
        int pallindrome  = n;
        int reverse = 0;
        while(pallindrome!=0){
            int remainder = pallindrome%10;
            reverse = reverse *10 +remainder;
            pallindrome = pallindrome/10;
        }
        if(reverse==n){
            System.out.println(n + "  is a pallindrome number");
        }
        else{
            System.out.println(n + " is not a pallindrome number");
        }
        }
}
