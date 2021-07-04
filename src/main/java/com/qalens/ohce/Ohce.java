package com.qalens.ohce;

import java.util.Calendar;
import java.util.Scanner;

public class Ohce {
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        run(calendar,args[0]);
    }
    public static void run(Calendar calendar,String name){
        Greeter greeter = new Greeter(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(greeter.getGreetingFor(name));
        String line = "";
        Scanner scanner = new Scanner(System.in);
        while (true){
            line = scanner.nextLine();
            if(!line.equals("Stop!")){
                Responder responder=new Responder(line);
                System.out.println(responder.response());
            } else {
                break;
            }
        }
        System.out.println("Adios "+name);
    }
}
