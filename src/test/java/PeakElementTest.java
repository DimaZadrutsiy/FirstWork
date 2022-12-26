import org.testng.Assert;
import org.testng.annotations.Test;

public class PeakElementTest {

//  returns peakArray
    @Test

    public void testPeakElement() {
//        AAA
//        arrange

        int[] array = new int[] {3, 2, 2, 7, 2, 2, 2, 9};
        int[] expectedResult = {3, 7, 9};

//        act
        int[] actualResult = new PeakElement().peakElement(array);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

}
