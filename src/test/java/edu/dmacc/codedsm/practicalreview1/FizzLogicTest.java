package edu.dmacc.codedsm.practicalreview1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzLogicTest {
    private  FizzLogic classUnderTest;

    @Before
    public void setUp() throws Exception {
        classUnderTest = new FizzLogic();
    }

    @Test
    public void shouldPerformLogic() {
        Fizzable fizzable = new FizzLogic();
        String result = ((FizzLogic) fizzable).performLogic(32);
        assertEquals("Not fizzy", result);
    }
}