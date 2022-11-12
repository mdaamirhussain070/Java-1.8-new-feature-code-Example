package streamAPImethods;

import functionalinterface.Student;
import functionalinterface.StudentDataBase;

public class SreamMapReduceExample {

    public static int getNumberofNoteBooks(){

        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNoOfNoteBook)

            //    .reduce(0,(a,b)->a+b);
                .reduce(0,Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(getNumberofNoteBooks());
    }
}
