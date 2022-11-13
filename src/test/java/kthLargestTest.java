import org.testng.Assert;
import org.testng.annotations.Test;

public class kthLargestTest {

//  Count Even Values In Array
    @Test

    public void testCountEvenValuesInArray() {
//        AAA
//        arrange
        int[] array = new int[]{4, 3, 7, 12, 5, 2, 9, 4, 12};
        int number = 3;

        int expectedResult = 9;

//        act
        int actualResult = new KthLargest().kthLargest(array, number);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


//  Count Even Values In Array 2
    @Test

    public void testCountEvenValuesInArray2() {
//        AAA
//        arrange
        int[] array = new int[]{4, 3, 7, 13, 5, 2, 9, 4, 12};
        int number = 1;

        int expectedResult = 13;

//        act
        int actualResult = new KthLargest().kthLargest(array, number);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


//  Count Even Values In if array = empty
    @Test

    public void testCountEvenValuesInArray_Empty() {
//        AAA
//        arrange
        int[] array = new int[]{};
        int number = 1;

        int expectedResult = 0;

//        act
        int actualResult = new KthLargest().kthLargest(array, number);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);
    }



//  Count Even Values In if number negative
    @Test

    public void testCountEvenValuesInArrayy_NumberNegative() {
//        AAA
//        arrange
        int[] array = new int[]{4, 3, 7, 13, 5, 2, 9, 4, 12};
        int number = -3;

        int expectedResult = 0;

//        act
        int actualResult = new KthLargest().kthLargest(array, number);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


//  Count Even Values In if number > array lenght
    @Test

    public void testCountEvenValuesInArrayy_NumberMoreArrayLenght() {
//        AAA
//        arrange
        int[] array = new int[]{4, 3, 7, 13, 5, 2, 9, 4, 12};
        int number = 15;

        int expectedResult = 0;

//        act
        int actualResult = new KthLargest().kthLargest(array, number);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


}
