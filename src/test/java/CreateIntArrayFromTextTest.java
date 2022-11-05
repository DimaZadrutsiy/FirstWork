import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateIntArrayFromTextTest {

//  returns numbers in array
    @Test

    public void testCreateIntArrayFromText() {
//        AAA
//        arrange

        String number = "3 4 1 8 10 12.3";

        int[] expectedResult = {3, 4, 1, 8, 10, 12};

//        act
        int[] actualResult = new CreateArray_2_1().createIntArrayFromText(number);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }
}
