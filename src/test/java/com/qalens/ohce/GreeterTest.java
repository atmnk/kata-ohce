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
    public void shouldGreetGoodMorningBetween20To6(String name, int hour, String expected){
        Greeter greeter=new Greeter(hour);
        Assertions.assertEquals(expected,greeter.getGreetingFor(name));
    }
}
