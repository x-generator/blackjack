package com.blackjack.model.card;

/**
 * This class contains card ranks.
 * Each of the rank represent a score of a card.
 *
 * @author Timur Berezhnoi
 */
public enum CardRank {

    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10),
    ACE(11);

    private final int score;

    CardRank(final int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}