import java.util.Arrays;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int n = 3;
        int capacity = 50;

        double[][] items = {
            {60, 10},
            {100, 20},
            {120, 30}
        };

        Arrays.sort(items, (a, b) -> Double.compare(b[0] / b[1], a[0] / a[1]));

        double maxValue = 0.0;
        int remainingCapacity = capacity;

        for (int i = 0; i < n; i++) {
            double value = items[i][0];
            double weight = items[i][1];

            if (remainingCapacity >= weight) {
                maxValue += value;
                remainingCapacity -= weight;
            } else {
                maxValue += (value / weight) * remainingCapacity;
                break;
            }
        }

        System.out.printf("%.2f\n", maxValue);
    }
}