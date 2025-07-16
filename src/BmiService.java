public class BmiService {
    public int calculate (double a, int b) {
        double formula = b / (a * a);
        int bodyMass = (int) formula;

        return bodyMass;
    }
}
