import java.util.Arrays;
import java.util.Scanner;

public class ObjArray {
    public static void main(String[] args) {
        String[] str = new String[5];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<str.length;i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
