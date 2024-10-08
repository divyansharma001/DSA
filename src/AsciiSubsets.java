import java.util.ArrayList;

public class AsciiSubsets {

    public static void main(String[] args) {
    ArrayList<String> ans = ascii("", "abc");
        System.out.println(ans);
    }

    static ArrayList<String> ascii(String p, String up){
        if (up.isEmpty()){
            ArrayList<String > list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> one = ascii(p+ch, up.substring(1));
        ArrayList<String> two = ascii(p, up.substring(1));
        ArrayList<String> three = ascii(p+(ch+0), up.substring(1));

        one.addAll(two);
        one.addAll(three);

        return one;

    }
}
