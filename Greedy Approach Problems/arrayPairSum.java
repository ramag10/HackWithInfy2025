import java.util.*;

public class arrayPairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter even number of elements: ");
        int n = sc.nextInt();

        if (n % 2 != 0) {
            System.out.println("Error: Number of elements must be even.");
            sc.close();
            return;
        }

        int[] nums = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = getArrayPairSum(nums);
        System.out.println("Maximum sum of min values in pairs: " + result);
        sc.close(); 
    }

    public static int getArrayPairSum(int[] nums) {
        Arrays.sort(nums); 
        int sum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }
}
