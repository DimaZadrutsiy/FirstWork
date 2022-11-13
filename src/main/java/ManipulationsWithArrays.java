public class ManipulationsWithArrays {

    public int[] multiplуArrayByNumber(int[] array, int number) {
        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] * number;
            }
            return array;
        }
        return new int[0];
    }

    public double[] toDoubleArray(int[] array) {
        if (array != null && array.length > 0) {
            double[] arrayDouble = new double[array.length];
            for (int i = 0; i < array.length; i++) {
                arrayDouble[i] = array[i];
            }

            return arrayDouble;
        }

        return new double[0];
    }



    public int[] toIntArray(double[] array) {
        if (array != null && array.length > 0) {
            int[] arrayInt = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                arrayInt[i] = (int) array[i];
            }

            return arrayInt;
        }

        return new int[0];
    }




    public String[] toStringArray(int[] array) {
        if (array != null && array.length > 0) {
            String[] arrayString = new String[array.length];
            for (int i = 0; i < array.length; i++) {
                arrayString[i] = String.valueOf(array[i]);
            }

            return arrayString;
        }

        return new String[0];
    }



    public String[] toStringArrayDouble(double[] array) {
        if (array != null && array.length > 0) {
            String[] arrayString = new String[array.length];
            for (int i = 0; i < array.length; i++) {
                arrayString[i] = String.valueOf(array[i]);
            }

            return arrayString;
        }

        return new String[0];
    }



    public String areValuesGreaterThanNumber(int[] array, int number) {
        if (array != null && array.length > 0) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            if (sum > number) {
                return "true";
            } else {
                return "false";
            }
        }
     return "Error";
    }






}






