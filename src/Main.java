public class Main {
    /*
    Create a function taking a positive integer as its parameter
     and returning a string containing the Roman Numeral representation of that integer.
    Modern Roman numerals are written by expressing each digit
    separately starting with the left most digit and skipping
    any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M,
    900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII.
    1666 uses each Roman symbol in descending order: MDCLXVI.
     */
    public String solution(int n) {
        String s = "";
        int th = n/1000;
        int ce = n/100 - th*10;
        int de = n/10 - th*100 - ce*10;
        int r = n%10;
        for (int i = 1; i <= th; i++)
            s = s + "M";
        if (ce == 9)
            s = s + "CM";
        else if (ce >= 5 && ce < 9)
        {
            s = s + "D";
            for (int i = 6; i <= ce; i++)
                s = s + "C";
        }
        else if (ce == 4)
            s = s + "CD";
        else
        {
            for (int i = 1; i <= ce; i++)
                s = s + "C";
        }

        if (de == 9)
            s = s + "XC";
        else if (de >= 5 && de < 9)
        {
            s = s + "L";
            for (int i = 6; i <= de; i++)
                s = s + "X";
        }
        else if (de == 4)
            s = s + "XL";
        else
        {
            for (int i = 1; i <= de; i++)
                s = s + "X";
        }

        if (r == 9)
            s = s + "IX";
        else if (r >= 5 && r < 9)
        {
            s = s + "V";
            for (int i = 6; i <= r; i++)
                s = s + "I";
        }
        else if (r == 4)
            s = s + "IV";
        else
        {
            for (int i = 1; i <= r; i++)
                s = s + "I";
        }
        return s;
    }
    public static void main(String[] args) {

    }
}