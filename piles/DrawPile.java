package piles;

import cards.Card;
import cards.NumberedCard;
import cards.Color;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;

public class DrawPile {
    ArrayList<Card> cards;

    public DrawPile(){
        cards = new ArrayList<>();
        initializeDrawPile();
        shuffleDrawPile();
    }

    public DrawPile(ArrayList<Card> initialCards) {
        cards = new ArrayList<>(initialCards);
        shuffleDrawPile();
    }

    private void initializeDrawPile(){
        for (Color color : Color.values()){
            // Use "continue" to lower the nesting level
            if (color == Color.WILD){
                continue;
            }
            for (int number : NumberedCard.ALLOWED_NUMBERS){
                cards.add(new NumberedCard(color, number));
            }
        }
    }

    private void shuffleDrawPile(){
        Collections.shuffle(cards);
    }

    public Card draw() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int lastIndex = getSize() - 1;
        return cards.remove(lastIndex);
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public int getSize() {
        return cards.size();
    }
}
