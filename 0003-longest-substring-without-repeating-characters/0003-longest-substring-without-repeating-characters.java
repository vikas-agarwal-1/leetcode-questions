class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Set<Character> set = new HashSet();

        // int i=0, j=0;
        // int maxi = 0;

        // while(j<s.length()) {
        //     char c = s.charAt(j);
        //     while(set.contains(c)) {
        //         set.remove(s.charAt(i));
        //         i++;
        //     }
        //     set.add(c);

        //     maxi = Math.max(maxi, j-i+1);
        //     j++;
        // }
        // return maxi;


        int res = 0;
        Set<Character> seen = new HashSet<>();
        int p = 0, q = 0;
        int n = s.length();
        if (n == 0) return 0;
        // 512341
        //  p   q
        while (q<n){
            if (!seen.contains(s.charAt(q))){
                seen.add(s.charAt(q));
                res = Math.max(q-p+1, res);
                q++;
            }else{
                while (p<q && s.charAt(p)!= s.charAt(q)){
                    seen.remove(s.charAt(p));
                    p++;
                }
                p++;
                q++;
            }
        }
        return res;
    }
}