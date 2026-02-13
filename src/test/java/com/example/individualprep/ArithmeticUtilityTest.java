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
}
