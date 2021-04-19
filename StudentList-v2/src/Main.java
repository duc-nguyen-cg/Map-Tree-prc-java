import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",20, "HN");
        Student student2 = new Student("Hung",21, "HN");
        Student student3 = new Student("Ha",22, "HN");

        //hashMap allows two similar values, but the keys must be different
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student1);

        for (Map.Entry<Integer, Student> student: studentMap.entrySet()){
            System.out.println(student);
        }

        //hashSet does not allow two similar elements
        System.out.println("...........Set");
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student1);

        for (Student student: studentSet){
            System.out.println(student);
        }
    }
}
