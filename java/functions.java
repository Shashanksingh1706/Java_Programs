public class functions {

        //product
        // public static int multiply(int a, int b){
        //     int product = a*b;
        //     return product ;
        // }
        
        public static int factorial(int a){
            int fact = 1;
            for(int i = 1;i<=a;i++){
                fact*=i;
            }
            return fact;
        }
        public static int binocoeff(int n, int r){
            int fact_n = factorial(n);
            int fact_r = factorial(r);
            int fact_nmr = factorial(n-r);
            int fact_b = (fact_n)/(fact_r*fact_nmr);
            return fact_b;
        }
 
 
        public static void main(String[] args) {
        // int prod = multiply(4,5);
        // System.out.println(prod);

        //FACTORIAL
        // int fact = factorial(4);
        // System.out.println(fact);
            
        //binomial coefficiant 
            int bfact = binocoeff(5,2);
            System.out.println("binomial coefficiant :"+ bfact);
    }
    
}