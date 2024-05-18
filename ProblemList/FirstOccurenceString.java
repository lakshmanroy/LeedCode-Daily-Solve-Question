public class FirstOccurenceString {
    public static int strstr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String hsystack = "sadbutsad";
        String needle = "sad";

        System.out.println(strstr(hsystack, needle));
    }
}
