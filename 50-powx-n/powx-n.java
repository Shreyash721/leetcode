class Solution {
    public double myPow(double x, int n) {
        double pro = 1;
        long N = n;

        if (N < 0) {
            N = -N;
            x = 1 / x;
        }

        while (N > 0) {
            if (N % 2 == 1) {
                pro = pro * x;
            }
            x = x * x;       
            N = N / 2;        
        }

        return pro;
    }
}