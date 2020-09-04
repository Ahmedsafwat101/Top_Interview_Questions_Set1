package DynamicProgramming;

public class ClimbingStairs {
    //Recursion
    public static int steps(int n) {
        if (n == 0) return 1;
        if (n < 0) return 0;
        return steps(n - 1) + steps(n - 2);
    }

    //Memoization
    public static int stepsMemo(int n) {
        int[] memoize = new int[n + 1];
        return stepsMemoHelper(n, memoize);
    }

    public static int stepsMemoHelper(int n, int[] memoize) {
        if (n == 0) return 1;
        if (n < 0) return 0;
        if (memoize[n] == 0) {
            memoize[n] = stepsMemoHelper(n - 1, memoize) + stepsMemoHelper(n - 2, memoize);
        }
        return memoize[n];
    }

    //Tabulation
    public static int stepsTab(int n) {
        if (n == 1) return n;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
