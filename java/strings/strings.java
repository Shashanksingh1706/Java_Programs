package strings;

import java.util.Scanner;

public class strings {

    // charAt method 
    public static void str(String s){
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String  name = sc.nextLine();
        // System.out.println(name);

        //String length 
        // String fullName =   "Shashank Singh";
        // System.out.println(fullName.length());

        // concatinate
        String firstName = "Shashank";
        String lastName = "Singh";
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);

        //charAt method 
        str(fullName);

    }
}
