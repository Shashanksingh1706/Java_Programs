package oops;

// import arrays.sorting.selectionSort;

public class constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("shashank");
        System.out.println(s2.name);
        Student s3 = new Student(123);
        System.out.println(s3.roll);
    }
}
class Student{
    String name;
    int roll;
    
    //Unparameterised constructor
    Student(){ 
        // this.name = name;
        System.out.println("Constructor is called..");
    }

    //Parameterised constructor
     Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }

}