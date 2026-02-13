package com.example.individualprep;

import com.example.individualprep.service.VectorUtility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VectorUtilityTest {
    @Test
    void testAdd() {
        VectorUtility util = new VectorUtility();
        double[] v1 = {5.0, 7.0};
        double[] v2 = {2.0, 3.0};
        double[] result = util.add(v1, v2);
        assertArrayEquals(new double[]{7.0, 10.0}, result, 0.0001);
    }

}
