// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//         // Brute Approach
//         List<Integer> answer = new ArrayList();
//         int k = p.length();

//         char[] target = p.toCharArray();
//         Arrays.sort(target);

//         for(int i=0; i<=s.length()-k; i++) {
//             String window = s.substring(i, i+k);

//             char[] current = window.toCharArray();
//             Arrays.sort(current);

//             if(Arrays.equals(target, current)) {
//                 answer.add(i);
//             }
//         }
//         return answer;
//     }
// }









// Optimal Approach
class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        int n = s.length();
        int k = p.length();

        if (k > n) return ans;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            char ch = p.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = map.size();

        int i = 0;
        int j = 0;

        while (j < n) {
            // Expand window
            char ch = s.charAt(j);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    count--;
                }
            }
            // Window size becomes k
            if (j - i + 1 == k) {
                if (count == 0) {
                    ans.add(i);
                }
                // Remove outgoing character
                char out = s.charAt(i);
                if (map.containsKey(out)) {
                    if (map.get(out) == 0) {
                        count++;
                    }
                    map.put(out, map.get(out) + 1);
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}