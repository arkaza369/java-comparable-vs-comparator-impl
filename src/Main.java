import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Arkaza Kumari", 2));
        students.add(new Student("Mony Singh", 1));
        students.add(new Student("AK Singh", 3));
        /*
        using Comparable o/p sorted by id:
        [Student{name='Mony Singh', rollNo=1}, Student{name='Arkaza Kumari', rollNo=2}, Student{name='AK Singh', rollNo=3}]
         */
        //Collections.sort(students);

        /*
        using Comparator o/p sorted by name:
        [Student{name='AK Singh', rollNo=3}, Student{name='Arkaza Kumari', rollNo=2}, Student{name='Mony Singh', rollNo=1}]         */
        Collections.sort(students, new NameComparator());
        System.out.println(students);

    }
}