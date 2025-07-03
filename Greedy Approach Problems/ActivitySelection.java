import java.util.*;

public class ActivitySelection {
    public static void main(String[] args) {
        int n = 6;
        int[][] activities = {
            {1, 3},
            {2, 4},
            {3, 5},
            {0, 6},
            {5, 7},
            {8, 9}
        };

        System.out.println("Original Activities (Start, End):");
        for (int[] activity : activities) {
            System.out.println(Arrays.toString(activity));
        }

        Arrays.sort(activities, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[1], b[1]);
            }
        });

        System.out.println("\nSorted Activities by End Time:");
        for (int[] activity : activities) {
            System.out.println(Arrays.toString(activity));
        }

        int count = 0;
        int lastEndTime = -1;

        System.out.println("\nSelected Activities:");
        for (int i = 0; i < n; i++) {
            int start = activities[i][0];
            int end = activities[i][1];

            if (start >= lastEndTime) {
                System.out.println("Selected: " + Arrays.toString(activities[i]));
                count++;
                lastEndTime = end;
            }
        }

        System.out.println("\nMaximum number of non-overlapping activities: " + count);
    }
}