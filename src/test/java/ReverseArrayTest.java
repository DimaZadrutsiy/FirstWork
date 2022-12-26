import org.testng.Assert;
import org.testng.annotations.Test;

public class ReverseArrayTest {

//  returns turnOver
    @Test

    public void testReverseArray() {
//        AAA
//        arrange

        int[] array = new int[] {2, 7, 3, 10, 5};
        int[] expectedResult = {5, 10, 3, 7, 2};

//        act
        int[] actualResult = new ReverseArray().reverseArray(array);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

}

