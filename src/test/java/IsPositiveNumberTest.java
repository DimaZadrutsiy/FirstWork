import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

// number > 0
    @Test

    public void testIsPositiveNumberMoreZero() {

//        AAA
//        arrange
        int number = 555;
        boolean expectedResult = true;

//        act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


// number = 0
    @Test

    public void testIsPositiveNumberEqualsZero() {

//        AAA
//        arrange
        int number = 0;
        boolean expectedResult = true;

//        act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


// number < 0
    @Test

    public void testIsPositiveNumberLessZero() {

//        AAA
//        arrange
        int number = -555;
        boolean expectedResult = false;

//        act
        boolean actualResult = new IsPositiveNumber().isPositiveNumber(number);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }




}
