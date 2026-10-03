class Solution {

    public double myPow(double x, int n) {
        return power(x, (long)n);
    }

    public double power(double x, long n) {

        // Base case
        if (n == 0) {
            return 1;
        }

        // Negative power
        if (n < 0) {
            return 1 / power(x, -n);
        }

        // Recursive work
        double smallans = power(x, n / 2);

        // Even power
        if (n % 2 == 0) {
            return smallans * smallans;
        }

        // Odd power
        else {
            return smallans * smallans * x;
        }
    }
}