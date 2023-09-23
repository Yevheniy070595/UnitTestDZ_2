package SumCalculator;

public class SumCalculator {
    public int sum(int n) {
        if ( n <= 0) {
            throw new IllegalArgumentException("n < 0!");
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
