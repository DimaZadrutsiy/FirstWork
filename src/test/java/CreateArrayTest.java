import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {

//  returns numbers in array
    @Test

    public void testcreateArray() {
//        AAA
//        arrange

        int num = 10;
        int num2 = 0;
        int num3 = 9;
        int num4 = 5;
        int num5 = 1;

        int[] expectedResult = {10, 0, 9, 5, 1};

//        act
        int[] actualResult = new CreateArray().createArray(num, num2, num3, num4, num5);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }



//  returns numbers in Double array
        @Test

        public void testcreateArrayDouble() {
//        AAA
//        arrange

            double num = 1.1;
            double num2 = 2.5;
            double num3 = 3.7;
            double num4 = 4.0;
            double num5 = 5.5;

            double[] expectedResult = {1.1, 2.5, 3.7, 4.0, 5.5};

//        act
            double[] actualResult = new CreateArray().createDoubleArray(num, num2, num3, num4, num5);


//        Assert
            Assert.assertEquals(actualResult, expectedResult);

        }


    //  returns numbers in Double array
    @Test

    public void testcreateArrayString() {
//        AAA
//        arrange

        String num = "It";
        String num2 = "was";
        String num3 = "an";
        String num4 = "apple";
        String num5 = "pie";

        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

//        act
        String[] actualResult = new CreateArray().createStringArray(num, num2, num3, num4, num5);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


}
