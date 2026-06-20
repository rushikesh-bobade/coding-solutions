class Fancy {
    private static final long MOD = 1000000007L;

    private ArrayList<Long> seq;
    private long mul;
    private long add;

    public Fancy() {
        seq = new ArrayList<>();
        mul = 1;
        add = 0;
    }

    public void append(int val) {
        // Store inverse-transformed value
        long invMul = modInverse(mul);
        long stored = ((val - add + MOD) % MOD * invMul) % MOD;
        seq.add(stored);
    }

    public void addAll(int inc) {
        add = (add + inc) % MOD;
    }

    public void multAll(int m) {
        mul = (mul * m) % MOD;
        add = (add * m) % MOD;
    }

    public int getIndex(int idx) {
        if (idx >= seq.size()) return -1;

        long ans = (seq.get(idx) * mul + add) % MOD;
        return (int) ans;
    }

    private long modInverse(long x) {
        return pow(x, MOD - 2);
    }

    private long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1)
                res = (res * a) % MOD;

            a = (a * a) % MOD;
            b >>= 1;
        }
        return res;
    }
}