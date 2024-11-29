public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String lowerCaseString = "";
        for (int i = 0; i < str.length(); i++) 
        {
            if ((str.charAt(i) >= 65) && (str.charAt(i) <= 90)) lowerCaseString += (char)(str.charAt(i) + 32);
            else lowerCaseString += str.charAt(i);
        }
        return lowerCaseString;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        boolean isContain = false; 
        if (str2.equals("")) return true;
        int lastIndex = str1.length() - str2.length() + 1;
        if (lastIndex < 0) return isContain;
        for (int i = 0; i < lastIndex && !isContain; i++) {
            if (str2.charAt(0) == str1.charAt(i)) {
                isContain = true;
                for (int j = 0; j < str2.length() && isContain; j++) {
                    isContain = str2.charAt(j) == str1.charAt(i + j);
                }
            }
        }
        return isContain;
    }
}

