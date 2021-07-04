package com.qalens.ohce;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GreeterTest {
    @ParameterizedTest
    @CsvSource({
            "Atmaram,20,¡Buenas noches Atmaram",
            "Naik,22,¡Buenas noches Naik",
            "Yogesh,5,¡Buenas noches Yogesh"})
    public void shouldGreetnochesBetween20To6(String name, int hour, String expected){
        Greeter greeter=new Greeter(hour);
        Assertions.assertEquals(expected,greeter.getGreetingFor(name));
    }

    @ParameterizedTest
    @CsvSource({
            "Atmaram,7,¡Buenos días Atmaram",
            "Naik,11,¡Buenos días Naik",
            "Yogesh,9,¡Buenos días Yogesh"})
    public void shouldGreetdíasBetween6To12(String name, int hour, String expected){
        Greeter greeter=new Greeter(hour);
        Assertions.assertEquals(expected,greeter.getGreetingFor(name));
    }
}
