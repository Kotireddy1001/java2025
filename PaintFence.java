//Paint Fence (No more than 2 adjacent same colors)

public class PaintFence {
    public static int numWays(int n, int k) {
        if (n == 0) return 0;
        if (n == 1) return k;
        int same = k, diff = k * (k - 1);
        for (int i = 3; i <= n; i++) {
            int prevDiff = diff;
            diff = (same + diff) * (k - 1);
            same = prevDiff;
        }
        return same + diff;
    }

    public static void main(String[] args) {
        System.out.println("Ways to paint fence: " + numWays(3, 2));
    }
}
