import org.testng.Assert;
import org.testng.annotations.Test;

public class GoodNumberMTest {



// M % 9 == 0 && M % 7 == 0
    @Test

    public void testGoodNumberMMultiplyOf9And7() {

//        AAA
//        arrange
        int M = 63;
        String expectedResult = "Good Number";

//        act
        String actualResult = new GoodNumberM().goodNumberM(M);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


// M % 9 == 0 && M % 7 != 0
    @Test

    public void testGoodNumberMMultiplyOf9() {

//        AAA
//        arrange
        int M = 45;
        String expectedResult = "Bad Number";

//        act
        String actualResult = new GoodNumberM().goodNumberM(M);

//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }



// M % 11 == 0
    @Test

    public void testGoodNumberMMultiplyOf11() {

//        AAA
//        arrange
        int M = 22;
        String expectedResult = "Poor Number";

//        act
        String actualResult = new GoodNumberM().goodNumberM(M);

//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }



// M % 9 != 0 || M % 7 != 0 || M % 11 == 0
    @Test

    public void testGoodNumberMDoesNothing() {

//        AAA
//        arrange
        int M = 20;
        String expectedResult = "-1";

//        act
        String actualResult = new GoodNumberM().goodNumberM(M);

//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }




}
