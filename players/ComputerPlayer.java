package players;

import cards.Card;
import piles.DiscardPile;

public class ComputerPlayer extends Player {
    public ComputerPlayer(String name) {
        super(name);
    }

    @Override
    public Card playCard(DiscardPile pile) {
        Card topCardFromPile = pile.getTopCard();
        if (!hasPlayableHand(topCardFromPile)) {
            String noCardToPlay = "You have no playable card in your hand";
            throw new RuntimeException(noCardToPlay);
        }

        for (Card card : hand) {
            if (card.matches(topCardFromPile)) {
                pile.addCard(card);
                hand.remove(card);
                return card;
            }
        }
        return null;
    }
}
