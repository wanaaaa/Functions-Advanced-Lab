/**
 * Created by wanmac on 6/22/16.
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean result01 = function01(3);
        boolean result02 = function02("asdf", "asdf");
        System.out.println(result01);
        System.out.println(result02);
        function03("zzwzz");
        function04();
        function05(5, 4, 1988);
        function06("abcedfg");
        function07(11);
        function08(11, 17);
        function09();
        function10();
    }

    //#01
    public static boolean function01(int i) {
        if (i % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //#02
    public static boolean function02(String str1, String str2) {
        if (str1.equals(str2)) {
            return true;
        } else {
            return false;
        }
    }

    //#03
    public static void function03(String str) {
        int strLength = str.length();
        for (int i = 0; i < strLength; i++) {
            if (str.charAt(i) == 'w') {
                break;
            } else {
                System.out.println(str.charAt(i));
            }
        }
    } // End of #03

    //#04
    public static void function04() {
        double randomNum = Math.random()*100;
        if (randomNum > 50) {
            System.out.println(randomNum);
        } else {
            System.out.println(-1);
        }
    }

    //#05
    public static void function05(int mm, int dd, int yr) {
        String mmStr = String.valueOf(mm);
        String ddStr = String.valueOf(dd);
        String yrStr = String.valueOf(yr);

        System.out.println("day:"+ddStr+" "+ "month:"+ddStr+" "+"year:"+yrStr);
    }

    //#06
    public static void function06(String str) {
        String newWord = "";
        for (int i = 0; i < str.length(); i = i + 2){
            newWord = newWord + String.valueOf(str.charAt(i));
        }

        System.out.println(newWord);
    }

    //#07
    public static void function07(int num) {
        if (num > 5) {
            int i = 1;
            while (i <= num ) {
                if (i != 4) {
                    System.out.println(i);
                }
                i ++;
            }
        }
    }

    //#08
    public static void function08(int num1, int num2) {
        if ( num1 == num2) {
            System.out.println(num1 + num2 + 4);
        } else {
            System.out.println(num1 + num2 + 2);
        }
    }

    //#09
    public static void function09() {
        System.out.println("Type the country name");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String strLower = str.toLowerCase();
        switch (strLower) {
            case "us":
                System.out.println("United States");
                break;
            case  "de":
                System.out.println("Germany");
                break;
            case "hu":
                System.out.println("Hungary");
                break;
            default:
                System.out.println("Unknown");
        }
    }

    //#10
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
