package strings;

public class pallindrome {
    public static boolean isPallindrome(String str){
        for(int i=0;i<str.length()/2;i++){
           int n = str.length(); 
            if(str.charAt(i)!= str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";

        
        System.out.println(isPallindrome(str));
    }
}
