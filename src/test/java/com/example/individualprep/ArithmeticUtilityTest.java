package com.example.individualprep;

import com.example.individualprep.service.ArithmeticUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticUtilityTest {
    @Test
    void testAdd() {
        ArithmeticUtility util = new ArithmeticUtility();
        assertEquals(5.5, util.add(2.0, 3.5), 0.0001);
    }

    @Test
    void testDivision(){
        ArithmeticUtility util = new ArithmeticUtility();
        assertEquals(2.5, util.divide(5.0, 2.0), 0.0001);
    }
    @Test
    void testMultiply(){
        ArithmeticUtility util = new ArithmeticUtility();
        assertEquals(42.0, util.multiply(6.0, 7.0), 0.001);
    }
    @Test
    void testSubtract() {
        ArithmeticUtility util = new ArithmeticUtility();
        assertEquals(-1.5, util.subtract(2.0, 3.5), 0.0001);
    }

    @Test
    void testExponent(){
        ArithmeticUtility util = new ArithmeticUtility();
        assertEquals(4.0, util.exponent(2.0,2), 0.0001);
        assertEquals(6.25, util.exponent(2.5,2), 0.0001);
    }
}
