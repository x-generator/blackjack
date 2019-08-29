package com.blackjack.client.util;

import org.junit.Test;

import static com.blackjack.util.BlackJackServerProperty.SERVER_IP;
import static com.blackjack.util.BlackJackServerProperty.SERVER_PORT;
import static org.junit.Assert.assertEquals;

/**
 * @author Timur Berezhnoi
 */
public class ClientPropertiesTest {

    @Test
    public void shouldCorrectPort() {
        String expected = "7765";
        assertEquals(expected, SERVER_PORT.getValue());
    }

    @Test
    public void shouldCorrectIP() {
        String expected = "127.0.0.1";
        assertEquals(expected, SERVER_IP.getValue());
    }
}