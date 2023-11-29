package piles;

import cards.Card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;

public class DiscardPile {
    private final ArrayList<Card> cards;

    public DiscardPile(Card initialTopCard) {
        cards = new ArrayList<>();
        cards.add(initialTopCard);
    }

    public Card getTopCard() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int lastIndex = getSize() - 1;
        return cards.get(lastIndex);
    }

    public boolean addCard(Card card) {
        if (getTopCard().matches(card)) {
            cards.add(card);
            return true;
        }
        return false;
    }

    public DrawPile shuffleAndTurnAround() {
        Collections.shuffle(cards);

        DrawPile newDrawPile = new DrawPile(cards);
        cards.clear();

        Card newTopCard = newDrawPile.draw();
        cards.add(newTopCard);

        return newDrawPile;
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public int getSize() {
        return cards.size();
    }
}
