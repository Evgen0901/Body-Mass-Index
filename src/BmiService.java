public class BmiService {
    public int calculate (double height, int weight) {
        double formula = weight / (height * height);
        int bodyMass = (int) formula;

        return bodyMass;
    }
}
