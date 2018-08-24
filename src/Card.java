import java.util.HashMap;

public class Card {

    private static final String SPADES = "S";
    private static final String CLUBS = "C";
    private static final String DIAMONDS = "D";
    private static final String HEARTS = "H";
    private HashMap<String, Integer> alphabeticCardValue = new HashMap<>();
    private String cardCode;

    public Card(String cardCode) throws IllegalArgumentException {
        this.cardCode = cardCode;

        String cardColor = this.cardCode.substring(0, 1).toUpperCase();
        String cardValue = cardCode.substring(1).toUpperCase();

        if (!cardColor.contentEquals(SPADES) &&
            !cardColor.contentEquals(CLUBS) &&
            !cardColor.contentEquals(DIAMONDS) &&
            !cardColor.contentEquals(HEARTS))
        {
            throw new IllegalArgumentException("card color isn't valid: " + cardColor);
        }
        alphabeticCardValue.put("J", 11);
        alphabeticCardValue.put("Q", 12);
        alphabeticCardValue.put("K", 13);
        alphabeticCardValue.put("A", 14);

        if (alphabeticCardValue.get(cardValue) == null) {
            Integer intCardValue = Integer.parseInt(cardValue);
            if (intCardValue > 10 || intCardValue < 2) {
                throw new IllegalArgumentException("card number isn't valid: " + intCardValue);
            }
        }
    }

    public int getValue() {
        String cardValue = cardCode.substring(1).toUpperCase();
        Integer intCardValue = alphabeticCardValue.get(cardValue);

        if (intCardValue == null) {
            intCardValue = Integer.parseInt(cardValue);
        }

        return intCardValue;
    }
}
