package strings;

public class subString {

    public static String getSubString(String str,int si, int ei){
        String subStr = "";
        for(int i=si;i<ei;i++){
            subStr+= str.charAt(i);
        }
        return subStr;
    }
    
    public static void main(String[] args) {
        String str = "shashank singh";
        System.out.println(str.substring(0,8));
        System.out.println(getSubString(str, 0, 8));
    }
}
