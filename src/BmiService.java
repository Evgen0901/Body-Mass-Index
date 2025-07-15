public class BmiService {
    public int calculate (double a, int b) {
        double mass = b / (a * a);
        int bodyMass = (int) mass;

        return bodyMass;
    }
}
