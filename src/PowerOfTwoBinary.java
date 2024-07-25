public class PowerOfTwoBinary {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(ans(n));
    }

    static boolean ans(int n){
        if (n <= 0) {
            return false; // negative numbers and zero are not powers of two
        }
        return (n & (n - 1)) == 0;
    }
}
