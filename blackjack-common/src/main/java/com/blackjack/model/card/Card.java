package com.blackjack.model.card;

import java.io.Serializable;

/**
 * Immutable gaming card.
 *
 * @author Timur Berezhnoi
 */
public final class Card implements Serializable {

    private static final long serialVersionUID = 1L;

    private final CardRank cardRank;
    private final CardSuit cardSuit;

    public Card(final CardRank cardRank, final CardSuit cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }

    public CardRank getCardRank() {
        return cardRank;
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }

    /**
     * Return card score and cardSuit in String representation.
     *
     * @return String representation of Card.
     */
    @Override
    public String toString() {
        return cardRank.getScore() + " " + cardSuit;
    }
}