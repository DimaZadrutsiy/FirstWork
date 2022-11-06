import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {

//  count Even Values In Array
    @Test

    public void testCountEvenValuesInArray() {
//        AAA
//        arrange
        int[] array = new int[]{1, 25, 12, 7, 10, 18, 88, 15, 11};
        int[] expectedResult = {12, 10, 18, 88};

//        act
        int[] actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


//  Count Odd Values In Array
    @Test

    public void testCountOddValuesInArray() {
//        AAA
//        arrange
        int[] array = new int[]{1, 25, 12, 7, 10, 18, 88, 15, 11};
        int[] expectedResult = {1, 25, 7, 15, 11};

//        act
        int[] actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);
    }



}
