/**
 * Created by wanmac on 6/22/16.
 */
import java.util.Scanner;

public class Try01 {
    public static void main(String[] args) {
        System.out.println("aaaaBbb".toLowerCase());
        function10();
    }

    public static void function10() {
        System.out.println("Type the country name");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String strLower = str.toLowerCase();
        if (strLower.equals("a") || strLower.equals("e") || strLower.equals("i") ||
                strLower.equals("o") || strLower.equals("u")) {
            System.out.println("It's vowel");
        } else {
            System.out.println("It's consonant");
        }

    }
}
