package pl.imiajd.Truchan;

import java.lang.Cloneable;
import java.lang.Comparable;
import java.time.LocalDate;


public class Osoba implements Comparable<Osoba>,Cloneable
{

    public Osoba(String nazwisko,LocalDate dataUrodzenia)
    {
        this.nazwisko=nazwisko;
        this.dataUrodzenia=dataUrodzenia;
    }
    @Override
    public int compareTo(Osoba o) {
        int wynik=this.nazwisko.compareTo(o.nazwisko);
        if(wynik!=0)
        {
            return wynik;

        }
        if(wynik==0)
        {
            wynik=this.dataUrodzenia.compareTo(o.dataUrodzenia);
        }
        return wynik;

    }


    public boolean equals(Osoba o) {
        return this.nazwisko.equals(o.nazwisko)&& this.dataUrodzenia==o.dataUrodzenia;
    }

    private String nazwisko;
    private LocalDate dataUrodzenia;

    public LocalDate getDataUrodzenia() {
        return this.dataUrodzenia;
    }
    public String getNazwisko()
    {
        return this.nazwisko;
    }
    public String toString()
    {
        return String.format("%s, [ %s , %s ]\n",this.getClass().getName(),this.nazwisko,this.dataUrodzenia);
    }

    public static void main(String[] args) {

    }
}