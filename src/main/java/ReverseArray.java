public class ReverseArray {

    public int[] reverseArray(int[] array) {

        int turnOver = array.length;
        for (int i = 0; i < turnOver / 2; i++) {
            int temp = array[i];
            array[i] = array[turnOver - 1 - i];
            array[turnOver - 1 - i] = temp;
        }
        return array;
    }
}