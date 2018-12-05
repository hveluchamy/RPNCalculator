package Utilities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultWithDecimalPercisionUtilityTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getDecimalWithPercision() {
       assertEquals(1.5987453622,ResultWithDecimalPercisionUtility.getDecimalWithPercision(1.59874536217, 10));
    }
}