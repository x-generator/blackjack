package com.blackjack.model;

import static com.blackjack.model.card.CardRank.TEN;
import static com.blackjack.model.card.CardSuit.HEARTS;
import static com.blackjack.model.card.CardSuit.SPEADS;
import static org.junit.Assert.*;

import com.blackjack.model.card.Card;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Timur Berezhnoi
 */
public class HandTest {

    private Hand hand;

    @Before
    public void setUp() {
        hand = new Hand();
    }

    @Test
    public void shouldCurrentHandScore() {
        // Given
        int expected = 20;

        // When
        hand.addCard(new Card(TEN, SPEADS));
        hand.addCard(new Card(TEN, HEARTS));

        // Then
        assertEquals(expected, hand.getHandScore());
    }
}