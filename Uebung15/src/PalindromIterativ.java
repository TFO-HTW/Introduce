public class PalindromIterativ implements Palindrom
{

    @Override
    public boolean istPalindrom(String Wort) {
        String reverse = "";
        String test = Wort.toLowerCase().strip();

        int leange = test.length();

        for (int i = leange - 1; i >= 0; i--) {
            reverse = reverse + test.charAt(i);

        }
        if (test.equals(reverse)) {
            return true;
        }
        else
        {
            return false;
        }
    }
}

