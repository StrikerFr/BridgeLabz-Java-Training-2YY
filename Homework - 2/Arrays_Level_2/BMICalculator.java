import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextDouble();
            height[i] = sc.nextDouble();
            double heightM = height[i] > 3 ? height[i] / 100.0 : height[i];
            bmi[i] = weight[i] / (heightM * heightM);
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Height: " + height[i] + ", Weight: " + weight[i] + ", BMI: " + bmi[i] + ", Status: " + status[i]);
        }
        sc.close();
    }
}
