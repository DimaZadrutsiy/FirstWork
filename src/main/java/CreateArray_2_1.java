public class CreateArray_2_1 {

    public int[] createIntArrayFromText(String number) {
        String [] numberArray = number.split(" ");
        int[] newArray = new int[numberArray.length];
        for (int i = 0; i < numberArray.length; i++){
            newArray[i] = (int) Double.parseDouble(numberArray[i]);
        }

        return newArray;
    }
}