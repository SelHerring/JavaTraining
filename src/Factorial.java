import java.math.BigInteger;

/**
 * Created by Денис on 22.09.2016.
 */
public class Factorial {
    public static BigInteger factorial(int n) {
        BigInteger ret = BigInteger.ONE;
        for (int i = 1; i <= n; ++i) ret = ret.multiply(BigInteger.valueOf(i));
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
