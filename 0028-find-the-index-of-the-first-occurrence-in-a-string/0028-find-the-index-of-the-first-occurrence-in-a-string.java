class Solution {
    public int strStr(String haystack, String needle) {
        // String[] s = needle.split(" \\s+");
        // for(int i=0; i<s.length(); i++) {
        //     char c = s.charAt(i);
        // }
        return haystack.indexOf(needle);
    }
}