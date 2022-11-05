import org.testng.Assert;
import org.testng.annotations.Test;

public class IntersectionTest {



//  returns comparisonsTwoArrays
        @Test

        public void testIntersection() {
//        AAA
//        arrange

            int[] array = new int[] {1, 2, 4, 5, 89};
            int[] array2 = new int[] {8, 9, 4, 2};
            int[] expectedResult = {2, 4};

//        act
            int[] actualResult = new Intersection().intersection(array,array2);


//        Assert
            Assert.assertEquals(actualResult, expectedResult);

        }



//    returns comparisonsTwoArrays_2
    @Test

    public void testIntersection2() {
//        AAA
//        arrange

        int[] array = new int[] {1, 2, 4, 5, 8, 9};
        int[] array2 = new int[] {8, 9, -4, -2};
        int[] expectedResult = {8, 9};

//        act
        int[] actualResult = new Intersection().intersection(array,array2);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


//  returns comparisonsTwoArrays_3
    @Test

    public void testIntersection3() {
//        AAA
//        arrange

        int[] array = new int[] {1, 2, 4, 5, 89};
        int[] array2 = new int[] {8, 9, 45};
        int[] expectedResult = {};

//        act
        int[] actualResult = new Intersection().intersection(array,array2);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }





}






