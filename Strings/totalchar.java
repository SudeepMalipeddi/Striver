package Strings;

public class totalchar {
    public int lengthaftertransform(String s, int t) {

        StringBuilder sb = new StringBuilder(s);
        while (t > 0) {
            int i = 0;

            // while(i < sb.length()){
            // sb.replace(i, i+1, sb.charAt(i) == 'z' ? "a" :
            // String.valueOf((char)(sb.charAt(i) + 1)));
            // }

            while (i < sb.length()) {
                sb.replace(i, i + 1, sb.charAt(i) == 'z' ? "ab" : String.valueOf((char) (sb.charAt(i) + 1)));
                if (sb.charAt(i) == 'a') {
                    i += 2;
                } else {
                    i++;
                }
            }

            t--;
        }
        System.out.println(sb.toString());
        return sb.length();
    }

    public static void main(String[] args) {
        String s = "jqktcurgdvlibczdsvnsg";
        int t = 7517;

        totalchar obj = new totalchar();
        System.out.println(obj.lengthaftertransform(s, t));
    }
}
