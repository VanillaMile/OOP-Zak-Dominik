package Lab08Ex4;

public class DivBy0Test {
    public DivBy0Test(int n) throws DivBy0Exception {
        if (n == 0) throw new DivBy0Exception("Divided by 0");
    }
}
