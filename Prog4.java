public static void main(String[] args) {
long p;
    for (int i = 999; i >= 100; i--) {
        for (int j = 999; i >= 100; i--) {
            p= j * i;
            if (reverse(p)) {
                System.out.println(p);
                break;
            }
        }
    }
}


private static final boolean reverse(long v) {
    long r = 0;
    while (v != 0) {
        r *= 10;
        r += v % 10;
        v /= 10;
    }
    return (r == v);
