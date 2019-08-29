package com.blackjack.model;

import com.blackjack.model.card.Card;
import com.blackjack.model.card.CardRank;
import com.blackjack.model.card.CardSuit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class which represent classic "Frenca deck"
 *
 * @author Timur Berezhnoi
 * @see Deck
 */
public class FrenchDeck implements Deck {

    public static final byte CARDS_AMOUNT = 52;

    private List<Card> cards = init();

    /**
     * Constructor creates a shuffled deck of cards.
     */
    public FrenchDeck() {
        shuffle();
    }

    private List<Card> init() {
        ArrayList<Card> result = new ArrayList<>(CARDS_AMOUNT);
        int index = 0;
        for(int i = 0; i < CardSuit.values().length; i++) {
            for(int b = 0; b < CardRank.values().length; b++) {
                result.add(index, new Card(CardRank.values()[b], CardSuit.values()[i]));
                index++;
            }
        }
        return result;
    }

    @Override
    public void shuffle() {
        cards = init();
        Collections.shuffle(cards);
    }

    @Override
    public Card getNextCard() {
        System.out.println(cards.size());
        if(cards.isEmpty()) {
            shuffle();
        }
        return cards.remove(cards.size() - 1);
    }

    @Override
    public int getCardsLeft() {
        return cards.size();
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}