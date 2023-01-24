public class pattern {

    public static void hollow_rectangle(int rows, int cols){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if(i==1 ||i==rows || j==1 || j==cols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


        // inverted and rotated half pyramid
        // public static void invPyramid(int rows){
        //     for(int i =1;i<=rows ;i++){
        //         for(int j=1;j<=rows-i;j++){
        //         System.out.print(" ");    
        //         }
        //         for(int j=1;j<=i;j++){
        //             System.out.print("*");
        //         }
        //         System.out.println();
        //     }
        // }

         //inverted half pyramid with numbers 

         public static void invertedHalfPyramidWithNumbers(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
       
    // floyds triangle 
       static int counter =1;
    public static void floydsTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter);
                counter++;

            }
            System.out.println();
        }
    }


    //0-1 triangle
    public static void binary_triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    //Butterfly pattern

    public static void butterfly(int n){
        for(int i=1;i<=n;i++){

            // STARS i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // space " "
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            //STARS "*"
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        } 
        for(int i =n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // Solid Rhombus

    public static void solid_Rhombus(int n){
        for(int i=1;i<=n;i++){
                        for(int j=1;j<=n-i;j++){
                System.out.print(" ");
}
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Hollow Rhombus
    public static void Hollow_Rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=n;j++){ 
                if(i==1||i==n ||j==1||j==n){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

        //Diamond pattern 

    public static void Diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=((2*i)-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=((2*i)-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 

    public static void main(String[] args) {
        
        // hollow_rectangle(4, 5);
        
        // invPyramid(4);
        
        // invertedHalfPyramidWithNumbers(5);
        
        // floydsTriangle(4);

        // binary_triangle(4);

        // butterfly(4);

        // solid_Rhombus(5);

        // Hollow_Rhombus(5);

        Diamond(4);
    }
}
