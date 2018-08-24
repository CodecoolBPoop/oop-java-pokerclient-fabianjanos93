import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class testCard {

    @Test
    void testCardThrowsIllegalArgumentColor(){
    assertThrows(IllegalArgumentException.class,() -> new Card("N3"));
    }

    @Test
    void testCardThrowsIllegalArgumentNumberLow(){
        assertThrows(IllegalArgumentException.class,() -> new Card("S1"));
    }

    @Test
    void testCardThrowsIllegalArgumentNumberHigh(){
        assertThrows(IllegalArgumentException.class,() -> new Card("S11"));
    }

    @Test
    void testCardThrowsIllegalArgumentInvalidFigure(){
        assertThrows(IllegalArgumentException.class,() -> new Card("SN"));
    }

    @Test
    void testCardCardValueLowEdge(){
        assertEquals(2,new Card("S2").getValue());
    }

    @Test
    void testCardCardValueHighEdge(){
        assertEquals(10,new Card("S10").getValue());
    }

    @Test
    void testCardCardValueAce(){
        assertEquals(14,new Card("SA").getValue());
    }

    @Test
    void testCardCardValueKing(){
        assertEquals(13,new Card("SK").getValue());
    }

    @Test
    void testCardCardValueQueen(){
        assertEquals(12,new Card("SQ").getValue());
    }

    @Test
    void testCardCardValueJumbo(){
        assertEquals(11,new Card("SJ").getValue());
    }


}
