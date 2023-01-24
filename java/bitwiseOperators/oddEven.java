public class oddEven {
   
    public static void getOddEven(int n){
        int bitMask = 1;
        if((n&bitMask)==0){
            System.out.println("Even number");
        }else{
            System.out.println("odd number");
        }
    }

    public static void main(String[] args) {
        // getOddEven(3);
        // getOddEven(5);
        // getOddEven(22);
    
    //get ith bit
    //    System.out.println(getIthBit(10, 1));   

    // set Ith Bit
        System.out.println(setIthBit(10, 2));
        // System.out.println(clearIthBit(0, 0));

    }
    public static int getIthBit(int n,int i){
        int bitmask = (1<<i);
        if((n&bitmask)==0){
            return 0;
        }else{
            return 1;
        }

    }

    public static int setIthBit(int n,int i){
        int bitMask = (1<<i);
        return n|bitMask;
    }
    public static int clearIthBit(int n,int i){
        int bitMask = (~(1<<i));
        return n&bitMask;
    }
}
