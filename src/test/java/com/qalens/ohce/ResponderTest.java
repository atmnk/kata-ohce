package com.qalens.ohce;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ResponderTest {
    @Test
    public void shouldResponseReverseOfString(){
        Responder responder=new Responder("hola");
        Assertions.assertEquals("aloh",responder.response());
    }
    @Test
    public void shouldResponseReverseAndMEssageForPalindromeOfString(){
        Responder responder=new Responder("oto");
        Assertions.assertEquals("oto\n¡Bonita palabra!",responder.response());
    }
}
