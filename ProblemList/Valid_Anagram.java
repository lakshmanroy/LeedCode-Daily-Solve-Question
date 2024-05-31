public class Valid_Anagram {
    public static boolean isValidAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[s.charAt(i) - 'a']--;
        }
        for (int n : arr) {
            if (n != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isValidAnagram(s, t));
    }
}
