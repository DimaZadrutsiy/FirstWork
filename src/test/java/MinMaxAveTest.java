import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class MinMaxAveTest {

//  returns Min Max Ave
    @Test

    public void testMinMaxAve() {
//        AAA
//        arrange

        int indexMin = 2;
        int indexMax = 6;
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expectedResult = {3, 7, 5};

//        act
        int[] actualResult = new MinMaxAve().minMaxAve(array, indexMin, indexMax);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


//  returns Min Max Ave
    @Test

    public void testMinMaxAve1() {
//        AAA
//        arrange

        int indexMin = 5;
        int indexMax = 9;
        int[] array = new int[] {21, 18, 13, 14, 15, 28, 17, 18, 20, 35};
        int[] expectedResult = {17, 35, 23};

//        act
        int[] actualResult = new MinMaxAve().minMaxAve(array, indexMin, indexMax);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

//  returns Min Max Ave equals
    @Test

    public void testMinMaxAveEquals() {
//        AAA
//        arrange

        int indexMin = 2;
        int indexMax = 2;
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expectedResult = {3, 3, 3};

//        act
        int[] actualResult = new MinMaxAve().minMaxAve(array, indexMin, indexMax);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

//  returns Min Max Ave minus
    @Test

    public void testMinMaxAveMinus() {
//        AAA
//        arrange

        int indexMin = -2;
        int indexMax = 2;
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int[] expectedResult = {};

//        act
        int[] actualResult = new MinMaxAve().minMaxAve(array, indexMin, indexMax);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
}
