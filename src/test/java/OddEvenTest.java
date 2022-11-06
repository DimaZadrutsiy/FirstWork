import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

// number < 0
    @Test

    public void testOddEvenLessZero() {

//        AAA
//        arrange
        int number = -345;
        String expectedResult = "Odd";

//        act
        String actualResult = new OddEven().oddEven(number);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


//    number = 0
    @Test

    public void testOddEvenEqualsZero() {

//        AAA
//        arrange
        int number = 0;
        String expectedResult = "Even";

//        act
        String actualResult = new OddEven().oddEven(number);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


//    number > 0
    @Test
    public void testOddEvenMoreZero() {

//        AAA
//        arrange
        int number = 222222;
        String expectedResult = "Even";

//        act
        String actualResult = new OddEven().oddEven(number);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }



}
