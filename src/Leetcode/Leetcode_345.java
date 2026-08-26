package String_01.Leetcode;

class Leetcode_345 {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int left = 0;
        int right = a.length - 1;
        String vowels = "aeiouAEIOU";
        while (left < right) {
            if (vowels.indexOf(a[left]) == -1) {
                left++;
            }
            else if (vowels.indexOf(a[right]) == -1) {
                right--;
            }
            else {
                char temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
        return new String(a);
    }
}
