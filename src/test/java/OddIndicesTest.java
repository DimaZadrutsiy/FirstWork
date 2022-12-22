import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class OddIndicesTest {

//  array[] returns odd numbers
    @Test

    public void testOddIndices_HappyPath() {
//        AAA
//        arrange

        int[] array = new int[] {-45, 590, 234, 985, 12, 68};
        String[] expectedResult = {"590", "985", "68"};

//        act
        String[] actualResult = new OddIndices().oddIndices(array);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

//  array[] Negative
    @Test

    public void testOddIndices_Negative() {
//        AAA
//        arrange

        int[] array = new int[] {};
        String[] expectedResult = {};

//        act
        String[] actualResult = new OddIndices().oddIndices(array);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }





}
