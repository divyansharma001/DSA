import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i] = input.nextInt();
        }
        System.out.println(java.util.Arrays.toString(arr));
    }


}
