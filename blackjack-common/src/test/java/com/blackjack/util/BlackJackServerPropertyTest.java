package com.blackjack.util;

import static com.blackjack.util.BlackJackServerProperty.SERVER_IP;
import static com.blackjack.util.BlackJackServerProperty.SERVER_NAME;
import static com.blackjack.util.BlackJackServerProperty.SERVER_PORT;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Timur Berezhnoi
 */
public class BlackJackServerPropertyTest {

    @Test
    public void shouldCorrectPort() {
        String expected = "7765";
        assertEquals(expected, SERVER_PORT.getValue());
    }

    @Test
    public void shouldCorrectIP() {
        String IP = "127.0.0.1";
        assertEquals(IP, SERVER_IP.getValue());
    }

    @Test
    public void shouldCorrectName() {
        String expected = "Blackjack server";
        assertEquals(expected, SERVER_NAME.getValue());
    }
}