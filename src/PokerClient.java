import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokerClient {

    private ArrayList <Card> opponentCard = new ArrayList<>();

    public PokerClient(String p1, String p2, String p3, String p4, String p5) {
        this.opponentCard.add(new Card(p1));
        this.opponentCard.add(new Card(p2));
        this.opponentCard.add(new Card(p3));
        this.opponentCard.add(new Card(p4));
        this.opponentCard.add(new Card(p5));
    }

    public boolean highestCardIsMine(String p1, String p2, String p3, String p4, String p5) {
        Card hc = new Card("s2");
        List<Card> myCard = new ArrayList<Card>();
        myCard.add(new Card(p1));
        myCard.add(new Card(p2));
        myCard.add(new Card(p3));
        myCard.add(new Card(p4));
        myCard.add(new Card(p5));

        return
                opponentCard.stream()
                        .map(card -> card.getValue())
                        .max(Integer::compareTo).orElse(0)
                        >
                myCard.stream()
                        .map(card -> card.getValue())
                        .max(Integer::compareTo).orElse(0);
    }

}