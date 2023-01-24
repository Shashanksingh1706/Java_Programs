package strings;

public class stringCompare {
    public static void main(String[] args) {
        String s1 = "shashank";
        String s2 = "shashank";
        String s3 = new String("shashank");

        // if(s1==s3){
        //     System.out.println("strings are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }

        if(s1.equals(s3)){
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }

    }
}
