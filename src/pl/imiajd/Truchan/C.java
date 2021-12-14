package pl.imiajd.Truchan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C {
    public static void main(String[] args) throws IOException {
        String str="";
        ArrayList<String> x= new ArrayList<String>();
        Scanner scan= new Scanner(System.in);
        String file = scan.next();
        FileReader read= null;


        BufferedReader y = new BufferedReader(read);
        while((str = y.readLine())!= null)
        {
            x.add(str);
        }
        System.out.print(x);
        Collections.sort(x);
        System.out.print(x);
    }
}