package Players;

import cards.Card;
import piles.DrawPile;
import piles.DiscardPile;

import java.util.ArrayList;

public abstract class Player {
    private String name;
    ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Card> getHand() {
        return this.hand;
    }

    public void drawCardFrom(DrawPile pile) {
        Card drawnCard = pile.draw();
        this.hand.add(drawnCard);
    }

    public boolean hasPlayableHand(Card topCard) {
        for (Card card : hand) {
            if (card.matches(topCard)) {
                return true;
            }
        }
        return false;
    }

    public void receiveCard(Card c){
        this.hand.add(c);
    }

    public void displayHand(){
        System.out.print(name + "'s hand: ");
        for (int i = 0; i < hand.size(); i++) {
            Card card = hand.get(i);
            System.out.print(i + ":" + card + " | ");
        }
        System.out.println();
    }

    public abstract Card playCard(DiscardPile pile);

}
