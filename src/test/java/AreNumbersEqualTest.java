import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {


//    number = number2
    @Test

    public void testAreNumbersEqual() {
//        AAA
//        arrange

        int number = 89;
        int number2 = 89;
        String expectedResult = "0";

//        act

        String actualResult = new AreNumbersEqual().areNumbersEqual(number,number2);

//       Assert

        Assert.assertEquals(actualResult, expectedResult);
    }


//    number < number2
    @Test

    public void testAreNumberLessNumber2() {
//        AAA
//        arrange

        int number = -89;
        int number2 = 89;
        String expectedResult = "-1";

//        act

        String actualResult = new AreNumbersEqual().areNumbersEqual(number,number2);

//       Assert

        Assert.assertEquals(actualResult, expectedResult);
    }


//    number > number2
    @Test

    public void testAreNumberMoreNumber2() {
//        AAA
//        arrange

        int number = 89;
        int number2 = -89;
        String expectedResult = "1";

//        act

        String actualResult = new AreNumbersEqual().areNumbersEqual(number,number2);

//       Assert

        Assert.assertEquals(actualResult, expectedResult);
    }

}
