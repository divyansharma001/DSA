public class RemoveRepeatedA {
    public static void main(String[] args) {
//        skip("", "baccdah");
        System.out.println(skip("adefaadfae"));
    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if(ch=='a'){
            skip(p, up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }
    }

    static String skip(String word){
        if(word.isEmpty()){
            return " ";
        }

        char ch = word.charAt(0);

        if(ch=='a'){
            return skip(word.substring(1));
        }else{
            return ch+skip(word.substring(1));
        }
    }


}
