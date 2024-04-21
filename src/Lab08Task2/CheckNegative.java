package Lab08Task2;

public class CheckNegative {
    public CheckNegative(int n) throws NegativeException {
        if (n < 0) throw new NegativeException("Number is less than 0");
    }
}
