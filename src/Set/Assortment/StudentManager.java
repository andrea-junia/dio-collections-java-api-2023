package Set.Assortment;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentManager {

    private Set<Student> studenstsSet;
    private String msgError = "Students Set is empty.";

    public StudentManager() {
        this.studenstsSet = new HashSet<>();;
    }

    public void addStudent(String name, Long id, double average){
        studenstsSet.add(new Student(name, id, average));
    }

    public void removeStudent(long id){
        Student studenToRemove = null;
        if(!studenstsSet.isEmpty()){
            for(Student st : studenstsSet){
                if (st.getId() == id){
                    studenToRemove = st;
                    break;
                }
                studenstsSet.remove(studenToRemove);
            }
        } else {
            throw new RuntimeException(msgError);
        }

        if (studenToRemove == null) {
            System.out.println("ID not found!");
        }
    }
    
    public void printStudentByName(){
        Set<Student> studentByName = new TreeSet<>(studenstsSet);
        if (!studenstsSet.isEmpty()){
            System.out.println(studentByName);
        } else {
            throw new RuntimeException(msgError);
        }
    }
    
    public void printStudentByAverage(){
        Set<Student> studentByAverage = new TreeSet<>(studenstsSet);
        if (!studenstsSet.isEmpty()){
            studentByAverage.addAll(studenstsSet);
            System.out.println(studentByAverage);
        } else {
            throw new RuntimeException(msgError);
        }
    }

    public void printAllStudents(){
        if(!studenstsSet.isEmpty()){
            System.out.println(studenstsSet);
        } else {
            System.out.println(msgError);
        }        
    }

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        studentManager.addStudent("João", 123456L, 7.5);
        studentManager.addStudent("Maria", 123457L, 9.0);
        studentManager.addStudent("Carlos", 123458L, 5.0);
        studentManager.addStudent("Ana", 123459L, 6.8);

        System.out.println("Students Set");
        System.out.println(studentManager.studenstsSet);

        System.out.println("Removing Student");
        studentManager.removeStudent(000L);
        studentManager.removeStudent(123457L);
        System.out.println(studentManager.studenstsSet);

        System.out.println("printing by name");
        studentManager.printStudentByName();
        
        System.out.println("printing by average");
        studentManager.printStudentByAverage();
    }
    
}
