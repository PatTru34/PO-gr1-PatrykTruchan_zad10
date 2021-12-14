import pl.imiajd.Truchan.Osoba;
import pl.imiajd.Truchan.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestStudent {

    public static void main(String[] args)
    {
        ArrayList<Student> grupa= new ArrayList<Student>();
        grupa.add(new Student("Wilga", LocalDate.of(1994,12,4),3.4));
        grupa.add(new Student("Trebusz", LocalDate.of(1994,12,4),5.0));
        grupa.add(new Student("Yeager", LocalDate.of(1990,5,5),4.2));
        grupa.add(new Student("Yeager", LocalDate.of(1986,2,12),3.5));
        grupa.add(new Student("Truchan", LocalDate.of(2000,6,16),4.1));

        System.out.print(grupa.toString());
        Collections.sort(grupa);
        System.out.print(grupa.toString());


    }
}