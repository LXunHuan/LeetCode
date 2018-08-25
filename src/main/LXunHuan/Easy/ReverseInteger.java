
/**
 * Created by L on 2018/8/25.
 */
public class ReverseInteger {

    //transform to String, then reverse string
    //bad idea!
    public static int reverse1(int x) {

        if (x == 0) {
            return 0;
        }
        int abs = Math.abs(x);
        boolean hasZore = true;
        while (true){
            int temp = abs / 10;
            if (temp * 10 != abs)
                break;
            abs = temp;
        }
        String str = Integer.toString(abs);
        String str2 = new StringBuffer(str).reverse().toString();
        try {
            return x < 0 ? -Integer.parseInt(str2) :Integer.parseInt(str2);
        } catch (Exception e) {
            return 0;
        }

    }

    //better
    public static int reverse(int x) {
        int re = 0;
        while (x != 0) {
            int t = x % 10;
            int temp = re * 10 + t;
            if ((temp - t) / 10 != re) {
                return 0;
            }
            x = x / 10;
            re = temp;
        }
        return re;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-1234236469));
        System.out.println(reverse1(1234236469));
    }

}
