package com.qalens.ohce;

public class Responder {
    String line;

    public Responder(String line) {
        this.line = line;
    }
    public String response(){
        String reverse = new StringBuilder(line).reverse().toString();
        String message=reverse;
        if(line.equals(reverse)){
            message = message+"\n¡Bonita palabra!";
        }
        return message;
    }
}
