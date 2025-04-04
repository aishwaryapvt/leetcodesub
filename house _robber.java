import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(",");
        int n = input.length;
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(input[i].trim());
        }
        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (n == 1) {
            System.out.println(nums[0]);
            return;
        }
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        System.out.println(dp[n - 1]);
    }
}