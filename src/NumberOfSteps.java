public class NumberOfSteps {
    static int count = 0;
    static int numberOfSteps(int num) {
        if(num == 0){
            return count;
        }

        if(num%2==0){
            ++count;
            return numberOfSteps(num/2);
        }

        ++count;

        return numberOfSteps(num-1);

    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
}
