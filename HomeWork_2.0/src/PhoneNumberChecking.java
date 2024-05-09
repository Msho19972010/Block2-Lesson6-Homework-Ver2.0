public class PhoneNumberChecking {

    public static void phoneNumberChecking(String number) {

        String regex = "\\+[0-9]{3} [0-9 ]+";

        boolean result = number.matches(regex);
        System.out.println(result);
    }
}
