import java.util.*;

public class MaxEventsAttended {
    public static int maxEvents(int[][] events) {
        Arrays.sort(events, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int i = 0, day = 1, count = 0;
        int n = events.length;

        int maxDay = 0;
        for (int[] e : events) {
            maxDay = Math.max(maxDay, e[1]);
        }

        while (day <= maxDay) {
            while (i < n && events[i][0] == day) {
                minHeap.offer(events[i][1]);
                i++;
            }

            while (!minHeap.isEmpty() && minHeap.peek() < day) {
                minHeap.poll();
            }

            if (!minHeap.isEmpty()) {
                minHeap.poll();
                count++;
            }

            day++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] events = {
            {1, 2},
            {2, 3},
            {3, 4},
            {1, 2}
        };

        System.out.println("Maximum events attended: " + maxEvents(events));
    }
}
