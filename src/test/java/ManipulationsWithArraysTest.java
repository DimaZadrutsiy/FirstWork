import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {

// Array [i] multiply number
    @Test

    public void testMultiplуArrayByNumber() {

//        AAA
//        arrange
        int[] array = {1, 2, 3, 4, 5};
        int number = 3;
        int[] expectedResult = {3, 6, 9, 12, 15};

//        act
        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, number);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }



// Array [i] = 0 multiply number
    @Test

    public void testMultiplуArrayNullByNumber() {

//        AAA
//        arrange
        int[] array = {};
        int number = 3;
        int[] expectedResult = {};

//        act
        int[] actualResult = new ManipulationsWithArrays().multiplуArrayByNumber(array, number);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }



// int Array to Double Array
    @Test

    public void testToDoubleArray() {

//        AAA
//        arrange
        int[] array = {1, 2, 3, 4, 5};

        double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};

//        act
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }



// int Array equals zero to Double Array
    @Test

    public void testToDoubleArrayEqualsZero() {

//        AAA
//        arrange
        int[] array = {};

        double[] expectedResult = {};

//        act
        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


// int array to Int Array
    @Test

    public void testToIntArray() {

//        AAA
//        arrange
        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};

        int[] expectedResult = {1, 2, 3, 4, 5};

//        act
        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }



// int array to Int Array
    @Test

    public void testToIntArrayEqualsZero() {

//        AAA
//        arrange
        double[] array = {};

        int[] expectedResult = {};

//        act
        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }



// int array to String Array
    @Test

    public void testToStringArray() {

//        AAA
//        arrange
        int[] array = {1, 2, 3, 4, 5};

        String [] expectedResult = {"1", "2", "3", "4", "5"};

//        act
        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }



// double array to String Array
    @Test

    public void testToStringArrayDouble() {

//        AAA
//        arrange
        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};

        String [] expectedResult = {"1.1", "2.5", "3.7", "4.0", "5.5"};

//        act
        String[] actualResult = new ManipulationsWithArrays().toStringArrayDouble(array);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


// are Values Greater Than Number < array
    @Test

    public void testAreValuesGreaterThanNumber() {

//        AAA
//        arrange
        int[] array = {1, 2, 3, 4, 5};
        int number = 5;

        String expectedResult = "true";

//        act
        String actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


// are Values Greater Than Number > array
    @Test

    public void testAreValuesGreaterThanNumberMoreArray() {

//        AAA
//        arrange
        int[] array = {1, 2, 3, 4, 5};
        int number = 50;

        String expectedResult = "false";

//        act
        String actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


}
