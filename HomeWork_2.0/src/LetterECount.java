public class LetterECount {

    public static void letterECount(String str) {

        int result = 0;

        for(int i = 0; i < str.length(); i++) {
            if(String.valueOf(str.charAt(i)).equals("e") || String.valueOf(str.charAt(i)).equals("E")) {
                result++;
            } else {
                continue;
            }
        }

        System.out.println(result);
    }

}
