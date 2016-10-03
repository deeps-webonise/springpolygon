package com.webonise.polygon;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("sumOfInternalAngles")
public class SumOfInternalAnglesCalculator implements Polygon {
    private static final int VALUE = 180;

    @Override
    public void calculateResultAndPrint(int noOfSides, int lengthOfSides) {
        System.out.println((VALUE * (noOfSides - 2)));
    }
}
