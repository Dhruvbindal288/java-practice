public class Oops {
    public static void main(String[] args) {
        Student s1=new Student("Dhruv Bindal",11219109);
    s1.password="abcdef";
    Student s2= new Student(s1);
    s2.password="xyys";
    }
}

class Student{
    String name;
    int roll_no;
    String password;
    // CONSTRUCTOR FUNCTION

    //copy constructor
    Student(Student s1){
        this.name=s1.name;
        this.roll_no=s1.roll_no;
    }
    Student(String name,int roll_no){
        this.roll_no=roll_no;
        this.name=name;
        System.out.println("Constructor function is called.");
    }
}
