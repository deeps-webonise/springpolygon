package com.webonise.polygon;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("calculatingPerimeter")
public class PerimeterCalculator implements Polygon {

    @Override
    public void calculateResultAndPrint(int noOfSides, int lengthOfSides) {
        System.out.println(noOfSides * lengthOfSides);
    }
}
