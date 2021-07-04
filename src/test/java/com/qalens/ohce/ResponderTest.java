package com.qalens.ohce;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ResponderTest {
    @Test
    public void shouldResponseReverseOfString(){
        Responder responder=new Responder("hola");
        Assertions.assertEquals("aloh",responder.response());
    }
}
