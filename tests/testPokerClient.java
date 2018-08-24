import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testPokerClient {
    static PokerClient testPokerClient;

    @BeforeAll
    static void testCreatePokerClient(){
        testPokerClient = new PokerClient("s3","s4","s5","s9","sj");
    }

    @Test
    void testWinningHand(){
        assertTrue(testPokerClient.highestCardIsMine("c3","c4","c5","c9","c10"));
    }

    void testLosingHand(){
        assertFalse(testPokerClient.highestCardIsMine("c3","c4","c5","c9","cQ"));
    }

    void testLosingDraw(){
        assertFalse(testPokerClient.highestCardIsMine("c3","c4","c5","c9","cj"));
    }
}
