package Math;

public class sqrt {
    public static void main(String[] args) {
        int n = 10;
        int p = 4;
        System.out.println(binsqrt(n, p));
    }

    static double binsqrt(int n, int p) {
        int s = 0;
        int e = n;

        double root = 0.0;

        while (s <= e) {

            int m = s + (e - s) / 2;

            if (m * m == n) {
                return m;
            } else if (m * m > n) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        double incre = 0.1;

        for (int i = 0; i <= p; i++) {

            while (root * root <= n) {
                System.out.println(root);
                root += incre;

            }
            root -= incre;
            incre /= 10;
        }
        return root;
    }

}
