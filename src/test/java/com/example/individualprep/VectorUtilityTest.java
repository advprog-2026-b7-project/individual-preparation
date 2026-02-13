package com.example.individualprep;

import com.example.individualprep.service.VectorUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VectorUtilityTest {
    @Test
    void testNorm() {
        VectorUtility util = new VectorUtility();
        double[] v1 = {3.0, 4.0};
        assertEquals(5.0, util.norm(v1), 0.0001);
    }

    @Test
    void testMultiply() {
        VectorUtility util = new VectorUtility();
        double[] input = {6.0, 7.0};
        double[] result = {12.0, 14.0};
        assertArrayEquals(result, util.multiply(input, 2));
    }
}