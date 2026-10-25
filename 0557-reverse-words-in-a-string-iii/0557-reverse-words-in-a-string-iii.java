class Solution {
    public String reverse(String ss) {
        char cc [] = ss.toCharArray();
        int i=0, j = ss.length()-1;

        while(i<j) {
            char temp = cc[i];
            cc[i] = cc[j];
            cc[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(cc);
    }
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] s1 = s.split("\\s+");

        for(int i=0; i<s1.length; i++) {
            if(i > 0) {
                sb.append(" ");
            }
            
            String ss = s1[i];
            sb.append(reverse(ss));
        }
        return sb.toString();
    }
}