import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeOnTheRightTest {

//  Negative On The Right
    @Test

    public void testNegativeOnTheRight() {
//        AAA
//        arrange
        int[] array = new int[]{4, -3, 7, -12, 5, -2, 9, 4, 12};
        int[] expectedResult = {4, 7, 5, 9, 4, 12, -3, -12, -2};

//        act
        int[] actualResult = new NegativeOnTheRight().negativeOnTheRight(array);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


//  Negative On The Right
    @Test

    public void testNegativeOnTheRight2() {
//        AAA
//        arrange
        int[] array = new int[]{4, -3, 7, -12, 5, -2, 9, 4, -12};
        int[] expectedResult = {4, 7, 5, 9, 4, -3, -12, -2, -12};

//        act
        int[] actualResult = new NegativeOnTheRight().negativeOnTheRight(array);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


//  Negative On The Right Array = {}
    @Test

    public void testNegativeOnTheRightArrayEmpty_Negative() {
//        AAA
//        arrange
        int[] array = new int[]{};
        int[] expectedResult = {};

//        act
        int[] actualResult = new NegativeOnTheRight().negativeOnTheRight(array);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}
