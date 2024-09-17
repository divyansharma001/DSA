import java.sql.Array;
import java.util.ArrayList;

public class SubsetsInArrayList {

    public static void main(String[] args) {
      ArrayList<String> result =   sets("", "abc");
        System.out.println(result);
    }

    static ArrayList<String> sets(String p, String up){
        if(up.isEmpty()){
            ArrayList <String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = sets(p+ch, up.substring(1));
        ArrayList<String> right = sets(p, up.substring(1));
        left.addAll(right);
        return left;
    }

}
