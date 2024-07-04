import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(10);
//        list.add(2);
//        list.add(40);
//        list.add(50);

        Scanner in = new Scanner(System.in);

        for(int i=0;i<3;i++){
            list.add(in.nextInt());
        }


            System.out.println(list);


    }
}
