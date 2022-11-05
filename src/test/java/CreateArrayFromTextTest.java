import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayFromTextTest {

//  returns Split
    @Test

    public void testCreateArrayFromTextTest() {
//        AAA
//        arrange

        String text = "It was an apple pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

//        act
        String[] actualResult = new CreateArrayFromText().createArrayFromText(text);


//        Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

}
