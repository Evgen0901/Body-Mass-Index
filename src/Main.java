public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightInMeters = 1.87;
        int weightInKilograms = 98;
        int bodyMassIndex = service.calculate(heightInMeters, weightInKilograms);
        System.out.println(bodyMassIndex);

    }
}