public class BmiService {
    public String calculate(int weight, int height) {
        double bmi = weight * 10_000 / Math.pow(height, 2);
        String bmiIndex = String.format("%.1f", bmi);
        return bmiIndex;
    }


}