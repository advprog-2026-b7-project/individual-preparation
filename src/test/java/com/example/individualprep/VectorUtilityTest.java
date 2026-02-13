package com.example.individualprep;

import com.example.individualprep.service.VectorUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VectorUtilityTest {
    @Test
    void testAdd() {
        VectorUtility util = new VectorUtility();
        double[] v1 = {5.0, 7.0};
        double[] v2 = {2.0, 3.0};
        double[] result = util.add(v1, v2);
        assertArrayEquals(new double[]{7.0, 10.0}, result, 0.0001);
    }
  
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
    @Test
    void testSubtract() {
        VectorUtility util = new VectorUtility();
        double[] v1 = {5.0, 7.0};
        double[] v2 = {2.0, 3.0};
        double[] result = util.subtract(v1, v2);
        assertArrayEquals(new double[]{3.0, 4.0}, result, 0.0001);
    }
    @Test
    void testDotProduct() {
        VectorUtility util = new VectorUtility();
        double[] v1 = {5.0, 7.0};
        double[] v2 = {2.0, 3.0};
        double result = util.dotProduct(v1, v2);
        assertEquals(31.0, result, 0.0001);
    }
}

