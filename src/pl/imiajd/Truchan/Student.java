package pl.imiajd.Truchan;

import java.time.LocalDate;

public class Student extends Osoba implements Comparable<Osoba>,Cloneable {
    private double sredniaOcen;
    public Student(String nazwisko, LocalDate dataUrodzenia,double sredniaOcen)
    {
        super(nazwisko,dataUrodzenia);
        this.sredniaOcen=sredniaOcen;

    }

    public double getSredniaOcen()
    {
        return this.sredniaOcen;
    }

    @Override
    public int compareTo(Osoba o) {
        return super.compareTo(o);
    }

}