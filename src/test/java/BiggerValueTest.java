import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

//  maximum value
    @Test

    public void testBiggerValue() {
//        AAA
//        arrange
        int number = 3333;
        int number2 = 9999;
        String expectedResult = "9999";

//        act
        String actualResult = new BiggerValue().biggerValue(number,number2);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);
    }



//  they are equal
    @Test

    public void testBiggerValueTheyAreEqual() {
//        AAA
//        arrange
        int number = 5555;
        int number2 = 5555;
        String expectedResult = "5555";

//        act
        String actualResult = new BiggerValue().biggerValue(number,number2);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);
    }



}
