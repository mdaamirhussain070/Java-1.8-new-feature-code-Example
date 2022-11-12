package methodrefrence;

public class ConstructorReference {
    public static void main(String[] args) {
        ConsRefInterface d=Student::new;
        d.getStudent("aamir");

    }
}
class Student{
    public Student(String name){
        System.out.println(name+"is successfully enrolled");
    }


}

interface ConsRefInterface{
    public Student getStudent(String name);
}
