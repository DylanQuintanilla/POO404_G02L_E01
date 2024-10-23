package sv.edu.udb.util;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MatchTelephone {
    public static void main(String[] args) {
        compareTelephone("7123-4444");
    }

    public static boolean compareTelephone(String telephone) {
        String expresion = "(2|7)\\d{3}-\\d{4}";
        Pattern pat = Pattern.compile(expresion);
        Matcher mat = pat.matcher(telephone);
        if (mat.matches()) {
            System.out.println("SI");
            return TRUE;
        }
        return FALSE;
    }
}