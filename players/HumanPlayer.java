package players;

import cards.Card;
import piles.DiscardPile;

import java.util.Objects;
import java.util.Scanner;

public class HumanPlayer extends Player {
    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public Card playCard(DiscardPile pile) {
        Card chosenCardByPlayer;
        Card topCardFromPile = pile.getTopCard();

        if (!hasPlayableHand(topCardFromPile)) {
            String noCardToPlay = "You have no playable card in your hand";
            throw new RuntimeException(noCardToPlay);
        }

        displayHand();

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Choose a card to play: ");
            int userChoiceIndex = scanner.nextInt();

            if (userChoiceIndex >= 0 && userChoiceIndex < hand.size()) {
                chosenCardByPlayer = hand.get(userChoiceIndex);
            } else {
                System.out.println("Invalid choice. Please enter a valid index.");
                chosenCardByPlayer = null;
            }
        } while (!Objects.requireNonNull(chosenCardByPlayer).matches(topCardFromPile));

        System.out.println(getName() + " played: " + chosenCardByPlayer);
        return chosenCardByPlayer;
    }
}
