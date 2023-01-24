public class binToDec {

        public static void binaryToDec(int binNum){
            int pow = 0;
            int dec = 0;
            while(binNum>0){
               int lastDigit = binNum %  10;
               dec = dec +   (lastDigit * (int)Math.pow(2, pow));
               pow ++;

               binNum = binNum/10;
            }
            System.out.println(dec);
        }
        public static void decimalToBin(int n){
            int pow = 0;
            int binNum = 0;
            while(n>0){
              int rem = n%2;
              binNum = binNum + ( rem * (int)Math.pow(10,pow));
              
              pow++;
              n = n/2;

            }
            System.out.println(binNum);
        }

    public static void main(String[] args) {
        // binaryToDec(101);
        decimalToBin(6);
    }
}
