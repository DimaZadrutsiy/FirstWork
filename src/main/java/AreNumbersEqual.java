public class AreNumbersEqual {

    public String areNumbersEqual (int number, int number2) {

        if (number == number2) {

            return "" + 0;
        } else if (number < number2) {

            return "" + -1;
        } else {

            return "" + 1;
        }
    }

}
