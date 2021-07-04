package com.qalens.ohce;

import java.util.Calendar;
import java.util.Scanner;

public class Ohce {
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        Greeter greeter = new Greeter(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(greeter.getGreetingFor(args[0]));
        String line = "";
        Scanner scanner = new Scanner(System.in);
        while (!line.equals("Stop!")){
            line = scanner.nextLine();
        }
        System.out.println("Adios "+args[0]);
    }
}
