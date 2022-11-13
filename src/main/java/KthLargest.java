import projectUtils.Utils;

public class KthLargest {

    public int kthLargest(int[] array, int number) {
        if (array.length > number && number >= 0) {
            new Utils().sortArray(array);
            number = array[array.length - number];
            return number;
        } else {
            return 0;
        }
    }
}
