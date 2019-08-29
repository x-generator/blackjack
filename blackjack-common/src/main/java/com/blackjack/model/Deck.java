package com.blackjack.model;

import com.blackjack.model.card.Card;

/**
 * @author Timur Berezhnoi
 */
public interface Deck {
    void shuffle();
    Card getNextCard();
    int getCardsLeft();
}