import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArray {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);

            for(int row =0; row<3; row++){
                for(int col = 0; col<3; col++){
                arr[row][col]=in.nextInt();
                }
            }

//        for(int row =0; row<3; row++){
//            for(int col = 0; col<3; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

//        for(int row =0; row<3; row++){
//
//                System.out.println(Arrays.toString(arr[row]));
//
//        }


        //enhanced for loop

        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
