package com.mikoto;


/*
    If a = b * q + r then GCD(a, b) = GCD(b, r)
    Proof. If k is any divisor of a and b then a = i * k and b = j * k where i and j are integers.
           Then k is common divisor of b and r because b is divided by k by the definition and r = a - b * q = (i - j * q) * k.
*/
public class GCD {

    public static int get(int p, int q) {

        while (q != 0) {
            int save = q;
            q = p % q;
            p = save;
        }

        return p;
    }


    public static int getRecursive(int p, int q) {
        return p < q ? calculateRecursive(p, q) : calculateRecursive(q, p);
    }

    private static int calculateRecursive(int p, int q) {
        return q == 0 ? p : calculateRecursive(q, p % q);
    }
}
