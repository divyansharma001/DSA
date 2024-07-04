public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(power(7));
    }

    static int power(int n){
        if(n<2){
            return 1;
        }
        return power(n-1)*2;

    }
}
