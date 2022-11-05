public class Intersection {

    public int[] intersection(int[] array, int[] array2) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array[i] == array2[j]) {
                    num++;
                }
            }
        }
        int[] array3 = new int[num];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array[i] == array2[j]) {
                    array3[k] = array[i];
                    k++;
                }
            }
        }

        return array3;
    }
}

