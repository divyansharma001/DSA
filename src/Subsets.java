public class Subsets {

    public static void main(String[] args) {
        sets("", "abc");
    }

    static void sets(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        sets(p+ch, up.substring(1));
        sets(p, up.substring(1));

    }

}

