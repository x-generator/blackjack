package com.blackjack.model;

import com.blackjack.model.card.Card;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Timur Berezhnoi
 */
public class Hand implements Serializable {

	private static final long serialVersionUID = 1L;

	private int score;
	private List<Card> cards;

	public Hand() {
		cards = new ArrayList<>(4);
	}

	public void addCard(Card card) {
		score += card.getCardRank().getScore();
		cards.add(card);
	}

	public int getHandScore() {
		return score;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void dropHand() {
		score = 0;
		cards.clear();
	}

	@Override
	public String toString() {
		return cards.toString();
	}
}