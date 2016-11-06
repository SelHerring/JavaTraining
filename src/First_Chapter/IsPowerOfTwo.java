package First_Chapter;

/**
 * Created by Денис on 19.09.2016.
 */

//import java.lang.Integer;
//
//public class First_Chapter.IsPowerOfTwo {
//    public static void main(String[] args) {
//        boolean bc = Integer.bitCount(8)==1;
//        System.out.println(bc);
//    }
//}

//public class First_Chapter.IsPowerOfTwo {
//    public static void main(String[] args) {
//        int n = 8;
//        double res = ((n % (Math.log(n) / Math.log(2))));
//        int src = (int)res;
//        double res2 =  res - src;
//        boolean pt = (res2 == 0);
//        System.out.println(pt);
//    }
//}


public class IsPowerOfTwo {
    public static boolean PowerOfTwo(int n){
        return (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(PowerOfTwo(8));
    }
}
