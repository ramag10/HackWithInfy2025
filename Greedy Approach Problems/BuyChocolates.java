import java.util.*;

public class BuyChocolates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int money = sc.nextInt();
        Arrays.sort(prices);
        int minCost = prices[0] + prices[1];

        if(minCost <= money) {
            System.out.println(money - minCost);
        } else {
            System.out.println(money);
        }
        sc.close();
    }
}
