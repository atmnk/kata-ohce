package com.qalens.ohce;

public class Responder {
    String line;

    public Responder(String line) {
        this.line = line;
    }
    public String response(){
        return new StringBuilder(line).reverse().toString();
    }
}
