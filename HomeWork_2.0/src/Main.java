public class Main {

    public static void main(String[] args) {

        String str = "This is some text for regular expression 5 control and we have to calculate the number of letter e 2";
        String phoneNumber = "+421 123 456 789";

        LetterECount.letterECount(str);

        PhoneNumberChecking.phoneNumberChecking(phoneNumber);

        DeleteLettersAndSpaces.deleteLetterAndSpaces(str);
    }
}
