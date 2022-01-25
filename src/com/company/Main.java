package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
	Scanner input  = new Scanner(System.in);
        System.out.println("please enter your name");
 //   String user = input.nextLine();
     String [] cars = {"hello"};
        System.out.println(cars[0]);
        ArrayList brands = new ArrayList();
        brands.add("ferrari");
        brands.add("alpha");
        brands.sort(Comparator.naturalOrder());
        System.out.println(brands);

    }
}
