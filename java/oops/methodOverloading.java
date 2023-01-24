package oops;

public class methodOverloading {
    public static void main(String[] args) {
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(10,15));
        // System.out.println(calc.sum((float)1.5, (float)2.5));
        // System.out.println(calc.sum(3,4,5));

        Deer d= new Deer();
        d.eat();
    }
}

class Calculator{
    int sum(int a ,int b){
        return a+b;
    }

    float sum(float a,float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}

