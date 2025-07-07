import java.util.*;

public class DIstringMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); 
        int[] result = diStringMatch(s);

        System.out.println(Arrays.toString(result));
        sc.close();
    }

    public static int[] diStringMatch(String s) {
        int n = s.length();
        int low = 0, high = n;
        int[] ans = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                ans[i] = low++;
            } else {
                ans[i] = high--;
            }
        }

        ans[n] = low; 

        return ans;
    }
}
