package sword_point_offer;

public class Power {
    public static void main(String[] args) {
        System.out.println(Power(2, -3));
    }
    public static double Power(double base, int exponent) {
        double bas = 1.0;
        if(exponent >= 0) {
            for(int i = 1; i <= exponent;i++) {
                bas = bas * base;
            }
            return bas;
        }
        if(exponent < 0) {
            for(int i = exponent; i < 0;i++) {
                bas = bas * (1.0 / base);
            }
            return bas;
        }
        return bas;
    }
}
