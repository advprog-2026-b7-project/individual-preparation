package com.example.individualprep.service;

import org.springframework.stereotype.Service;

@Service
public class VectorUtility {
    
    public double[] add(double[] v1, double[] v2) {
        double[] result = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            result[i] = v1[i] + v2[i];
        }
        return result;
    }

    public double[] subtract(double[] v1, double[] v2) {
        double[] result = new double[v1.length];
        for (int i = 0; i < v1.length; i++) {
            result[i] = v1[i] - v2[i];
        }
        return result;
    }

    public double[] multiply(double[] v1, int x) {
        // TODO: Implement me properly!
        return new double[] { 0.0, 0.0, 0.0 };
    }
    
    public double dotProduct(double[] v1, double[] v2) {
        double dotProduct = 0;
        int length = v1.length;
        for (int index = 0; index < length; index++) {
            dotProduct += v1[index] + v2[index];
        }
        return dotProduct;
    }
    
    public double norm(double[] v1) {
        double sum = 0.0;
        for(double val : v1){
            sum += val * val;
        }
        return Math.sqrt(sum);
    }
}