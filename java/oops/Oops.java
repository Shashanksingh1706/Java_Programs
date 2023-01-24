package oops;

public class Oops {
    
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setcolor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "ShashankSingh";
        // myAcc.setPassword("abcd1234");
    }

}
 class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
     void setcolor(String newColor){
       this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
    int getTip(){
        return this.tip;
    }

}

// class BankAccount{
//     public String username;
//      private String password;
//     public void setPassword(String pwd){
//         password = pwd ;
//     }
// }

// class Student{
//     String name;
//     int age;
//     float percentage;
    
//     void calcPercentage(int phy,int chem, int maths){
//         percentage = (phy+chem+maths)/3;
//     }

// }
