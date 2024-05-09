public class DeleteLettersAndSpaces {

    public static void deleteLetterAndSpaces(String str) {

        String regex = "[a-zA-Z ]+";

        System.out.println(str.replaceAll(regex, ""));
    }
}
