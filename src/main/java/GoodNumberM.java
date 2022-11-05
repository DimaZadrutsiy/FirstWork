public class GoodNumberM {

    public String goodNumberM (int M) {

        if (M % 7 == 0 && M % 9 == 0) {

            return "Good Number";
        } else if (M % 9 == 0) {

            return "Bad Number";
        } else if (M % 11 == 0) {

            return "Poor Number";
        } else {

            return "" + -1;
        }
    }
}
