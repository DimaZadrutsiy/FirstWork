import projectUtils.Utils;

public class MinMaxAve {

    public int[] minMaxAve(int[] array, int indexMin, int indexMax) {
        if (indexMin > 0 && indexMax < array.length && indexMax >= indexMin) {
            int[] selectedValues = new int[indexMax - indexMin + 1];
            int evenIndex = 0;
            for (int i = 0; i < array.length; i++) {
                if (i >= indexMin && i <= indexMax) {
                    selectedValues[evenIndex] = array[i];
                    evenIndex += 1;
                }
            }

            return new int[]{Utils.minNumber(selectedValues), Utils.maxNumber(selectedValues),
                    Utils.average(selectedValues)};
        }
        return new int[0];
    }

}

