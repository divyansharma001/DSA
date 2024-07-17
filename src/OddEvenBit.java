public class OddEvenBit {
    public static void main(String[] args) {
        int number = 45;
        System.out.println(isOdd(number));
    }

    static boolean isOdd(int n){
        return (n&1)==1;
    }
}
