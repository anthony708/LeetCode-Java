package Math;

/**
 * #326 Power of Three
 * Easy
 * @author zhuduan
 * 2018/11/16
 */

public class PowerofThree {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        double r = Math.log10(n) / Math.log10(3);
        if (r % 1 == 0) return true;
        else return false;
    }
}
