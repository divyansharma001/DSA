public class UniqueElement {
    public static void main(String[] args) {
        int[] array = {2,4,6,3,4,2,3};
        System.out.println(ans(array));
    }

    static int ans(int[] array){
        int uniqueNumber = 0;
        for(int n: array){
            uniqueNumber ^= n;
        }
        return uniqueNumber;
    }
}
