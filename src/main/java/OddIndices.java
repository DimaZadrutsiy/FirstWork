public class OddIndices {

    public String[] oddIndices(int[] array) {
        if (array.length > 0) {
            String[] odd = new String[array.length / 2];
            int evenIndex = 0;
            for (int i = 0; i < array.length; i++) {
                if (i % 2 != 0) {
                    odd[evenIndex] = String.valueOf(array[i]);
                    evenIndex += 1;
                }
            }

            return odd;
        }

        return new String[0];
    }

}
