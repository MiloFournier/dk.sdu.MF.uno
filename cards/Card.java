package cards;

public abstract class Card {
    private Color color;

    public Card(Color color) {
        this.color = color;
    }

    public String getColor() {
        return color.name();
    }

    protected void setColor(String color) {
        this.color = Color.valueOf(color.toUpperCase());
    }

    public abstract boolean matches(Card other);

    @Override
    public String toString() {
        return getColor();
    }
}
