import pl.imiajd.Truchan.Osoba;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestOsoba {

    public static void main(String[] args)
    {
        ArrayList<Osoba> grupa= new ArrayList<Osoba>();
        grupa.add(new Osoba("Wilga", LocalDate.of(1994,12,4)));
        grupa.add(new Osoba("Trebusz", LocalDate.of(1994,12,4)));
        grupa.add(new Osoba("Yeager", LocalDate.of(1990,5,5)));
        grupa.add(new Osoba("Yeager", LocalDate.of(1986,2,12)));
        grupa.add(new Osoba("Truchan", LocalDate.of(2000,6,16)));

        System.out.print(grupa.toString());
        Collections.sort(grupa);
        System.out.print(grupa.toString());


    }
}