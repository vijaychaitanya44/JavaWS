package wipro;

public class StringCount {
    public static void main(String[] args) {
        String str1 = "abcd abab cab";
        String str2 = "ab";

        int count = countSubstringOccurrences(str1, str2);
        System.out.println("Count: " + count);
    }

    public static int countSubstringOccurrences(String str1, String str2) {
        int count = 0;
        int index = str1.indexOf(str2);

        while (index != -1) {
            count++;
            index = str1.indexOf(str2, index + 1);
        }

        return count;
    }
}