public class OddEvenValuesInArray {

    public int[] countEvenValuesInArray(int[] array) {
        if (array != null && array.length > 0) {
            int num = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    num++;
                }
            }
            int[] arrayNew = new int[num];
            int n = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    arrayNew[n] += array[i];
                    n++;
                }
            }
            return arrayNew;
        }

        return new int[0];
    }



    public int[] countOddValuesInArray(int[] array) {
        if (array != null && array.length > 0) {
            int num = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    num++;
                }
            }
            int[] arrayNew = new int[num];
            int n = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    arrayNew[n] += array[i];
                    n++;
                }
            }
            return arrayNew;
        }

        return new int[0];
    }







}
