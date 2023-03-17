public interface StringManipulationUtil {

    private static String reverseString(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }

    static String toUpper(String str)
    {
        String ustr = str.toUpperCase();
        return reverseString(ustr);
    }
    static String toLower(String str)
    {
        String lstr = str.toLowerCase();
        return reverseString(lstr);
    }

}


