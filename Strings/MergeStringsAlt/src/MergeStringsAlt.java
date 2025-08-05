public class MergeStringsAlt {
    public static void main(String[] args) {
        String a = "abc";
        String b = "xyz";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < a.length() || i < b.length(); i++) {
            if (i < a.length()) {
                result.append(a.charAt(i));
            }
            if (i < b.length()) {
                result.append(b.charAt(i));
            }
        }
        System.out.println(result.toString());
    }
}