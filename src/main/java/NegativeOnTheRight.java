public class NegativeOnTheRight {

    public int[] negativeOnTheRight(int[] array) {
        if (array != null && array.length > 0) {
            int[] array2 = new int[array.length];
            int negative = array.length - 1;
            int positive = 0;
            int j = 0;
            for (int i = array.length - 1; i >= 0; i--, j++) {
                if (array[i] < 0) {
                    array2[negative] = array[i];
                    negative--;
                }
                if (array[j] >= 0) {
                    array2[positive] = array[j];
                    positive++;
                }

            }

            return array2;
        }

        return new int[0];
    }
}
