package oops;

public class copyConstructor {
  

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Shashank";
        s1.roll = 17;
        s1.password = "abcd";
        s1.marks[0] = 80;
        s1.marks[1] = 90;
        s1.marks[2] = 85;


        Student s2 = new Student(s1);
        s2.password = "xyz";
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];

//shallow copy constructor
// Student(Student s1){
//     this.name = s1.name;
//     this.roll = s1.roll;
//     marks = new int[3];
//     this.marks = s1.marks;
// }


// deep copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        marks = new int[3];
        for(int i=0;i<3;i++){
        this.marks[i] = s1.marks[i];
        }
    }
    public Student() {
        marks = new int[3];

    }
}