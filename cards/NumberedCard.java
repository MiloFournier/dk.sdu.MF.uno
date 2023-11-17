package cards;

import java.util.Objects;

public class NumberedCard extends Card {
    public static final int[] ALLOWED_NUMBERS = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private int number;

    // It is preferable to create this method in order to prevent
    // high-level nesting in the method NumberedCard.
    // This helps readability.
    private boolean isValidNumber(int number) {
        for (int allowedNumber : ALLOWED_NUMBERS) {
            if (number == allowedNumber) {
                return true;
            }
        }
        return false;
    }

    public NumberedCard(Color color, int number) {
        super(color);

        if (isValidNumber(number)) {
            this.number = number;
        } else {
            throw new IllegalArgumentException("Invalid number for NumberedCard");
        }
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return getColor() + "_" + getNumber();
    }

    @Override
    public boolean matches(Card other) {
        if (Objects.equals(this.getColor(), other.getColor())) {
            if (other instanceof NumberedCard) {
                return Objects.equals(this.getNumber(), ((NumberedCard)other).getNumber());
            }
        }
        return false;
    }
}
