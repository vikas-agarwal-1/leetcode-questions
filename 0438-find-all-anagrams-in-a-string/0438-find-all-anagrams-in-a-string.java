class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> answer = new ArrayList();
        int k = p.length();

        char[] target = p.toCharArray();
        Arrays.sort(target);

        for(int i=0; i<=s.length()-k; i++) {
            String window = s.substring(i, i+k);

            char[] current = window.toCharArray();
            Arrays.sort(current);

            if(Arrays.equals(target, current)) {
                answer.add(i);
            }
        }
        return answer;
    }
}