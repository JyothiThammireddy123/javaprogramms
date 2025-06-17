class Solution {
    public int reverse(int x) {
        long sum = 0;
        while (x != 0) {
            int y = x % 10;
            sum = sum * 10 + y;
            x = x / 10;
        }
        if (sum < Integer.MIN_VALUE || sum > Integer.MAX_VALUE) return 0;
        return Math.toIntExact(sum);
    }
}